
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PickUpDropOffType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PickUpDropOffType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Airport"/&gt;
 *     &lt;enumeration value="Property"/&gt;
 *     &lt;enumeration value="Resort"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PickUpDropOffType")
@XmlEnum
public enum PickUpDropOffType {

    @XmlEnumValue("Airport")
    AIRPORT("Airport"),
    @XmlEnumValue("Property")
    PROPERTY("Property"),
    @XmlEnumValue("Resort")
    RESORT("Resort");
    private final String value;

    PickUpDropOffType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PickUpDropOffType fromValue(String v) {
        for (PickUpDropOffType c: PickUpDropOffType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
