package com.example.upfiledemo;

import com.example.upfiledemo.storage.StorageProperties;
import com.example.upfiledemo.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class UpfiledemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(UpfiledemoApplication.class, args);
    }

    CommandLineRunner init(StorageService storageService){
        return (args) -> {
          storageService.deleteAll();
          storageService.init();
        };
    }
}
