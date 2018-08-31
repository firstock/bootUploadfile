package com.example.upfiledemo.oxmtest;

import javax.xml.bind.annotation.*;

/**
 * todo Project 자체에 있는 XmlAttribute 반영하기
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name= "Project", propOrder = {
        "modelVersion"
        ,"groupId"
        ,"artifactId"
        ,"version"
        ,"packaging"
        ,"name"
        ,"url"
        ,"properties"
        ,"dependencies"
})
@XmlRootElement(name = "project", namespace = "com.example.upfiledemo.oxm")
public class Project {
    @XmlElement(name="ModelVersion")
    protected String modelVersion;
    @XmlElement(name="GroupId")
    protected String groupId;
    @XmlElement(name="ArtifactId")
    protected String artifactId;
    @XmlElement(name="Version")
    protected String version;
    @XmlElement(name="Packaging")
    protected String packaging;
    @XmlElement(name="Name")
    protected String name;
    @XmlElement(name="Url")
    protected String url;
    @XmlElement(name="Properties")
    protected String properties;
    @XmlElement(name="Dependencies")
    protected String dependencies;


    public String getModelVersion() {
        return modelVersion;
    }

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getDependencies() {
        return dependencies;
    }

    public void setDependencies(String dependencies) {
        this.dependencies = dependencies;
    }
}

