
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Treść komunikatu K03
 * 
 * <p>Java class for TrescK03Typ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrescK03Typ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SymbolORZ" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="SymbolORS" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="TrybUstaleniaZbiegu" type="{http://zus.pl/schematy/b2bior/}TrybUstalaniaZbieguTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrescK03Typ", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "symbolORZ",
    "symbolORS",
    "trybUstaleniaZbiegu"
})
@XmlSeeAlso({
    TrescK03OdmowaTyp.class,
    TrescK03UstalenieTyp.class
})
public abstract class TrescK03Typ {

    @XmlElement(name = "SymbolORZ", required = true)
    protected String symbolORZ;
    @XmlElement(name = "SymbolORS", required = true)
    protected String symbolORS;
    @XmlElement(name = "TrybUstaleniaZbiegu", required = true)
    protected String trybUstaleniaZbiegu;

    /**
     * Gets the value of the symbolORZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolORZ() {
        return symbolORZ;
    }

    /**
     * Sets the value of the symbolORZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolORZ(String value) {
        this.symbolORZ = value;
    }

    /**
     * Gets the value of the symbolORS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolORS() {
        return symbolORS;
    }

    /**
     * Sets the value of the symbolORS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolORS(String value) {
        this.symbolORS = value;
    }

    /**
     * Gets the value of the trybUstaleniaZbiegu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrybUstaleniaZbiegu() {
        return trybUstaleniaZbiegu;
    }

    /**
     * Sets the value of the trybUstaleniaZbiegu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrybUstaleniaZbiegu(String value) {
        this.trybUstaleniaZbiegu = value;
    }

}
