
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StayUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StayUnitType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Minutes"/&gt;
 *     &lt;enumeration value="Hours"/&gt;
 *     &lt;enumeration value="Days"/&gt;
 *     &lt;enumeration value="Months"/&gt;
 *     &lt;enumeration value="MON"/&gt;
 *     &lt;enumeration value="TUES"/&gt;
 *     &lt;enumeration value="WED"/&gt;
 *     &lt;enumeration value="THU"/&gt;
 *     &lt;enumeration value="FRI"/&gt;
 *     &lt;enumeration value="SAT"/&gt;
 *     &lt;enumeration value="SUN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StayUnitType")
@XmlEnum
public enum StayUnitType {


    /**
     * Stay restriction in minutes.
     * 
     */
    @XmlEnumValue("Minutes")
    MINUTES("Minutes"),

    /**
     * Stay restriction in hours.
     * 
     */
    @XmlEnumValue("Hours")
    HOURS("Hours"),

    /**
     * Stay restriction in days.
     * 
     */
    @XmlEnumValue("Days")
    DAYS("Days"),

    /**
     * Stay restriction in months.
     * 
     */
    @XmlEnumValue("Months")
    MONTHS("Months"),

    /**
     * Monday
     * 
     */
    MON("MON"),

    /**
     * Tuesday
     * 
     */
    TUES("TUES"),

    /**
     * Wednesday
     * 
     */
    WED("WED"),

    /**
     * Thursday
     * 
     */
    THU("THU"),

    /**
     * Friday
     * 
     */
    FRI("FRI"),

    /**
     * Saturday
     * 
     */
    SAT("SAT"),

    /**
     * Sunday
     * 
     */
    SUN("SUN");
    private final String value;

    StayUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StayUnitType fromValue(String v) {
        for (StayUnitType c: StayUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
