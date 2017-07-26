
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DestinationLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DestinationLevelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Continent"/&gt;
 *     &lt;enumeration value="Country"/&gt;
 *     &lt;enumeration value="State"/&gt;
 *     &lt;enumeration value="Area"/&gt;
 *     &lt;enumeration value="SubArea"/&gt;
 *     &lt;enumeration value="Resort"/&gt;
 *     &lt;enumeration value="District"/&gt;
 *     &lt;enumeration value="Region"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DestinationLevelType")
@XmlEnum
public enum DestinationLevelType {

    @XmlEnumValue("Continent")
    CONTINENT("Continent"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("Area")
    AREA("Area"),
    @XmlEnumValue("SubArea")
    SUB_AREA("SubArea"),
    @XmlEnumValue("Resort")
    RESORT("Resort"),
    @XmlEnumValue("District")
    DISTRICT("District"),
    @XmlEnumValue("Region")
    REGION("Region");
    private final String value;

    DestinationLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DestinationLevelType fromValue(String v) {
        for (DestinationLevelType c: DestinationLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
