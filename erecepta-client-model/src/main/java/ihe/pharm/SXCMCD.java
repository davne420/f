//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.03 at 11:02:58 PM CEST 
//


package ihe.pharm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SXCM_CD complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SXCM_CD"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ihe:pharm}CD"&gt;
 *       &lt;attribute name="operator" type="{urn:ihe:pharm}SetOperator" default="I" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SXCM_CD")
public class SXCMCD
        extends CD {

    @XmlAttribute(name = "operator")
    protected SetOperator operator;

    /**
     * Gets the value of the operator property.
     *
     * @return possible object is
     * {@link SetOperator }
     */
    public SetOperator getOperator() {
        if (operator == null) {
            return SetOperator.I;
        } else {
            return operator;
        }
    }

    /**
     * Sets the value of the operator property.
     *
     * @param value allowed object is
     *              {@link SetOperator }
     */
    public void setOperator(SetOperator value) {
        this.operator = value;
    }

}
