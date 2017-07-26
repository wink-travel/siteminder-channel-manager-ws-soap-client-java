
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USTimeZoneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="USTimeZoneType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "USTimeZoneType")
@XmlEnum
public enum USTimeZoneType {

    P,
    M,
    C,
    E;

    public String value() {
        return name();
    }

    public static USTimeZoneType fromValue(String v) {
        return valueOf(v);
    }

}
