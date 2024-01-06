package ru.skillfactory.telegbot.tbot.dto;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD) //Указываем, как получить/передать значение в поля
@XmlRootElement(name = "GetCursOnDateXmlResult") //Корневой элемент, то есть внутри этого элемента должны быть элементы, которые указаны как поля
public class GetCursOnDateXmlResult {
    @XmlElementWrapper(name = "ValuteData", namespace = "")
    @XmlElement(name = "ValuteCursOnDate", namespace = "")
    private List<ValuteCursOnDate> valuteData = new ArrayList<>();

    public List<ValuteCursOnDate> getValuteData() {
        return valuteData;
    }

    public void setValuteData(List<ValuteCursOnDate> valuteData) {
        this.valuteData = valuteData;
    }
}
