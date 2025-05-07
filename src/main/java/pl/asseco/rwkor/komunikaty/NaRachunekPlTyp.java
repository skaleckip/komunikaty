
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Wnioskodawca zaznaczył we wniosku ERWD pole 'w Polsce na rachunek bankowy', w sekcji 'Świadczenie wypłacane przez ZUS proszę przekazywać…'
 * 
 * <p>Java class for NaRachunekPlTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NaRachunekPlTyp"&gt;
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
 *         &lt;element name="NrRachunku" type="{http://zus.pl/schematy/b2bior/}NumerRachunkuTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaRachunekPlTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "zaznaczono",
    "nrRachunku"
})
@XmlSeeAlso({
    NaRachunekPlZamieszkalegoZagranicaTyp.class
})
public class NaRachunekPlTyp {

    @XmlElement(name = "Zaznaczono", required = true)
    protected TakNieTyp zaznaczono;
    @XmlElement(name = "NrRachunku", required = true)
    protected String nrRachunku;

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

}
