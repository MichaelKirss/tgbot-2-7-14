package ru.skillfactory.telegbot.tbot.dto;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetCursOnDateXmlResult")
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
