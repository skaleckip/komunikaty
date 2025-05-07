
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Wnioskodawca zaznaczył we wniosku ERWD pole 'za granicę – na rachunek bankowy (oprócz USA)' 
 * 
 * <p>Java class for NaRachunekZagranicaTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NaRachunekZagranicaTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zaznaczono"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://zus.pl/schematy/b2bior/}TakNieTyp"&gt;
 *               &lt;enumeration value="Tak"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MiedzynarodowyNrRachunku" type="{http://zus.pl/schematy/b2bior/}MiedzynarodowyNrRachunkuTyp"/&gt;
 *         &lt;element name="NazwaAdresBanku" type="{http://zus.pl/schematy/b2bior/}NazwaAdresBankuTyp"/&gt;
 *         &lt;element name="IdentyfikatorBanku" type="{http://zus.pl/schematy/b2bior/}IdentyfikatorBankuTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaRachunekZagranicaTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "zaznaczono",
    "miedzynarodowyNrRachunku",
    "nazwaAdresBanku",
    "identyfikatorBanku"
})
public class NaRachunekZagranicaTyp {

    @XmlElement(name = "Zaznaczono", required = true)
    protected TakNieTyp zaznaczono;
    @XmlElement(name = "MiedzynarodowyNrRachunku", required = true)
    protected String miedzynarodowyNrRachunku;
    @XmlElement(name = "NazwaAdresBanku", required = true)
    protected String nazwaAdresBanku;
    @XmlElement(name = "IdentyfikatorBanku", required = true)
    protected String identyfikatorBanku;

    /**
     * Gets the value of the zaznaczono property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getZaznaczono() {
        return zaznaczono;
    }

    /**
     * Sets the value of the zaznaczono property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setZaznaczono(TakNieTyp value) {
        this.zaznaczono = value;
    }

    /**
     * Gets the value of the miedzynarodowyNrRachunku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiedzynarodowyNrRachunku() {
        return miedzynarodowyNrRachunku;
    }

    /**
     * Sets the value of the miedzynarodowyNrRachunku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiedzynarodowyNrRachunku(String value) {
        this.miedzynarodowyNrRachunku = value;
    }

    /**
     * Gets the value of the nazwaAdresBanku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwaAdresBanku() {
        return nazwaAdresBanku;
    }

    /**
     * Sets the value of the nazwaAdresBanku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwaAdresBanku(String value) {
        this.nazwaAdresBanku = value;
    }

    /**
     * Gets the value of the identyfikatorBanku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentyfikatorBanku() {
        return identyfikatorBanku;
    }

    /**
     * Sets the value of the identyfikatorBanku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentyfikatorBanku(String value) {
        this.identyfikatorBanku = value;
    }

}
