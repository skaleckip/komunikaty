
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Co wnioskodawca zaznaczył we wniosku ERWD w sekcji 'Świadczenie wypłacane przez ZUS proszę przekazywać…'? 
 * 
 * <p>Java class for SwiadczenieWZbieguProszePrzekazywacTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwiadczenieWZbieguProszePrzekazywacTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="NaRachunekPlZamieszkalegoWPolsce" type="{http://zus.pl/schematy/b2bior/}NaRachunekPlTyp"/&gt;
 *         &lt;element name="NaAdresPl" type="{http://zus.pl/schematy/b2bior/}NaAdresPlTyp"/&gt;
 *         &lt;element name="NaRachunekZagranica" type="{http://zus.pl/schematy/b2bior/}NaRachunekZagranicaTyp"/&gt;
 *         &lt;element name="NaRachunekUSA" type="{http://zus.pl/schematy/b2bior/}NaRachunekUSATyp"/&gt;
 *         &lt;element name="NaRachunekPlZamieszkalegoZagranica" type="{http://zus.pl/schematy/b2bior/}NaRachunekPlZamieszkalegoZagranicaTyp"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwiadczenieWZbieguProszePrzekazywacTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "naRachunekPlZamieszkalegoWPolsce",
    "naAdresPl",
    "naRachunekZagranica",
    "naRachunekUSA",
    "naRachunekPlZamieszkalegoZagranica"
})
public class SwiadczenieWZbieguProszePrzekazywacTyp {

    @XmlElement(name = "NaRachunekPlZamieszkalegoWPolsce")
    protected NaRachunekPlTyp naRachunekPlZamieszkalegoWPolsce;
    @XmlElement(name = "NaAdresPl")
    protected NaAdresPlTyp naAdresPl;
    @XmlElement(name = "NaRachunekZagranica")
    protected NaRachunekZagranicaTyp naRachunekZagranica;
    @XmlElement(name = "NaRachunekUSA")
    protected NaRachunekUSATyp naRachunekUSA;
    @XmlElement(name = "NaRachunekPlZamieszkalegoZagranica")
    protected NaRachunekPlZamieszkalegoZagranicaTyp naRachunekPlZamieszkalegoZagranica;

    /**
     * Gets the value of the naRachunekPlZamieszkalegoWPolsce property.
     * 
     * @return
     *     possible object is
     *     {@link NaRachunekPlTyp }
     *     
     */
    public NaRachunekPlTyp getNaRachunekPlZamieszkalegoWPolsce() {
        return naRachunekPlZamieszkalegoWPolsce;
    }

    /**
     * Sets the value of the naRachunekPlZamieszkalegoWPolsce property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaRachunekPlTyp }
     *     
     */
    public void setNaRachunekPlZamieszkalegoWPolsce(NaRachunekPlTyp value) {
        this.naRachunekPlZamieszkalegoWPolsce = value;
    }

    /**
     * Gets the value of the naAdresPl property.
     * 
     * @return
     *     possible object is
     *     {@link NaAdresPlTyp }
     *     
     */
    public NaAdresPlTyp getNaAdresPl() {
        return naAdresPl;
    }

    /**
     * Sets the value of the naAdresPl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaAdresPlTyp }
     *     
     */
    public void setNaAdresPl(NaAdresPlTyp value) {
        this.naAdresPl = value;
    }

    /**
     * Gets the value of the naRachunekZagranica property.
     * 
     * @return
     *     possible object is
     *     {@link NaRachunekZagranicaTyp }
     *     
     */
    public NaRachunekZagranicaTyp getNaRachunekZagranica() {
        return naRachunekZagranica;
    }

    /**
     * Sets the value of the naRachunekZagranica property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaRachunekZagranicaTyp }
     *     
     */
    public void setNaRachunekZagranica(NaRachunekZagranicaTyp value) {
        this.naRachunekZagranica = value;
    }

    /**
     * Gets the value of the naRachunekUSA property.
     * 
     * @return
     *     possible object is
     *     {@link NaRachunekUSATyp }
     *     
     */
    public NaRachunekUSATyp getNaRachunekUSA() {
        return naRachunekUSA;
    }

    /**
     * Sets the value of the naRachunekUSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaRachunekUSATyp }
     *     
     */
    public void setNaRachunekUSA(NaRachunekUSATyp value) {
        this.naRachunekUSA = value;
    }

    /**
     * Gets the value of the naRachunekPlZamieszkalegoZagranica property.
     * 
     * @return
     *     possible object is
     *     {@link NaRachunekPlZamieszkalegoZagranicaTyp }
     *     
     */
    public NaRachunekPlZamieszkalegoZagranicaTyp getNaRachunekPlZamieszkalegoZagranica() {
        return naRachunekPlZamieszkalegoZagranica;
    }

    /**
     * Sets the value of the naRachunekPlZamieszkalegoZagranica property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaRachunekPlZamieszkalegoZagranicaTyp }
     *     
     */
    public void setNaRachunekPlZamieszkalegoZagranica(NaRachunekPlZamieszkalegoZagranicaTyp value) {
        this.naRachunekPlZamieszkalegoZagranica = value;
    }

}
