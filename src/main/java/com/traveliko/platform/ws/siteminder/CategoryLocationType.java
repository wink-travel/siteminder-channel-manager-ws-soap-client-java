
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CategoryLocationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Inside"/&gt;
 *     &lt;enumeration value="Outside"/&gt;
 *     &lt;enumeration value="Both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CategoryLocationType")
@XmlEnum
public enum CategoryLocationType {


    /**
     * No window.
     * 
     */
    @XmlEnumValue("Inside")
    INSIDE("Inside"),

    /**
     * On the outside of the ship generally has a window, porthole or balcony.
     * 
     */
    @XmlEnumValue("Outside")
    OUTSIDE("Outside"),

    /**
     * Used to identify that the category contains both inside and outside cabins.
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    CategoryLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryLocationType fromValue(String v) {
        for (CategoryLocationType c: CategoryLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
