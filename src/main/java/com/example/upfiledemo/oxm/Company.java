package com.example.upfiledemo.oxm;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

//@XmlRootElement(name="MESSAGE", namespace="com.example.upfiledemo" )
@XmlRootElement(name="MESSAGE")
@XmlAccessorType(XmlAccessType.NONE)
public class Company {
    @XmlElement(name="CODE", required = true)
    private List<Code> code;

    public Company() {
        code= new ArrayList<Code>();
    }

    public List<Code> getCode() {
        return code;
    }

    public void setCode(List<Code> code) {
        this.code = code;
    }
}