package com.example.upfiledemo.oxmtest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Properties {
    @XmlElement(name = "ProjectbuildsourceEncoding")
    protected String projectbuildsourceEncoding;

    public String getProjectbuildsourceEncoding() {
        return projectbuildsourceEncoding;
    }

    public void setProjectbuildsourceEncoding(String projectbuildsourceEncoding) {
        this.projectbuildsourceEncoding = projectbuildsourceEncoding;
    }
}