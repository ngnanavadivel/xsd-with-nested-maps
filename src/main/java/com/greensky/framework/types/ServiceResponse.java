//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 12:36:44 AM IST 
//


package com.greensky.framework.types;

import java.math.BigInteger;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.greensky.five9API.pojo.type_adapters.AngularErrorsTypeAdapter;


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
 *         &lt;element name="roundTripIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceResponseCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="angularErrors" type="{http://greensky.com/demo}AngularErrorsMapType"/&gt;
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
    "roundTripIdentifier",
    "serviceResponseCode",
    "angularErrors"
})
@XmlRootElement(name = "ServiceResponse")
public class ServiceResponse {

    @XmlElement(required = true)
    protected java.lang.String roundTripIdentifier;
    @XmlElement(required = true)
    protected BigInteger serviceResponseCode;
    @XmlElement(required = true, type = AngularErrorsMapType.class)
    @XmlJavaTypeAdapter(AngularErrorsTypeAdapter.class)
    protected Map<String, Map<String, FrameworkError>> angularErrors;

    /**
     * Gets the value of the roundTripIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getRoundTripIdentifier() {
        return roundTripIdentifier;
    }

    /**
     * Sets the value of the roundTripIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setRoundTripIdentifier(java.lang.String value) {
        this.roundTripIdentifier = value;
    }

    /**
     * Gets the value of the serviceResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServiceResponseCode() {
        return serviceResponseCode;
    }

    /**
     * Sets the value of the serviceResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServiceResponseCode(BigInteger value) {
        this.serviceResponseCode = value;
    }

    /**
     * Gets the value of the angularErrors property.
     * 
     * @return
     *     possible object is
     *     {@link AngularErrorsMapType }
     *     
     */
    public Map<String, Map<String, FrameworkError>> getAngularErrors() {
        return angularErrors;
    }

    /**
     * Sets the value of the angularErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngularErrorsMapType }
     *     
     */
    public void setAngularErrors(Map<String, Map<String, FrameworkError>> value) {
        this.angularErrors = value;
    }

}
