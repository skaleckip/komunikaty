
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Treść komunikatu K06
 * 
 * <p>Java class for TrescK06Typ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrescK06Typ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SymbolORZ" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="SymbolORS" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="TrybUstaleniaZbiegu" type="{http://zus.pl/schematy/b2bior/}TrybUstalaniaZbieguTyp"/&gt;
 *         &lt;element name="DaneWnioskodawcyERWD" type="{http://zus.pl/schematy/b2bior/}OsobaFizycznaZTelefonemTyp"/&gt;
 *         &lt;element name="PowodZmiany" type="{http://zus.pl/schematy/b2bior/}PowodZmianyZbieguTyp"/&gt;
 *         &lt;element name="SwiadczeniaPrzedZmianaUstalonegoZbiegu" type="{http://zus.pl/schematy/b2bior/}SwiadczeniaPozostajaceWZbieguTyp" minOccurs="0"/&gt;
 *         &lt;element name="SwiadczeniaPoZmianieUstalonegoZbiegu" type="{http://zus.pl/schematy/b2bior/}SwiadczeniaPozostajaceWZbieguTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrescK06Typ", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "symbolORZ",
    "symbolORS",
    "trybUstaleniaZbiegu",
    "daneWnioskodawcyERWD",
    "powodZmiany",
    "swiadczeniaPrzedZmianaUstalonegoZbiegu",
    "swiadczeniaPoZmianieUstalonegoZbiegu"
})
public class TrescK06Typ {

    @XmlElement(name = "SymbolORZ", required = true)
    protected String symbolORZ;
    @XmlElement(name = "SymbolORS", required = true)
    protected String symbolORS;
    @XmlElement(name = "TrybUstaleniaZbiegu", required = true)
    protected String trybUstaleniaZbiegu;
    @XmlElement(name = "DaneWnioskodawcyERWD", required = true)
    protected OsobaFizycznaZTelefonemTyp daneWnioskodawcyERWD;
    @XmlElement(name = "PowodZmiany", required = true)
    protected String powodZmiany;
    @XmlElement(name = "SwiadczeniaPrzedZmianaUstalonegoZbiegu")
    protected SwiadczeniaPozostajaceWZbieguTyp swiadczeniaPrzedZmianaUstalonegoZbiegu;
    @XmlElement(name = "SwiadczeniaPoZmianieUstalonegoZbiegu")
    protected SwiadczeniaPozostajaceWZbieguTyp swiadczeniaPoZmianieUstalonegoZbiegu;

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
     * Gets the value of the swiadczeniaPrzedZmianaUstalonegoZbiegu property.
     * 
     * @return
     *     possible object is
     *     {@link SwiadczeniaPozostajaceWZbieguTyp }
     *     
     */
    public SwiadczeniaPozostajaceWZbieguTyp getSwiadczeniaPrzedZmianaUstalonegoZbiegu() {
        return swiadczeniaPrzedZmianaUstalonegoZbiegu;
    }

    /**
     * Sets the value of the swiadczeniaPrzedZmianaUstalonegoZbiegu property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwiadczeniaPozostajaceWZbieguTyp }
     *     
     */
    public void setSwiadczeniaPrzedZmianaUstalonegoZbiegu(SwiadczeniaPozostajaceWZbieguTyp value) {
        this.swiadczeniaPrzedZmianaUstalonegoZbiegu = value;
    }

    /**
     * Gets the value of the swiadczeniaPoZmianieUstalonegoZbiegu property.
     * 
     * @return
     *     possible object is
     *     {@link SwiadczeniaPozostajaceWZbieguTyp }
     *     
     */
    public SwiadczeniaPozostajaceWZbieguTyp getSwiadczeniaPoZmianieUstalonegoZbiegu() {
        return swiadczeniaPoZmianieUstalonegoZbiegu;
    }

    /**
     * Sets the value of the swiadczeniaPoZmianieUstalonegoZbiegu property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwiadczeniaPozostajaceWZbieguTyp }
     *     
     */
    public void setSwiadczeniaPoZmianieUstalonegoZbiegu(SwiadczeniaPozostajaceWZbieguTyp value) {
        this.swiadczeniaPoZmianieUstalonegoZbiegu = value;
    }

}
