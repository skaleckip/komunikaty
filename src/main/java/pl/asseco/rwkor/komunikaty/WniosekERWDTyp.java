
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dane wskazane we wniosku o ustalenie zbiegu z rentą rodzinną ERWD
 * 
 * <p>Java class for WniosekERWDTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WniosekERWDTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DaneWnioskodawcy" type="{http://zus.pl/schematy/b2bior/}OsobaFizycznaZTelefonemTyp"/&gt;
 *         &lt;element name="AdresZamieszkania" type="{http://zus.pl/schematy/b2bior/}AdresZamieszkaniaTyp" minOccurs="0"/&gt;
 *         &lt;element name="AdresOstatniegoZamieszkaniaPobytuWPolsce" type="{http://zus.pl/schematy/b2bior/}AdresZamieszkaniaBezPanstwaTyp" minOccurs="0"/&gt;
 *         &lt;element name="AdresDoKorespondencji" type="{http://zus.pl/schematy/b2bior/}AdresKorespondencyjnyTyp" minOccurs="0"/&gt;
 *         &lt;element name="OswiadczeniaWnioskodawcy" type="{http://zus.pl/schematy/b2bior/}OswiadczeniaWnioskodawcyTyp"/&gt;
 *         &lt;element name="ZakresWniosku" type="{http://zus.pl/schematy/b2bior/}ZakresWnioskuTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WniosekERWDTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "daneWnioskodawcy",
    "adresZamieszkania",
    "adresOstatniegoZamieszkaniaPobytuWPolsce",
    "adresDoKorespondencji",
    "oswiadczeniaWnioskodawcy",
    "zakresWniosku"
})
public class WniosekERWDTyp {

    @XmlElement(name = "DaneWnioskodawcy", required = true)
    protected OsobaFizycznaZTelefonemTyp daneWnioskodawcy;
    @XmlElement(name = "AdresZamieszkania")
    protected AdresZamieszkaniaTyp adresZamieszkania;
    @XmlElement(name = "AdresOstatniegoZamieszkaniaPobytuWPolsce")
    protected AdresZamieszkaniaBezPanstwaTyp adresOstatniegoZamieszkaniaPobytuWPolsce;
    @XmlElement(name = "AdresDoKorespondencji")
    protected AdresKorespondencyjnyTyp adresDoKorespondencji;
    @XmlElement(name = "OswiadczeniaWnioskodawcy", required = true)
    protected OswiadczeniaWnioskodawcyTyp oswiadczeniaWnioskodawcy;
    @XmlElement(name = "ZakresWniosku", required = true)
    protected ZakresWnioskuTyp zakresWniosku;

    /**
     * Gets the value of the daneWnioskodawcy property.
     * 
     * @return
     *     possible object is
     *     {@link OsobaFizycznaZTelefonemTyp }
     *     
     */
    public OsobaFizycznaZTelefonemTyp getDaneWnioskodawcy() {
        return daneWnioskodawcy;
    }

    /**
     * Sets the value of the daneWnioskodawcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobaFizycznaZTelefonemTyp }
     *     
     */
    public void setDaneWnioskodawcy(OsobaFizycznaZTelefonemTyp value) {
        this.daneWnioskodawcy = value;
    }

    /**
     * Gets the value of the adresZamieszkania property.
     * 
     * @return
     *     possible object is
     *     {@link AdresZamieszkaniaTyp }
     *     
     */
    public AdresZamieszkaniaTyp getAdresZamieszkania() {
        return adresZamieszkania;
    }

    /**
     * Sets the value of the adresZamieszkania property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresZamieszkaniaTyp }
     *     
     */
    public void setAdresZamieszkania(AdresZamieszkaniaTyp value) {
        this.adresZamieszkania = value;
    }

    /**
     * Gets the value of the adresOstatniegoZamieszkaniaPobytuWPolsce property.
     * 
     * @return
     *     possible object is
     *     {@link AdresZamieszkaniaBezPanstwaTyp }
     *     
     */
    public AdresZamieszkaniaBezPanstwaTyp getAdresOstatniegoZamieszkaniaPobytuWPolsce() {
        return adresOstatniegoZamieszkaniaPobytuWPolsce;
    }

    /**
     * Sets the value of the adresOstatniegoZamieszkaniaPobytuWPolsce property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresZamieszkaniaBezPanstwaTyp }
     *     
     */
    public void setAdresOstatniegoZamieszkaniaPobytuWPolsce(AdresZamieszkaniaBezPanstwaTyp value) {
        this.adresOstatniegoZamieszkaniaPobytuWPolsce = value;
    }

    /**
     * Gets the value of the adresDoKorespondencji property.
     * 
     * @return
     *     possible object is
     *     {@link AdresKorespondencyjnyTyp }
     *     
     */
    public AdresKorespondencyjnyTyp getAdresDoKorespondencji() {
        return adresDoKorespondencji;
    }

    /**
     * Sets the value of the adresDoKorespondencji property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresKorespondencyjnyTyp }
     *     
     */
    public void setAdresDoKorespondencji(AdresKorespondencyjnyTyp value) {
        this.adresDoKorespondencji = value;
    }

    /**
     * Gets the value of the oswiadczeniaWnioskodawcy property.
     * 
     * @return
     *     possible object is
     *     {@link OswiadczeniaWnioskodawcyTyp }
     *     
     */
    public OswiadczeniaWnioskodawcyTyp getOswiadczeniaWnioskodawcy() {
        return oswiadczeniaWnioskodawcy;
    }

    /**
     * Sets the value of the oswiadczeniaWnioskodawcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OswiadczeniaWnioskodawcyTyp }
     *     
     */
    public void setOswiadczeniaWnioskodawcy(OswiadczeniaWnioskodawcyTyp value) {
        this.oswiadczeniaWnioskodawcy = value;
    }

    /**
     * Gets the value of the zakresWniosku property.
     * 
     * @return
     *     possible object is
     *     {@link ZakresWnioskuTyp }
     *     
     */
    public ZakresWnioskuTyp getZakresWniosku() {
        return zakresWniosku;
    }

    /**
     * Sets the value of the zakresWniosku property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakresWnioskuTyp }
     *     
     */
    public void setZakresWniosku(ZakresWnioskuTyp value) {
        this.zakresWniosku = value;
    }

}
