package com.example.upfiledemo.oxm;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
@Configuration
public class AppConfig {
    @Bean
    public Processor getHandler(){
        Processor handler= new Processor();
        handler.setMarshaller(getCastorMarshaller());
        handler.setUnmarshaller(getCastorMarshaller());
        return handler;
    }
    @Bean
    public Jaxb2Marshaller getCastorMarshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
//        jaxb2Marshaller.setPackagesToScan("com.concretepage.bean");
        jaxb2Marshaller.setPackagesToScan("com.example.upfiledemo.oxm");

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("jaxb.formatted.output", true);
        jaxb2Marshaller.setMarshallerProperties(map);
        return jaxb2Marshaller;
    }
}