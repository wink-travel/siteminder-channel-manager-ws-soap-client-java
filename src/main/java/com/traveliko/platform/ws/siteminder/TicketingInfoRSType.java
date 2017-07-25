
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 *  Minimum information about ticketing required to complete the booking transaction plus eTicket number.
 * 
 * <p>Java class for TicketingInfoRS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingInfoRS_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TicketingInfoType"&gt;
 *       &lt;attribute name="eTicketNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingInfoRS_Type")
@XmlSeeAlso({
    com.traveliko.platform.ws.siteminder.PricedItineraryType.TicketingInfo.class
})
public class TicketingInfoRSType
    extends TicketingInfoType
{

    @XmlAttribute(name = "eTicketNumber")
    protected String eTicketNumber;

    /**
     * Gets the value of the eTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETicketNumber() {
        return eTicketNumber;
    }

    /**
     * Sets the value of the eTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETicketNumber(String value) {
        this.eTicketNumber = value;
    }

}
