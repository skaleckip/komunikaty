
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Adres zamieszkania (bez państwa)
 * 
 * <p>Java class for AdresZamieszkaniaBezPanstwaTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdresZamieszkaniaBezPanstwaTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ulica" type="{http://zus.pl/schematy/b2bior/}UlicaTyp" minOccurs="0"/&gt;
 *         &lt;element name="NumerDomu" type="{http://zus.pl/schematy/b2bior/}NumerDomuLokaluTyp" minOccurs="0"/&gt;
 *         &lt;element name="NumerLokalu" type="{http://zus.pl/schematy/b2bior/}NumerDomuLokaluTyp" minOccurs="0"/&gt;
 *         &lt;element name="KodPocztowy" type="{http://zus.pl/schematy/b2bior/}KodPocztowyTyp" minOccurs="0"/&gt;
 *         &lt;element name="Miejscowosc" type="{http://zus.pl/schematy/b2bior/}MiejscowoscTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdresZamieszkaniaBezPanstwaTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "ulica",
    "numerDomu",
    "numerLokalu",
    "kodPocztowy",
    "miejscowosc"
})
@XmlSeeAlso({
    AdresZamieszkaniaTyp.class
})
public class AdresZamieszkaniaBezPanstwaTyp {

    @XmlElement(name = "Ulica")
    protected String ulica;
    @XmlElement(name = "NumerDomu")
    protected String numerDomu;
    @XmlElement(name = "NumerLokalu")
    protected String numerLokalu;
    @XmlElement(name = "KodPocztowy")
    protected String kodPocztowy;
    @XmlElement(name = "Miejscowosc", required = true)
    protected String miejscowosc;

    /**
     * Gets the value of the ulica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlica() {
        return ulica;
    }

    /**
     * Sets the value of the ulica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlica(String value) {
        this.ulica = value;
    }

    /**
     * Gets the value of the numerDomu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerDomu() {
        return numerDomu;
    }

    /**
     * Sets the value of the numerDomu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerDomu(String value) {
        this.numerDomu = value;
    }

    /**
     * Gets the value of the numerLokalu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerLokalu() {
        return numerLokalu;
    }

    /**
     * Sets the value of the numerLokalu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerLokalu(String value) {
        this.numerLokalu = value;
    }

    /**
     * Gets the value of the kodPocztowy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodPocztowy() {
        return kodPocztowy;
    }

    /**
     * Sets the value of the kodPocztowy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodPocztowy(String value) {
        this.kodPocztowy = value;
    }

    /**
     * Gets the value of the miejscowosc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiejscowosc() {
        return miejscowosc;
    }

    /**
     * Sets the value of the miejscowosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiejscowosc(String value) {
        this.miejscowosc = value;
    }

}
