package com.example.upfiledemo.oxmtest;


import javax.xml.bind.annotation.*;

@XmlRootElement(name = "dependency")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name= "Project", propOrder = {    "groupId"
        ,"artifactId"
        ,"version"
        ,"scope"
})
public class Dependency {

    @XmlElement(name="GroupId")
    protected String groupId;
    @XmlElement(name="ArtifactId")
    protected String artifactId;
    @XmlElement(name="Version")
    protected String version;
    @XmlElement(name="Scope")
    protected String scope;

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

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
