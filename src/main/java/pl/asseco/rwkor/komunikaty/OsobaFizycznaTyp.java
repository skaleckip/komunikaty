
package pl.asseco.rwkor.komunikaty;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Osoba fizyczna
 * 
 * <p>Java class for OsobaFizycznaTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OsobaFizycznaTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PESEL" type="{http://zus.pl/schematy/b2bior/}PESELTyp" minOccurs="0"/&gt;
 *         &lt;element name="RodzajDokumentu" type="{http://zus.pl/schematy/b2bior/}RodzajDokumentuTyp" minOccurs="0"/&gt;
 *         &lt;element name="SeriaINumerDokumentu" type="{http://zus.pl/schematy/b2bior/}NrDowoduTozsamosciTyp" minOccurs="0"/&gt;
 *         &lt;element name="Imie" type="{http://zus.pl/schematy/b2bior/}ImieTyp"/&gt;
 *         &lt;element name="Nazwisko" type="{http://zus.pl/schematy/b2bior/}NazwiskoTyp"/&gt;
 *         &lt;element name="DataUrodzenia" type="{http://zus.pl/schematy/b2bior/}DataTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OsobaFizycznaTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "pesel",
    "rodzajDokumentu",
    "seriaINumerDokumentu",
    "imie",
    "nazwisko",
    "dataUrodzenia"
})
@XmlSeeAlso({
    OsobaFizycznaZTelefonemTyp.class
})
public class OsobaFizycznaTyp {

    @XmlElement(name = "PESEL")
    protected String pesel;
    @XmlElement(name = "RodzajDokumentu")
    protected String rodzajDokumentu;
    @XmlElement(name = "SeriaINumerDokumentu")
    protected String seriaINumerDokumentu;
    @XmlElement(name = "Imie", required = true)
    protected String imie;
    @XmlElement(name = "Nazwisko", required = true)
    protected String nazwisko;
    @XmlElement(name = "DataUrodzenia", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataUrodzenia;

    /**
     * Gets the value of the pesel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPESEL() {
        return pesel;
    }

    /**
     * Sets the value of the pesel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPESEL(String value) {
        this.pesel = value;
    }

    /**
     * Gets the value of the rodzajDokumentu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodzajDokumentu() {
        return rodzajDokumentu;
    }

    /**
     * Sets the value of the rodzajDokumentu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodzajDokumentu(String value) {
        this.rodzajDokumentu = value;
    }

    /**
     * Gets the value of the seriaINumerDokumentu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriaINumerDokumentu() {
        return seriaINumerDokumentu;
    }

    /**
     * Sets the value of the seriaINumerDokumentu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriaINumerDokumentu(String value) {
        this.seriaINumerDokumentu = value;
    }

    /**
     * Gets the value of the imie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImie() {
        return imie;
    }

    /**
     * Sets the value of the imie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImie(String value) {
        this.imie = value;
    }

    /**
     * Gets the value of the nazwisko property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwisko() {
        return nazwisko;
    }

    /**
     * Sets the value of the nazwisko property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwisko(String value) {
        this.nazwisko = value;
    }

    /**
     * Gets the value of the dataUrodzenia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataUrodzenia() {
        return dataUrodzenia;
    }

    /**
     * Sets the value of the dataUrodzenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataUrodzenia(XMLGregorianCalendar value) {
        this.dataUrodzenia = value;
    }

}
