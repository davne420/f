//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.03 at 11:02:58 PM CEST 
//


package ihe.pharm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Other.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Other"&gt;
 *   &lt;restriction base="{urn:ihe:pharm}cs"&gt;
 *     &lt;enumeration value="OTH"/&gt;
 *     &lt;enumeration value="NINF"/&gt;
 *     &lt;enumeration value="PINF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "Other")
@XmlEnum
public enum Other {

    OTH,
    NINF,
    PINF;

    public String value() {
        return name();
    }

    public static Other fromValue(String v) {
        return valueOf(v);
    }

}
