package com.example.upfiledemo.storage;

import javax.xml.bind.annotation.*;

/**
 * @site http://www.doople.net:9999/InfiniA/ConfigManager/post/2
 * @site http://www.doople.net:9999/InfiniA/ConfigManager/post/4
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name= "ConfigType")
public class ConfigType {

    @XmlElement(name= "type")
    protected String type;
    @XmlElement(name= "process")
    protected String process;
    @XmlElement(name= "configKey")
    protected String configKey;
    @XmlAttribute(name= "port", required= true)
    protected int port;
    @XmlAttribute(name= "oamPort", required= true)
    protected int oamPort;
}

/*
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateType", propOrder = {
    "description",
    "state",
    "stateMachine"
})
public class StateType {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "State")
    protected List<StateType> state;
    @XmlElement(name = "StateMachine")
    protected List<StateMachineType> stateMachine;
    @XmlAttribute(name = "stateId", required = true)
    protected String stateId;
    @XmlAttribute(name = "stateName", required = true)
    protected String stateName;*/