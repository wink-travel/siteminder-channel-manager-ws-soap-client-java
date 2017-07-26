
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A full definition of a travel segment including supplemental price and facilities.
 * 
 * <p>Java class for PkgTravelSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PkgTravelSegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirSegment" type="{http://www.opentravel.org/OTA/2003/05}PkgAirSegmentType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PkgTravelSegment", propOrder = {
    "airSegment"
})
public class PkgTravelSegment {

    @XmlElement(name = "AirSegment", required = true)
    protected PkgAirSegmentType airSegment;

    /**
     * Gets the value of the airSegment property.
     * 
     * @return
     *     possible object is
     *     {@link PkgAirSegmentType }
     *     
     */
    public PkgAirSegmentType getAirSegment() {
        return airSegment;
    }

    /**
     * Sets the value of the airSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PkgAirSegmentType }
     *     
     */
    public void setAirSegment(PkgAirSegmentType value) {
        this.airSegment = value;
    }

}
