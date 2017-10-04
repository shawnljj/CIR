//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.04 at 06:05:06 PM SGT 
//


package com.cir.models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}note"/>
 *         &lt;element ref="{}title"/>
 *         &lt;element ref="{}author"/>
 *         &lt;element ref="{}affiliation"/>
 *         &lt;element ref="{}address"/>
 *         &lt;element ref="{}email"/>
 *         &lt;element ref="{}sectionHeader"/>
 *         &lt;element ref="{}bodyText"/>
 *         &lt;element ref="{}subsectionHeader"/>
 *         &lt;element ref="{}page"/>
 *         &lt;element ref="{}reference"/>
 *         &lt;element ref="{}table"/>
 *         &lt;element ref="{}tableCaption"/>
 *         &lt;element ref="{}figure"/>
 *         &lt;element ref="{}phone"/>
 *         &lt;element ref="{}abstract"/>
 *         &lt;element ref="{}degree"/>
 *         &lt;element ref="{}pubnum"/>
 *         &lt;element ref="{}date"/>
 *         &lt;element ref="{}intro"/>
 *       &lt;/choice>
 *       &lt;attribute name="no" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="confidence" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "noteOrTitleOrAuthor"
})
@XmlRootElement(name = "variant")
public class Variant {

    @XmlElements({
        @XmlElement(name = "note", type = Note.class),
        @XmlElement(name = "title", type = Title.class),
        @XmlElement(name = "author", type = Author.class),
        @XmlElement(name = "affiliation", type = Affiliation.class),
        @XmlElement(name = "address", type = Address.class),
        @XmlElement(name = "email", type = Email.class),
        @XmlElement(name = "sectionHeader", type = SectionHeader.class),
        @XmlElement(name = "bodyText", type = BodyText.class),
        @XmlElement(name = "subsectionHeader", type = SubsectionHeader.class),
        @XmlElement(name = "page", type = Page.class),
        @XmlElement(name = "reference", type = Reference.class),
        @XmlElement(name = "table", type = Table.class),
        @XmlElement(name = "tableCaption", type = TableCaption.class),
        @XmlElement(name = "figure", type = Figure.class),
        @XmlElement(name = "phone", type = Phone.class),
        @XmlElement(name = "abstract", type = Abstract.class),
        @XmlElement(name = "degree", type = Degree.class),
        @XmlElement(name = "pubnum", type = Pubnum.class),
        @XmlElement(name = "date", type = Date.class),
        @XmlElement(name = "intro", type = Intro.class)
    })
    protected List<Object> noteOrTitleOrAuthor;
    @XmlAttribute(name = "no")
    protected Byte no;
    @XmlAttribute(name = "confidence")
    protected Float confidence;

    /**
     * Gets the value of the noteOrTitleOrAuthor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noteOrTitleOrAuthor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteOrTitleOrAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * {@link Title }
     * {@link Author }
     * {@link Affiliation }
     * {@link Address }
     * {@link Email }
     * {@link SectionHeader }
     * {@link BodyText }
     * {@link SubsectionHeader }
     * {@link Page }
     * {@link Reference }
     * {@link Table }
     * {@link TableCaption }
     * {@link Figure }
     * {@link Phone }
     * {@link Abstract }
     * {@link Degree }
     * {@link Pubnum }
     * {@link Date }
     * {@link Intro }
     * 
     * 
     */
    public List<Object> getNoteOrTitleOrAuthor() {
        if (noteOrTitleOrAuthor == null) {
            noteOrTitleOrAuthor = new ArrayList<Object>();
        }
        return this.noteOrTitleOrAuthor;
    }

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setNo(Byte value) {
        this.no = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConfidence(Float value) {
        this.confidence = value;
    }

}
