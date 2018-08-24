package com.example.upfiledemo.storage;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * @site http://www.doople.net:9999/InfiniA/ConfigManager/post/2
 * @site http://www.doople.net:9999/InfiniA/ConfigManager/post/4
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name= "ConfigType")
public class ConfigType {

    @Getter @Setter
    @XmlElement(name="Seq", required= true)
    protected int Seq;
    @Getter @Setter
    @XmlElement(name="Product")
    protected String Product;
//    @Getter @Setter
//    @XmlElement(name="ProductKey")
//    protected String ProductKey;
//    @Getter @Setter
//    @XmlElement(name="Status")
//    protected String Status;
//    @Getter @Setter
//    @XmlElement(name="IsReadOnly")
//    protected boolean IsReadOnly;
//    @Getter @Setter
//    @XmlElement(name="IsPair")
//    protected boolean IsPair;
//    @Getter @Setter
//    @XmlElement(name="IsNull")
//    protected boolean IsNull;
//    @Getter @Setter
//    @XmlElement(name="IsRestart")
//    protected boolean IsRestart;
//    @Getter @Setter
//    @XmlElement(name="IsNecessary")
//    protected boolean IsNecessary;
//    @Getter @Setter
//    @XmlElement(name="Type")
//    protected String Type;
//    @Getter @Setter
//    @XmlElement(name="ConfigKey")
//    protected String ConfigKey;
//    @Getter @Setter
//    @XmlElement(name="ConfigValue")
//    protected String ConfigValue;
//    @Getter @Setter
//    @XmlElement(name="Description")
//    protected String Description;
//    @Getter @Setter
//    @XmlElement(name="ConfigManagerIP")
//    protected String ConfigManagerIP;
//    @Getter @Setter
//    @XmlElement(name="CreateDate")
//    protected XMLGregorianCalendar CreateDate;
//    @Getter @Setter
//    @XmlElement(name="UpdateDate")
//    protected XMLGregorianCalendar UpdateDate;
}
