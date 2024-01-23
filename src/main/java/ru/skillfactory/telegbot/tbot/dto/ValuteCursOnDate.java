package ru.skillfactory.telegbot.tbot.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD) //Указываем, как получить/указать значение поля
@XmlRootElement(name = "ValuteCursOnDate") //Корневой элемент

public class ValuteCursOnDate {
    @XmlElement(name = "Vname") //Название XML тэга
    private String name;
    @XmlElement(name = "Vnom") //Название XML тэга
    private int nominal;
    @XmlElement(name = "Vcurs") //Название XML тэга
    private double course;
    @XmlElement(name = "Vcode") //Название XML тэга
    private String code;
    @XmlElement(name = "VchCode") //Название XML тэга
    private String chCode;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNominal() {
        return nominal;
    }
    public void setNominal(int nominal) {
        this.nominal = nominal;
    }
    public double getCourse() {
        return course;
    }
    public void setCourse(double course) {
        this.course = course;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getChCode() {
        return chCode;
    }
    public void setChCode(String chCode) {
        this.chCode = chCode;
    }
}
