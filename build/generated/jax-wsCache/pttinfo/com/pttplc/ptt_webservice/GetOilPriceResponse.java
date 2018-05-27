
package com.pttplc.ptt_webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetOilPriceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getOilPriceResult"
})
@XmlRootElement(name = "GetOilPriceResponse")
public class GetOilPriceResponse {

    @XmlElement(name = "GetOilPriceResult")
    protected String getOilPriceResult;

    /**
     * Gets the value of the getOilPriceResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetOilPriceResult() {
        return getOilPriceResult;
    }

    /**
     * Sets the value of the getOilPriceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetOilPriceResult(String value) {
        this.getOilPriceResult = value;
    }

}
