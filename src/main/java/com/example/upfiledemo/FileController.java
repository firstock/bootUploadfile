package com.example.upfiledemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.stream.Collectors;

import com.example.upfiledemo.storage.StorageFileNotFoundException;
import com.example.upfiledemo.storage.StorageService;

@Controller
public class FileController {
    private final StorageService storageService;
    private static Logger LOG= LoggerFactory.getLogger(FileController.class);

    @Autowired
    public FileController(StorageService storageService){ // interface's var ??
        this.storageService= storageService;
    }

    @GetMapping("/")
    public String listUploadedFiles(Model model) throws IOException {
        model.addAttribute("files", storageService.loadAll().map(
                path -> MvcUriComponentsBuilder.fromMethodName(FileController.class,
                        "serveFile", path.getFileName().toString()).build().toString())
                .collect(Collectors.toList())
        );
        return "uploadForm";
    }

    @PostMapping("/")
    public String handleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes){

        storageService.store(file);
        redirectAttributes.addFlashAttribute("message", "You successfully uploaded"
                + file.getOriginalFilename()+ "!");

        return "redirect:/";
    }

    /**
     *  except xml file (non-exactly)
     */
    @GetMapping("/files/{filename:.+\\.[^xml]+}")
    @ResponseBody
    public ResponseEntity<Resource> serveFile(@PathVariable String filename){
        Resource file= storageService.loadAsResource(filename);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\""+ file.getFilename()+ "\"").body(file);
    }



    //todo click> open xml file on browser> mod xml file
    @GetMapping("/files/{filename:.+\\.xml}")
    @ResponseBody
    public String modFile(@PathVariable String filename, Model model){
        LOG.info("run modFile");

//        model.addAttribute("files", storageService.loadAll().map(
//                path -> MvcUriComponentsBuilder.fromMethodName(FileController.class,
//                        "serveFile", path.getFileName().toString()).build().toString())
//                .collect(Collectors.toList())
//        );

        //todo how to show xmlFile??
        return "modForm";
    }

    @ExceptionHandler(StorageFileNotFoundException.class)
    public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc){
        return ResponseEntity.notFound().build();
    }
}
