
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The VehicleResRSCoreType complex type identifies the core, or common, information that is associated with the reservation of a vehicle. 
 * 
 * <p>Java class for VehicleResRSCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleResRSCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehReservation" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationType"/&gt;
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleResRSCoreType", propOrder = {
    "vehReservation",
    "tpaExtensions"
})
public class VehicleResRSCoreType {

    @XmlElement(name = "VehReservation", required = true)
    protected VehicleReservationType vehReservation;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * Gets the value of the vehReservation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationType }
     *     
     */
    public VehicleReservationType getVehReservation() {
        return vehReservation;
    }

    /**
     * Sets the value of the vehReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationType }
     *     
     */
    public void setVehReservation(VehicleReservationType value) {
        this.vehReservation = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

}