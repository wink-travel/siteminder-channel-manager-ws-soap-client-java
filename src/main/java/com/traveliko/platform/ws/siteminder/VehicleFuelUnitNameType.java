
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleFuelUnitNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleFuelUnitNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Gallon"/&gt;
 *     &lt;enumeration value="Liter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleFuelUnitNameType")
@XmlEnum
public enum VehicleFuelUnitNameType {

    @XmlEnumValue("Gallon")
    GALLON("Gallon"),
    @XmlEnumValue("Liter")
    LITER("Liter");
    private final String value;

    VehicleFuelUnitNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleFuelUnitNameType fromValue(String v) {
        for (VehicleFuelUnitNameType c: VehicleFuelUnitNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
