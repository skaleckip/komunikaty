
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Wnioskodawca zaznaczył we wniosku ERWD pole 'za granicę – do USA na rachunek bankowy' 
 * 
 * <p>Java class for NaRachunekUSATyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NaRachunekUSATyp"&gt;
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
 *         &lt;element name="NrRachunku" type="{http://zus.pl/schematy/b2bior/}NrRachunkuUSATyp"/&gt;
 *         &lt;element name="NazwaAdresBankuMacierzystego" type="{http://zus.pl/schematy/b2bior/}NazwaAdresBankuTyp"/&gt;
 *         &lt;element name="KodIdentBankuMacierzystego" type="{http://zus.pl/schematy/b2bior/}KodIdentBankuMacierzystegoTyp"/&gt;
 *         &lt;element name="RodzajRachunku" type="{http://zus.pl/schematy/b2bior/}RodzajRachunkuUsaTyp"/&gt;
 *         &lt;element name="NazwaAdresBankuPosredniczacego" type="{http://zus.pl/schematy/b2bior/}NazwaAdresBankuTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaRachunekUSATyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "zaznaczono",
    "nrRachunku",
    "nazwaAdresBankuMacierzystego",
    "kodIdentBankuMacierzystego",
    "rodzajRachunku",
    "nazwaAdresBankuPosredniczacego"
})
public class NaRachunekUSATyp {

    @XmlElement(name = "Zaznaczono", required = true)
    protected TakNieTyp zaznaczono;
    @XmlElement(name = "NrRachunku", required = true)
    protected String nrRachunku;
    @XmlElement(name = "NazwaAdresBankuMacierzystego", required = true)
    protected String nazwaAdresBankuMacierzystego;
    @XmlElement(name = "KodIdentBankuMacierzystego", required = true)
    protected String kodIdentBankuMacierzystego;
    @XmlElement(name = "RodzajRachunku", required = true)
    @XmlSchemaType(name = "string")
    protected RodzajRachunkuUsaTyp rodzajRachunku;
    @XmlElement(name = "NazwaAdresBankuPosredniczacego")
    protected String nazwaAdresBankuPosredniczacego;

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
     * Gets the value of the nrRachunku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrRachunku() {
        return nrRachunku;
    }

    /**
     * Sets the value of the nrRachunku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrRachunku(String value) {
        this.nrRachunku = value;
    }

    /**
     * Gets the value of the nazwaAdresBankuMacierzystego property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwaAdresBankuMacierzystego() {
        return nazwaAdresBankuMacierzystego;
    }

    /**
     * Sets the value of the nazwaAdresBankuMacierzystego property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwaAdresBankuMacierzystego(String value) {
        this.nazwaAdresBankuMacierzystego = value;
    }

    /**
     * Gets the value of the kodIdentBankuMacierzystego property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodIdentBankuMacierzystego() {
        return kodIdentBankuMacierzystego;
    }

    /**
     * Sets the value of the kodIdentBankuMacierzystego property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodIdentBankuMacierzystego(String value) {
        this.kodIdentBankuMacierzystego = value;
    }

    /**
     * Gets the value of the rodzajRachunku property.
     * 
     * @return
     *     possible object is
     *     {@link RodzajRachunkuUsaTyp }
     *     
     */
    public RodzajRachunkuUsaTyp getRodzajRachunku() {
        return rodzajRachunku;
    }

    /**
     * Sets the value of the rodzajRachunku property.
     * 
     * @param value
     *     allowed object is
     *     {@link RodzajRachunkuUsaTyp }
     *     
     */
    public void setRodzajRachunku(RodzajRachunkuUsaTyp value) {
        this.rodzajRachunku = value;
    }

    /**
     * Gets the value of the nazwaAdresBankuPosredniczacego property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwaAdresBankuPosredniczacego() {
        return nazwaAdresBankuPosredniczacego;
    }

    /**
     * Sets the value of the nazwaAdresBankuPosredniczacego property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwaAdresBankuPosredniczacego(String value) {
        this.nazwaAdresBankuPosredniczacego = value;
    }

}
