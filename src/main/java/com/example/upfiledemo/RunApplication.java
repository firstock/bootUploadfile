package com.example.upfiledemo;

import java.io.IOException;

import com.example.upfiledemo.oxm.AppConfig;
import com.example.upfiledemo.oxm.Code;
import com.example.upfiledemo.oxm.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.upfiledemo.oxm.Company;

public class RunApplication {
    private static final Logger LOG = LoggerFactory.getLogger(RunApplication.class);

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        Processor processor = ctx.getBean(Processor.class);

        //Perform Marshaling
        Company company1 = new Company(); //text가 없더라도 "" 라도 넣어줘야 태그가 생성된다


        Code code1= new Code();

        code1.setId("CM_MSG_CODE_0001");
        code1.setKor("HAS Url을 입력하세요.");
        code1.setEng("Please enter HAS Url.");
//        company1.getCode().add(code1); //todo error- xml depth_add list- why NOT ?? - Company에 제대로된 생성자??


        processor.objectToXML("country.xml", company1);

        LOG.info("Marshaling performed");
        //Perform UnMarshaling
        company1 = (Company)processor.xmlToObject("country.xml");
        LOG.info("After UnMarshaling Data is: untryName:"+company1.getCode());
    }
}