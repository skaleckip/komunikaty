
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Treść komunikatu K04
 * 
 * <p>Java class for TrescK04Typ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrescK04Typ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SymbolORZ" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="SymbolORS" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="DaneWnioskodawcyERWD" type="{http://zus.pl/schematy/b2bior/}OsobaFizycznaZTelefonemTyp"/&gt;
 *         &lt;element name="PowodZmiany" type="{http://zus.pl/schematy/b2bior/}PowodZmianySwiadczeniaTyp"/&gt;
 *         &lt;element name="SwiadczeniaPozostajaceWZbiegu" type="{http://zus.pl/schematy/b2bior/}SwiadczeniaPozostajaceWZbieguTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrescK04Typ", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "symbolORZ",
    "symbolORS",
    "daneWnioskodawcyERWD",
    "powodZmiany",
    "swiadczeniaPozostajaceWZbiegu"
})
public class TrescK04Typ {

    @XmlElement(name = "SymbolORZ", required = true)
    protected String symbolORZ;
    @XmlElement(name = "SymbolORS", required = true)
    protected String symbolORS;
    @XmlElement(name = "DaneWnioskodawcyERWD", required = true)
    protected OsobaFizycznaZTelefonemTyp daneWnioskodawcyERWD;
    @XmlElement(name = "PowodZmiany", required = true)
    protected String powodZmiany;
    @XmlElement(name = "SwiadczeniaPozostajaceWZbiegu")
    protected SwiadczeniaPozostajaceWZbieguTyp swiadczeniaPozostajaceWZbiegu;

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
     * Gets the value of the daneWnioskodawcyERWD property.
     * 
     * @return
     *     possible object is
     *     {@link OsobaFizycznaZTelefonemTyp }
     *     
     */
    public OsobaFizycznaZTelefonemTyp getDaneWnioskodawcyERWD() {
        return daneWnioskodawcyERWD;
    }

    /**
     * Sets the value of the daneWnioskodawcyERWD property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobaFizycznaZTelefonemTyp }
     *     
     */
    public void setDaneWnioskodawcyERWD(OsobaFizycznaZTelefonemTyp value) {
        this.daneWnioskodawcyERWD = value;
    }

    /**
     * Gets the value of the powodZmiany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowodZmiany() {
        return powodZmiany;
    }

    /**
     * Sets the value of the powodZmiany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowodZmiany(String value) {
        this.powodZmiany = value;
    }

    /**
     * Gets the value of the swiadczeniaPozostajaceWZbiegu property.
     * 
     * @return
     *     possible object is
     *     {@link SwiadczeniaPozostajaceWZbieguTyp }
     *     
     */
    public SwiadczeniaPozostajaceWZbieguTyp getSwiadczeniaPozostajaceWZbiegu() {
        return swiadczeniaPozostajaceWZbiegu;
    }

    /**
     * Sets the value of the swiadczeniaPozostajaceWZbiegu property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwiadczeniaPozostajaceWZbieguTyp }
     *     
     */
    public void setSwiadczeniaPozostajaceWZbiegu(SwiadczeniaPozostajaceWZbieguTyp value) {
        this.swiadczeniaPozostajaceWZbiegu = value;
    }

}
