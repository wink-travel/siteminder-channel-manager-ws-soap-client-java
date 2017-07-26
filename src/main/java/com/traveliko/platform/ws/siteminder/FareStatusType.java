
package com.traveliko.platform.ws.siteminder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FareStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="constructed"/&gt;
 *     &lt;enumeration value="published"/&gt;
 *     &lt;enumeration value="created"/&gt;
 *     &lt;enumeration value="fareByRule"/&gt;
 *     &lt;enumeration value="fareByRulePrivate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FareStatusType")
@XmlEnum
public enum FareStatusType {

    @XmlEnumValue("constructed")
    CONSTRUCTED("constructed"),
    @XmlEnumValue("published")
    PUBLISHED("published"),
    @XmlEnumValue("created")
    CREATED("created"),

    /**
     * Specifies that the fare was built based on rules.
     * 
     * 
     */
    @XmlEnumValue("fareByRule")
    FARE_BY_RULE("fareByRule"),

    /**
     * The private fare was built by rules.
     * 
     */
    @XmlEnumValue("fareByRulePrivate")
    FARE_BY_RULE_PRIVATE("fareByRulePrivate");
    private final String value;

    FareStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareStatusType fromValue(String v) {
        for (FareStatusType c: FareStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
