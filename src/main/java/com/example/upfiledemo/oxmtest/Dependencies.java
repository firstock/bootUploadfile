package com.example.upfiledemo.oxmtest;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Dependencies {
    @XmlElement(name="Dependency")
    protected String dependency;

    public String getDependency() {
        return dependency;
    }

    public void setDependency(String dependency) {
        this.dependency = dependency;
    }
}
