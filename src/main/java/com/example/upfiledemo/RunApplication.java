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
        Company company = new Company(){}; // parent
        Code code1= new Code(); // child1
        final String CODE_ID= "CM_MSG_CODE_000";
        int codeIdNum= 1;

        code1.setId(CODE_ID + codeIdNum++);
        code1.setKor("HAS Url을 입력하세요.");
        code1.setEng("Please enter HAS Url.");
        company.getCode().add(code1);

        Code code2= new Code(); // child1

        code2.setId(CODE_ID + codeIdNum++);
        code2.setKor("입력한 Url 주소가 정상적이지 않습니다.다시 입력하세요.");
        code2.setEng("The Url address you entered is not correct. Please enter it again.");
        company.getCode().add(code2);

        processor.objectToXML("country.xml", company);

        LOG.info("Marshaling performed");
        //Perform UnMarshaling
        company = (Company)processor.xmlToObject("country.xml");
        LOG.info("After UnMarshaling Data is: untryName:"+company.getCode());
    }
}