package ru.skillfactory.telegbot.tbot.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GetCursOnDateXMLResponse", namespace = "http://web.cbr.ru/")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetCursOnDateXmlResponse {
    @XmlElement(name = "GetCursOnDateXMLResult", namespace = "http://web.cbr.ru/") //Имя xml элемента и его пространство имен
    private GetCursOnDateXmlResult getCursOnDateXmlResult;
    public GetCursOnDateXmlResult getGetCursOnDateXmlResult() {
        return getCursOnDateXmlResult;
    }
    public void setGetCursOnDateXmlResult(GetCursOnDateXmlResult getCursOnDateXmlResult) {
        this.getCursOnDateXmlResult = getCursOnDateXmlResult;
    }
}
