//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.10.06 at 05:39:10 PM SGT
//


package com.cir.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import com.cir.models.basepaper.Variant;
import com.cir.models.citation.CitationList;


/**
 * <p>Java class for algorithm complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="algorithm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variant" type="{}variantType" minOccurs="0"/>
 *         &lt;element name="citationList" type="{}citationListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "algorithm", propOrder = {
    "variant",
    "citationList"
})
public class Algorithm {

    protected Variant variant;
    protected CitationList citationList;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "version")
    protected Integer version;

    /**
     * Gets the value of the variant property.
     *
     * @return
     *     possible object is
     *     {@link Variant }
     *
     */
    public Variant getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     *
     * @param value
     *     allowed object is
     *     {@link Variant }
     *
     */
    public void setVariant(Variant value) {
        this.variant = value;
    }

    /**
     * Gets the value of the citationList property.
     *
     * @return
     *     possible object is
     *     {@link CitationList }
     *
     */
    public CitationList getCitationList() {
        return citationList;
    }

    /**
     * Sets the value of the citationList property.
     *
     * @param value
     *     allowed object is
     *     {@link CitationList }
     *
     */
    public void setCitationList(CitationList value) {
        this.citationList = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

}
