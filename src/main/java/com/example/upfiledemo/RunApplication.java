package com.example.upfiledemo;

import java.io.IOException;

import com.example.upfiledemo.oxm.AppConfig;
import com.example.upfiledemo.oxm.Processor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.upfiledemo.oxm.Company;

public class RunApplication {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        Processor processor = ctx.getBean(Processor.class);
        //Perform Marshaling
        Company company = new Company();
        company.setId(100);
        company.setCompanyName("XYZ");
        company.setCeoName("ABCD");
        company.setNoEmp(100);
        processor.objectToXML("country.xml", company);
        System.out.println("Marshaling performed");
        //Perform UnMarshaling
        company = (Company)processor.xmlToObject("country.xml");
        System.out.println("After UnMarshaling Data is: id:"+ company.getId()+", CountryName:"+company.getCompanyName());
    }
}