
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Treść komunikatu K00
 * 
 * <p>Java class for TrescK00Typ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrescK00Typ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SymbolORZ" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="SymbolORS" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="DaneEwidencyjneWnioskuERWD" type="{http://zus.pl/schematy/b2bior/}DaneEwidencyjneWnioskuTyp"/&gt;
 *         &lt;element name="WniosekERWD" type="{http://zus.pl/schematy/b2bior/}WniosekERWDTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrescK00Typ", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "symbolORZ",
    "symbolORS",
    "daneEwidencyjneWnioskuERWD",
    "wniosekERWD"
})
public class TrescK00Typ {

    @XmlElement(name = "SymbolORZ", required = true)
    protected String symbolORZ;
    @XmlElement(name = "SymbolORS", required = true)
    protected String symbolORS;
    @XmlElement(name = "DaneEwidencyjneWnioskuERWD", required = true)
    protected DaneEwidencyjneWnioskuTyp daneEwidencyjneWnioskuERWD;
    @XmlElement(name = "WniosekERWD", required = true)
    protected WniosekERWDTyp wniosekERWD;

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
     * Gets the value of the daneEwidencyjneWnioskuERWD property.
     * 
     * @return
     *     possible object is
     *     {@link DaneEwidencyjneWnioskuTyp }
     *     
     */
    public DaneEwidencyjneWnioskuTyp getDaneEwidencyjneWnioskuERWD() {
        return daneEwidencyjneWnioskuERWD;
    }

    /**
     * Sets the value of the daneEwidencyjneWnioskuERWD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaneEwidencyjneWnioskuTyp }
     *     
     */
    public void setDaneEwidencyjneWnioskuERWD(DaneEwidencyjneWnioskuTyp value) {
        this.daneEwidencyjneWnioskuERWD = value;
    }

    /**
     * Gets the value of the wniosekERWD property.
     * 
     * @return
     *     possible object is
     *     {@link WniosekERWDTyp }
     *     
     */
    public WniosekERWDTyp getWniosekERWD() {
        return wniosekERWD;
    }

    /**
     * Sets the value of the wniosekERWD property.
     * 
     * @param value
     *     allowed object is
     *     {@link WniosekERWDTyp }
     *     
     */
    public void setWniosekERWD(WniosekERWDTyp value) {
        this.wniosekERWD = value;
    }

}
