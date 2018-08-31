package com.example.upfiledemo;

import java.io.IOException;

import com.example.upfiledemo.oxmtest.Project;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.upfiledemo.oxmtest.MarshallProcessor;
import com.example.upfiledemo.oxmtest.MarshallHandler;

//todo error-
public class TestApplication {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MarshallHandler.class);
        ctx.refresh();
        MarshallProcessor processor = ctx.getBean(MarshallProcessor.class);
        //Perform Marshaling
        Project project = new Project();
        project.setModelVersion("100.2.1");
        project.setGroupId("groupId2");
        project.setArtifactId("art2");
        project.setVersion("50.1.0.5");
        processor.objectToXML("pomFromObj.xml", project);
        System.out.println("Marshaling performed");
        //Perform UnMarshaling
        project = (Project)processor.xmlToObject("country.xml");
        System.out.println("After UnMarshaling Data is: id:"+ project.getModelVersion()+", CountryName:"+project.getGroupId());
    }
}