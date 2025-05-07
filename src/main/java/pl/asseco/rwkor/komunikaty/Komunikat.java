
package pl.asseco.rwkor.komunikaty;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlMixed;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Komunikat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Komunikat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="kodowanie" type="{http://www.w3.org/2001/XMLSchema}string" fixed="base64" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Komunikat", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "content"
})
public class Komunikat {

    @XmlMixed
    protected List<String> content;
    @XmlAttribute(name = "kodowanie")
    protected String kodowanie;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContent() {
        if (content == null) {
            content = new ArrayList<String>();
        }
        return this.content;
    }

    /**
     * Gets the value of the kodowanie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodowanie() {
        if (kodowanie == null) {
            return "base64";
        } else {
            return kodowanie;
        }
    }

    /**
     * Sets the value of the kodowanie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodowanie(String value) {
        this.kodowanie = value;
    }

}
