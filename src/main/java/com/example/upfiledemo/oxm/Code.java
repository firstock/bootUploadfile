package com.example.upfiledemo.oxm;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="CODE")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Code", propOrder = { //name: 멤버변수명 그대로
        "kor",
        "eng"
})
public class Code {
    @XmlAttribute(name="ID")
    private String id;
    @XmlElement(name="KOR")
    private String kor;
    @XmlElement(name="ENG")
    private String eng;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKor() {
        return kor;
    }

    public void setKor(String kor) {
        this.kor = kor;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

}
