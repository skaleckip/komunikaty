
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Wnioskodawca zaznaczył we wniosku ERWD pole 'adres w Polsce', w sekcji 'Świadczenie wypłacane przez ZUS proszę przekazywać…'
 * 
 * <p>Java class for NaAdresPlTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NaAdresPlTyp"&gt;
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
 *         &lt;group ref="{http://zus.pl/schematy/b2bior/}NaAdreP1Wybor"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaAdresPlTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "zaznaczono",
    "zamieszkania",
    "ostatniegoMiejscaZamieszkaniaPobytu",
    "doKorespondencji"
})
public class NaAdresPlTyp {

    @XmlElement(name = "Zaznaczono", required = true)
    protected TakNieTyp zaznaczono;
    @XmlElement(name = "Zamieszkania")
    @XmlSchemaType(name = "string")
    protected TakNieTyp zamieszkania;
    @XmlElement(name = "OstatniegoMiejscaZamieszkaniaPobytu")
    @XmlSchemaType(name = "string")
    protected TakNieTyp ostatniegoMiejscaZamieszkaniaPobytu;
    @XmlElement(name = "DoKorespondencji")
    @XmlSchemaType(name = "string")
    protected TakNieTyp doKorespondencji;

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
     * Gets the value of the zamieszkania property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getZamieszkania() {
        return zamieszkania;
    }

    /**
     * Sets the value of the zamieszkania property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setZamieszkania(TakNieTyp value) {
        this.zamieszkania = value;
    }

    /**
     * Gets the value of the ostatniegoMiejscaZamieszkaniaPobytu property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getOstatniegoMiejscaZamieszkaniaPobytu() {
        return ostatniegoMiejscaZamieszkaniaPobytu;
    }

    /**
     * Sets the value of the ostatniegoMiejscaZamieszkaniaPobytu property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setOstatniegoMiejscaZamieszkaniaPobytu(TakNieTyp value) {
        this.ostatniegoMiejscaZamieszkaniaPobytu = value;
    }

    /**
     * Gets the value of the doKorespondencji property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getDoKorespondencji() {
        return doKorespondencji;
    }

    /**
     * Sets the value of the doKorespondencji property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setDoKorespondencji(TakNieTyp value) {
        this.doKorespondencji = value;
    }

}
