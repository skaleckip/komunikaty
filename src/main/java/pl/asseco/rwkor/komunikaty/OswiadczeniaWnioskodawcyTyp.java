
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OswiadczeniaWnioskodawcyTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OswiadczeniaWnioskodawcyTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MamPrzyznanaRenteRodzinna" type="{http://zus.pl/schematy/b2bior/}TakNieTyp"/&gt;
 *         &lt;element name="RodzajInstytucjiRentaRodzinna" type="{http://zus.pl/schematy/b2bior/}RodzajInstytucjiTyp" minOccurs="0"/&gt;
 *         &lt;element name="NumerSwiadczeniaRentaRodzinna" type="{http://zus.pl/schematy/b2bior/}Tekst200Typ" minOccurs="0"/&gt;
 *         &lt;element name="MamPrzyznanaInneSwiadczenie" type="{http://zus.pl/schematy/b2bior/}TakNieTyp"/&gt;
 *         &lt;element name="RodzajInstytucjiInneSwiadczenie" type="{http://zus.pl/schematy/b2bior/}RodzajInstytucjiTyp" minOccurs="0"/&gt;
 *         &lt;element name="NumerSwiadczeniaInneSwiadczenie" type="{http://zus.pl/schematy/b2bior/}Tekst200Typ" minOccurs="0"/&gt;
 *         &lt;element name="CzyUstalonePrawaDoSwiadczeniaZZagranicy" type="{http://zus.pl/schematy/b2bior/}TakNieTyp"/&gt;
 *         &lt;element name="DaneSwiadczeniaZagranica" type="{http://zus.pl/schematy/b2bior/}Tekst200Typ" minOccurs="0"/&gt;
 *         &lt;element name="MamZlozonyWniosekOSwiadczenieZZagranicy" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="DaneWnioskowanegoSwiadczeniaZagranica" type="{http://zus.pl/schematy/b2bior/}Tekst200Typ" minOccurs="0"/&gt;
 *         &lt;element name="DoSmierciPozostawalismyWeWspolnosci" type="{http://zus.pl/schematy/b2bior/}TakNieTyp"/&gt;
 *         &lt;element name="JestemObecnieWZwiazkuMalzenskim" type="{http://zus.pl/schematy/b2bior/}TakNieTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OswiadczeniaWnioskodawcyTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "mamPrzyznanaRenteRodzinna",
    "rodzajInstytucjiRentaRodzinna",
    "numerSwiadczeniaRentaRodzinna",
    "mamPrzyznanaInneSwiadczenie",
    "rodzajInstytucjiInneSwiadczenie",
    "numerSwiadczeniaInneSwiadczenie",
    "czyUstalonePrawaDoSwiadczeniaZZagranicy",
    "daneSwiadczeniaZagranica",
    "mamZlozonyWniosekOSwiadczenieZZagranicy",
    "daneWnioskowanegoSwiadczeniaZagranica",
    "doSmierciPozostawalismyWeWspolnosci",
    "jestemObecnieWZwiazkuMalzenskim"
})
public class OswiadczeniaWnioskodawcyTyp {

    @XmlElement(name = "MamPrzyznanaRenteRodzinna", required = true)
    @XmlSchemaType(name = "string")
    protected TakNieTyp mamPrzyznanaRenteRodzinna;
    @XmlElement(name = "RodzajInstytucjiRentaRodzinna")
    protected RodzajInstytucjiTyp rodzajInstytucjiRentaRodzinna;
    @XmlElement(name = "NumerSwiadczeniaRentaRodzinna")
    protected String numerSwiadczeniaRentaRodzinna;
    @XmlElement(name = "MamPrzyznanaInneSwiadczenie", required = true)
    @XmlSchemaType(name = "string")
    protected TakNieTyp mamPrzyznanaInneSwiadczenie;
    @XmlElement(name = "RodzajInstytucjiInneSwiadczenie")
    protected RodzajInstytucjiTyp rodzajInstytucjiInneSwiadczenie;
    @XmlElement(name = "NumerSwiadczeniaInneSwiadczenie")
    protected String numerSwiadczeniaInneSwiadczenie;
    @XmlElement(name = "CzyUstalonePrawaDoSwiadczeniaZZagranicy", required = true)
    @XmlSchemaType(name = "string")
    protected TakNieTyp czyUstalonePrawaDoSwiadczeniaZZagranicy;
    @XmlElement(name = "DaneSwiadczeniaZagranica")
    protected String daneSwiadczeniaZagranica;
    @XmlElement(name = "MamZlozonyWniosekOSwiadczenieZZagranicy")
    @XmlSchemaType(name = "string")
    protected TakNieTyp mamZlozonyWniosekOSwiadczenieZZagranicy;
    @XmlElement(name = "DaneWnioskowanegoSwiadczeniaZagranica")
    protected String daneWnioskowanegoSwiadczeniaZagranica;
    @XmlElement(name = "DoSmierciPozostawalismyWeWspolnosci", required = true)
    @XmlSchemaType(name = "string")
    protected TakNieTyp doSmierciPozostawalismyWeWspolnosci;
    @XmlElement(name = "JestemObecnieWZwiazkuMalzenskim", required = true)
    @XmlSchemaType(name = "string")
    protected TakNieTyp jestemObecnieWZwiazkuMalzenskim;

    /**
     * Gets the value of the mamPrzyznanaRenteRodzinna property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getMamPrzyznanaRenteRodzinna() {
        return mamPrzyznanaRenteRodzinna;
    }

    /**
     * Sets the value of the mamPrzyznanaRenteRodzinna property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setMamPrzyznanaRenteRodzinna(TakNieTyp value) {
        this.mamPrzyznanaRenteRodzinna = value;
    }

    /**
     * Gets the value of the rodzajInstytucjiRentaRodzinna property.
     * 
     * @return
     *     possible object is
     *     {@link RodzajInstytucjiTyp }
     *     
     */
    public RodzajInstytucjiTyp getRodzajInstytucjiRentaRodzinna() {
        return rodzajInstytucjiRentaRodzinna;
    }

    /**
     * Sets the value of the rodzajInstytucjiRentaRodzinna property.
     * 
     * @param value
     *     allowed object is
     *     {@link RodzajInstytucjiTyp }
     *     
     */
    public void setRodzajInstytucjiRentaRodzinna(RodzajInstytucjiTyp value) {
        this.rodzajInstytucjiRentaRodzinna = value;
    }

    /**
     * Gets the value of the numerSwiadczeniaRentaRodzinna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerSwiadczeniaRentaRodzinna() {
        return numerSwiadczeniaRentaRodzinna;
    }

    /**
     * Sets the value of the numerSwiadczeniaRentaRodzinna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerSwiadczeniaRentaRodzinna(String value) {
        this.numerSwiadczeniaRentaRodzinna = value;
    }

    /**
     * Gets the value of the mamPrzyznanaInneSwiadczenie property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getMamPrzyznanaInneSwiadczenie() {
        return mamPrzyznanaInneSwiadczenie;
    }

    /**
     * Sets the value of the mamPrzyznanaInneSwiadczenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setMamPrzyznanaInneSwiadczenie(TakNieTyp value) {
        this.mamPrzyznanaInneSwiadczenie = value;
    }

    /**
     * Gets the value of the rodzajInstytucjiInneSwiadczenie property.
     * 
     * @return
     *     possible object is
     *     {@link RodzajInstytucjiTyp }
     *     
     */
    public RodzajInstytucjiTyp getRodzajInstytucjiInneSwiadczenie() {
        return rodzajInstytucjiInneSwiadczenie;
    }

    /**
     * Sets the value of the rodzajInstytucjiInneSwiadczenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link RodzajInstytucjiTyp }
     *     
     */
    public void setRodzajInstytucjiInneSwiadczenie(RodzajInstytucjiTyp value) {
        this.rodzajInstytucjiInneSwiadczenie = value;
    }

    /**
     * Gets the value of the numerSwiadczeniaInneSwiadczenie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerSwiadczeniaInneSwiadczenie() {
        return numerSwiadczeniaInneSwiadczenie;
    }

    /**
     * Sets the value of the numerSwiadczeniaInneSwiadczenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerSwiadczeniaInneSwiadczenie(String value) {
        this.numerSwiadczeniaInneSwiadczenie = value;
    }

    /**
     * Gets the value of the czyUstalonePrawaDoSwiadczeniaZZagranicy property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getCzyUstalonePrawaDoSwiadczeniaZZagranicy() {
        return czyUstalonePrawaDoSwiadczeniaZZagranicy;
    }

    /**
     * Sets the value of the czyUstalonePrawaDoSwiadczeniaZZagranicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setCzyUstalonePrawaDoSwiadczeniaZZagranicy(TakNieTyp value) {
        this.czyUstalonePrawaDoSwiadczeniaZZagranicy = value;
    }

    /**
     * Gets the value of the daneSwiadczeniaZagranica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaneSwiadczeniaZagranica() {
        return daneSwiadczeniaZagranica;
    }

    /**
     * Sets the value of the daneSwiadczeniaZagranica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaneSwiadczeniaZagranica(String value) {
        this.daneSwiadczeniaZagranica = value;
    }

    /**
     * Gets the value of the mamZlozonyWniosekOSwiadczenieZZagranicy property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getMamZlozonyWniosekOSwiadczenieZZagranicy() {
        return mamZlozonyWniosekOSwiadczenieZZagranicy;
    }

    /**
     * Sets the value of the mamZlozonyWniosekOSwiadczenieZZagranicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setMamZlozonyWniosekOSwiadczenieZZagranicy(TakNieTyp value) {
        this.mamZlozonyWniosekOSwiadczenieZZagranicy = value;
    }

    /**
     * Gets the value of the daneWnioskowanegoSwiadczeniaZagranica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaneWnioskowanegoSwiadczeniaZagranica() {
        return daneWnioskowanegoSwiadczeniaZagranica;
    }

    /**
     * Sets the value of the daneWnioskowanegoSwiadczeniaZagranica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaneWnioskowanegoSwiadczeniaZagranica(String value) {
        this.daneWnioskowanegoSwiadczeniaZagranica = value;
    }

    /**
     * Gets the value of the doSmierciPozostawalismyWeWspolnosci property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getDoSmierciPozostawalismyWeWspolnosci() {
        return doSmierciPozostawalismyWeWspolnosci;
    }

    /**
     * Sets the value of the doSmierciPozostawalismyWeWspolnosci property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setDoSmierciPozostawalismyWeWspolnosci(TakNieTyp value) {
        this.doSmierciPozostawalismyWeWspolnosci = value;
    }

    /**
     * Gets the value of the jestemObecnieWZwiazkuMalzenskim property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getJestemObecnieWZwiazkuMalzenskim() {
        return jestemObecnieWZwiazkuMalzenskim;
    }

    /**
     * Sets the value of the jestemObecnieWZwiazkuMalzenskim property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setJestemObecnieWZwiazkuMalzenskim(TakNieTyp value) {
        this.jestemObecnieWZwiazkuMalzenskim = value;
    }

}
