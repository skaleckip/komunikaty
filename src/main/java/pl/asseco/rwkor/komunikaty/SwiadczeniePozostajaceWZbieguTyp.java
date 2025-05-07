
package pl.asseco.rwkor.komunikaty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Świadczenie pozostające w zbiegu
 * 
 * <p>Java class for SwiadczeniePozostajaceWZbieguTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwiadczeniePozostajaceWZbieguTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ORS" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="JednostkaORS" type="{http://zus.pl/schematy/b2bior/}JednostkaOrganuRentowegoTyp" minOccurs="0"/&gt;
 *         &lt;element name="RodzajSwiadczenia" type="{http://zus.pl/schematy/b2bior/}RodzajSwiadczeniaTyp"/&gt;
 *         &lt;element name="RodzajSwiadczeniaDlaZbieguWdowiego" type="{http://zus.pl/schematy/b2bior/}RodzajSwiadczeniaDlaZbieguWdowiegoTyp"/&gt;
 *         &lt;element name="SymbolSwiadczenia" type="{http://zus.pl/schematy/b2bior/}SymbolSwiadczeniaTyp"/&gt;
 *         &lt;element name="NumerSwiadczenia" type="{http://zus.pl/schematy/b2bior/}NumerSwiadczeniaTyp"/&gt;
 *         &lt;element name="TerminPlatnosci" type="{http://zus.pl/schematy/b2bior/}TerminPlatnosciTyp"/&gt;
 *         &lt;element name="StronaWyplacajacaSwiadczenie" type="{http://zus.pl/schematy/b2bior/}StronaWyplacajacaSwiadczenieTyp"/&gt;
 *         &lt;element name="ProporcjaSwiadczenWZbiegu" type="{http://zus.pl/schematy/b2bior/}ProporcjaSwiadczeniaWZbieguTyp"/&gt;
 *         &lt;element name="DaneZmarlego" type="{http://zus.pl/schematy/b2bior/}OsobaFizycznaTyp" minOccurs="0"/&gt;
 *         &lt;element name="DataZgonu" type="{http://zus.pl/schematy/b2bior/}DataTyp" minOccurs="0"/&gt;
 *         &lt;element name="StopienPokrewienstwa" type="{http://zus.pl/schematy/b2bior/}StopienPokrewienstwaTyp" minOccurs="0"/&gt;
 *         &lt;element name="SymbolSwiadczeniaNadrzednego" type="{http://zus.pl/schematy/b2bior/}SymbolSwiadczeniaTyp" minOccurs="0"/&gt;
 *         &lt;element name="WysokoscSwiadczeniaBezDodatkow" type="{http://zus.pl/schematy/b2bior/}KwotaTyp"/&gt;
 *         &lt;element name="WysokoscSwiadczeniaZDodatkami" type="{http://zus.pl/schematy/b2bior/}KwotaTyp"/&gt;
 *         &lt;element name="StanPrawa" type="{http://zus.pl/schematy/b2bior/}StanPrawaTyp"/&gt;
 *         &lt;element name="StanSwiadczenia" type="{http://zus.pl/schematy/b2bior/}StanSwiadczeniaTyp"/&gt;
 *         &lt;element name="WyplacanyProcentSwiadczenia" type="{http://zus.pl/schematy/b2bior/}ProcentTyp"/&gt;
 *         &lt;element name="LiczbaUprawnionych" type="{http://zus.pl/schematy/b2bior/}LiczbaTyp"/&gt;
 *         &lt;element name="CzyMozliwyZbiegWdowi" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WysokoscSwiadczeniaBezDodatkowWyplacanegoWXProc" type="{http://zus.pl/schematy/b2bior/}KwotaTyp"/&gt;
 *         &lt;element name="WysokoscSwiadczeniaZDodatkamiWyplacanegoWXProc" type="{http://zus.pl/schematy/b2bior/}KwotaTyp"/&gt;
 *         &lt;element name="WysokoscSwiadczeniaBezDodatkowWyplacanegoWXProcPoZmniejszeniu" type="{http://zus.pl/schematy/b2bior/}KwotaTyp"/&gt;
 *         &lt;element name="WysokoscSwiadczeniaZDodatkamiWyplacanegoWXProcPoZmniejszeniu" type="{http://zus.pl/schematy/b2bior/}KwotaTyp"/&gt;
 *         &lt;element name="SkladnikSwiadczenia" type="{http://zus.pl/schematy/b2bior/}SkladnikSwiadczeniaTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WyplacanyDodatek" type="{http://zus.pl/schematy/b2bior/}DodatekWyplacanyZeSwiadczeniemTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwiadczeniePozostajaceWZbieguTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "ors",
    "jednostkaORS",
    "rodzajSwiadczenia",
    "rodzajSwiadczeniaDlaZbieguWdowiego",
    "symbolSwiadczenia",
    "numerSwiadczenia",
    "terminPlatnosci",
    "stronaWyplacajacaSwiadczenie",
    "proporcjaSwiadczenWZbiegu",
    "daneZmarlego",
    "dataZgonu",
    "stopienPokrewienstwa",
    "symbolSwiadczeniaNadrzednego",
    "wysokoscSwiadczeniaBezDodatkow",
    "wysokoscSwiadczeniaZDodatkami",
    "stanPrawa",
    "stanSwiadczenia",
    "wyplacanyProcentSwiadczenia",
    "liczbaUprawnionych",
    "czyMozliwyZbiegWdowi",
    "wysokoscSwiadczeniaBezDodatkowWyplacanegoWXProc",
    "wysokoscSwiadczeniaZDodatkamiWyplacanegoWXProc",
    "wysokoscSwiadczeniaBezDodatkowWyplacanegoWXProcPoZmniejszeniu",
    "wysokoscSwiadczeniaZDodatkamiWyplacanegoWXProcPoZmniejszeniu",
    "skladnikSwiadczenia",
    "wyplacanyDodatek"
})
public class SwiadczeniePozostajaceWZbieguTyp {

    @XmlElement(name = "ORS", required = true)
    protected String ors;
    @XmlElement(name = "JednostkaORS")
    protected String jednostkaORS;
    @XmlElement(name = "RodzajSwiadczenia", required = true)
    protected String rodzajSwiadczenia;
    @XmlElement(name = "RodzajSwiadczeniaDlaZbieguWdowiego", required = true)
    protected String rodzajSwiadczeniaDlaZbieguWdowiego;
    @XmlElement(name = "SymbolSwiadczenia", required = true)
    protected String symbolSwiadczenia;
    @XmlElement(name = "NumerSwiadczenia", required = true)
    protected String numerSwiadczenia;
    @XmlElement(name = "TerminPlatnosci", required = true)
    protected String terminPlatnosci;
    @XmlElement(name = "StronaWyplacajacaSwiadczenie", required = true)
    protected String stronaWyplacajacaSwiadczenie;
    @XmlElement(name = "ProporcjaSwiadczenWZbiegu", required = true)
    protected String proporcjaSwiadczenWZbiegu;
    @XmlElement(name = "DaneZmarlego")
    protected OsobaFizycznaTyp daneZmarlego;
    @XmlElement(name = "DataZgonu")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataZgonu;
    @XmlElement(name = "StopienPokrewienstwa")
    protected String stopienPokrewienstwa;
    @XmlElement(name = "SymbolSwiadczeniaNadrzednego")
    protected String symbolSwiadczeniaNadrzednego;
    @XmlElement(name = "WysokoscSwiadczeniaBezDodatkow", required = true)
    protected BigDecimal wysokoscSwiadczeniaBezDodatkow;
    @XmlElement(name = "WysokoscSwiadczeniaZDodatkami", required = true)
    protected BigDecimal wysokoscSwiadczeniaZDodatkami;
    @XmlElement(name = "StanPrawa", required = true)
    protected String stanPrawa;
    @XmlElement(name = "StanSwiadczenia", required = true)
    protected String stanSwiadczenia;
    @XmlElement(name = "WyplacanyProcentSwiadczenia", required = true)
    protected BigDecimal wyplacanyProcentSwiadczenia;
    @XmlElement(name = "LiczbaUprawnionych", required = true)
    protected String liczbaUprawnionych;
    @XmlElement(name = "CzyMozliwyZbiegWdowi")
    @XmlSchemaType(name = "string")
    protected TakNieTyp czyMozliwyZbiegWdowi;
    @XmlElement(name = "WysokoscSwiadczeniaBezDodatkowWyplacanegoWXProc", required = true)
    protected BigDecimal wysokoscSwiadczeniaBezDodatkowWyplacanegoWXProc;
    @XmlElement(name = "WysokoscSwiadczeniaZDodatkamiWyplacanegoWXProc", required = true)
    protected BigDecimal wysokoscSwiadczeniaZDodatkamiWyplacanegoWXProc;
    @XmlElement(name = "WysokoscSwiadczeniaBezDodatkowWyplacanegoWXProcPoZmniejszeniu", required = true)
    protected BigDecimal wysokoscSwiadczeniaBezDodatkowWyplacanegoWXProcPoZmniejszeniu;
    @XmlElement(name = "WysokoscSwiadczeniaZDodatkamiWyplacanegoWXProcPoZmniejszeniu", required = true)
    protected BigDecimal wysokoscSwiadczeniaZDodatkamiWyplacanegoWXProcPoZmniejszeniu;
    @XmlElement(name = "SkladnikSwiadczenia")
    protected List<SkladnikSwiadczeniaTyp> skladnikSwiadczenia;
    @XmlElement(name = "WyplacanyDodatek")
    protected List<DodatekWyplacanyZeSwiadczeniemTyp> wyplacanyDodatek;

    /**
     * Gets the value of the ors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORS() {
        return ors;
    }

    /**
     * Sets the value of the ors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORS(String value) {
        this.ors = value;
    }

    /**
     * Gets the value of the jednostkaORS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJednostkaORS() {
        return jednostkaORS;
    }

    /**
     * Sets the value of the jednostkaORS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJednostkaORS(String value) {
        this.jednostkaORS = value;
    }

    /**
     * Gets the value of the rodzajSwiadczenia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodzajSwiadczenia() {
        return rodzajSwiadczenia;
    }

    /**
     * Sets the value of the rodzajSwiadczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodzajSwiadczenia(String value) {
        this.rodzajSwiadczenia = value;
    }

    /**
     * Gets the value of the rodzajSwiadczeniaDlaZbieguWdowiego property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodzajSwiadczeniaDlaZbieguWdowiego() {
        return rodzajSwiadczeniaDlaZbieguWdowiego;
    }

    /**
     * Sets the value of the rodzajSwiadczeniaDlaZbieguWdowiego property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodzajSwiadczeniaDlaZbieguWdowiego(String value) {
        this.rodzajSwiadczeniaDlaZbieguWdowiego = value;
    }

    /**
     * Gets the value of the symbolSwiadczenia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolSwiadczenia() {
        return symbolSwiadczenia;
    }

    /**
     * Sets the value of the symbolSwiadczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolSwiadczenia(String value) {
        this.symbolSwiadczenia = value;
    }

    /**
     * Gets the value of the numerSwiadczenia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerSwiadczenia() {
        return numerSwiadczenia;
    }

    /**
     * Sets the value of the numerSwiadczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerSwiadczenia(String value) {
        this.numerSwiadczenia = value;
    }

    /**
     * Gets the value of the terminPlatnosci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminPlatnosci() {
        return terminPlatnosci;
    }

    /**
     * Sets the value of the terminPlatnosci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminPlatnosci(String value) {
        this.terminPlatnosci = value;
    }

    /**
     * Gets the value of the stronaWyplacajacaSwiadczenie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStronaWyplacajacaSwiadczenie() {
        return stronaWyplacajacaSwiadczenie;
    }

    /**
     * Sets the value of the stronaWyplacajacaSwiadczenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStronaWyplacajacaSwiadczenie(String value) {
        this.stronaWyplacajacaSwiadczenie = value;
    }

    /**
     * Gets the value of the proporcjaSwiadczenWZbiegu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProporcjaSwiadczenWZbiegu() {
        return proporcjaSwiadczenWZbiegu;
    }

    /**
     * Sets the value of the proporcjaSwiadczenWZbiegu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProporcjaSwiadczenWZbiegu(String value) {
        this.proporcjaSwiadczenWZbiegu = value;
    }

    /**
     * Gets the value of the daneZmarlego property.
     * 
     * @return
     *     possible object is
     *     {@link OsobaFizycznaTyp }
     *     
     */
    public OsobaFizycznaTyp getDaneZmarlego() {
        return daneZmarlego;
    }

    /**
     * Sets the value of the daneZmarlego property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobaFizycznaTyp }
     *     
     */
    public void setDaneZmarlego(OsobaFizycznaTyp value) {
        this.daneZmarlego = value;
    }

    /**
     * Gets the value of the dataZgonu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataZgonu() {
        return dataZgonu;
    }

    /**
     * Sets the value of the dataZgonu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataZgonu(XMLGregorianCalendar value) {
        this.dataZgonu = value;
    }

    /**
     * Gets the value of the stopienPokrewienstwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopienPokrewienstwa() {
        return stopienPokrewienstwa;
    }

    /**
     * Sets the value of the stopienPokrewienstwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopienPokrewienstwa(String value) {
        this.stopienPokrewienstwa = value;
    }

    /**
     * Gets the value of the symbolSwiadczeniaNadrzednego property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolSwiadczeniaNadrzednego() {
        return symbolSwiadczeniaNadrzednego;
    }

    /**
     * Sets the value of the symbolSwiadczeniaNadrzednego property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolSwiadczeniaNadrzednego(String value) {
        this.symbolSwiadczeniaNadrzednego = value;
    }

    /**
     * Gets the value of the wysokoscSwiadczeniaBezDodatkow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWysokoscSwiadczeniaBezDodatkow() {
        return wysokoscSwiadczeniaBezDodatkow;
    }

    /**
     * Sets the value of the wysokoscSwiadczeniaBezDodatkow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWysokoscSwiadczeniaBezDodatkow(BigDecimal value) {
        this.wysokoscSwiadczeniaBezDodatkow = value;
    }

    /**
     * Gets the value of the wysokoscSwiadczeniaZDodatkami property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWysokoscSwiadczeniaZDodatkami() {
        return wysokoscSwiadczeniaZDodatkami;
    }

    /**
     * Sets the value of the wysokoscSwiadczeniaZDodatkami property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWysokoscSwiadczeniaZDodatkami(BigDecimal value) {
        this.wysokoscSwiadczeniaZDodatkami = value;
    }

    /**
     * Gets the value of the stanPrawa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStanPrawa() {
        return stanPrawa;
    }

    /**
     * Sets the value of the stanPrawa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStanPrawa(String value) {
        this.stanPrawa = value;
    }

    /**
     * Gets the value of the stanSwiadczenia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStanSwiadczenia() {
        return stanSwiadczenia;
    }

    /**
     * Sets the value of the stanSwiadczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStanSwiadczenia(String value) {
        this.stanSwiadczenia = value;
    }

    /**
     * Gets the value of the wyplacanyProcentSwiadczenia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWyplacanyProcentSwiadczenia() {
        return wyplacanyProcentSwiadczenia;
    }

    /**
     * Sets the value of the wyplacanyProcentSwiadczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWyplacanyProcentSwiadczenia(BigDecimal value) {
        this.wyplacanyProcentSwiadczenia = value;
    }

    /**
     * Gets the value of the liczbaUprawnionych property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiczbaUprawnionych() {
        return liczbaUprawnionych;
    }

    /**
     * Sets the value of the liczbaUprawnionych property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiczbaUprawnionych(String value) {
        this.liczbaUprawnionych = value;
    }

    /**
     * Gets the value of the czyMozliwyZbiegWdowi property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getCzyMozliwyZbiegWdowi() {
        return czyMozliwyZbiegWdowi;
    }

    /**
     * Sets the value of the czyMozliwyZbiegWdowi property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setCzyMozliwyZbiegWdowi(TakNieTyp value) {
        this.czyMozliwyZbiegWdowi = value;
    }

    /**
     * Gets the value of the wysokoscSwiadczeniaBezDodatkowWyplacanegoWXProc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWysokoscSwiadczeniaBezDodatkowWyplacanegoWXProc() {
        return wysokoscSwiadczeniaBezDodatkowWyplacanegoWXProc;
    }

    /**
     * Sets the value of the wysokoscSwiadczeniaBezDodatkowWyplacanegoWXProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWysokoscSwiadczeniaBezDodatkowWyplacanegoWXProc(BigDecimal value) {
        this.wysokoscSwiadczeniaBezDodatkowWyplacanegoWXProc = value;
    }

    /**
     * Gets the value of the wysokoscSwiadczeniaZDodatkamiWyplacanegoWXProc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWysokoscSwiadczeniaZDodatkamiWyplacanegoWXProc() {
        return wysokoscSwiadczeniaZDodatkamiWyplacanegoWXProc;
    }

    /**
     * Sets the value of the wysokoscSwiadczeniaZDodatkamiWyplacanegoWXProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWysokoscSwiadczeniaZDodatkamiWyplacanegoWXProc(BigDecimal value) {
        this.wysokoscSwiadczeniaZDodatkamiWyplacanegoWXProc = value;
    }

    /**
     * Gets the value of the wysokoscSwiadczeniaBezDodatkowWyplacanegoWXProcPoZmniejszeniu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWysokoscSwiadczeniaBezDodatkowWyplacanegoWXProcPoZmniejszeniu() {
        return wysokoscSwiadczeniaBezDodatkowWyplacanegoWXProcPoZmniejszeniu;
    }

    /**
     * Sets the value of the wysokoscSwiadczeniaBezDodatkowWyplacanegoWXProcPoZmniejszeniu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWysokoscSwiadczeniaBezDodatkowWyplacanegoWXProcPoZmniejszeniu(BigDecimal value) {
        this.wysokoscSwiadczeniaBezDodatkowWyplacanegoWXProcPoZmniejszeniu = value;
    }

    /**
     * Gets the value of the wysokoscSwiadczeniaZDodatkamiWyplacanegoWXProcPoZmniejszeniu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWysokoscSwiadczeniaZDodatkamiWyplacanegoWXProcPoZmniejszeniu() {
        return wysokoscSwiadczeniaZDodatkamiWyplacanegoWXProcPoZmniejszeniu;
    }

    /**
     * Sets the value of the wysokoscSwiadczeniaZDodatkamiWyplacanegoWXProcPoZmniejszeniu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWysokoscSwiadczeniaZDodatkamiWyplacanegoWXProcPoZmniejszeniu(BigDecimal value) {
        this.wysokoscSwiadczeniaZDodatkamiWyplacanegoWXProcPoZmniejszeniu = value;
    }

    /**
     * Gets the value of the skladnikSwiadczenia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the skladnikSwiadczenia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkladnikSwiadczenia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SkladnikSwiadczeniaTyp }
     * 
     * 
     */
    public List<SkladnikSwiadczeniaTyp> getSkladnikSwiadczenia() {
        if (skladnikSwiadczenia == null) {
            skladnikSwiadczenia = new ArrayList<SkladnikSwiadczeniaTyp>();
        }
        return this.skladnikSwiadczenia;
    }

    /**
     * Gets the value of the wyplacanyDodatek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the wyplacanyDodatek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWyplacanyDodatek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DodatekWyplacanyZeSwiadczeniemTyp }
     * 
     * 
     */
    public List<DodatekWyplacanyZeSwiadczeniemTyp> getWyplacanyDodatek() {
        if (wyplacanyDodatek == null) {
            wyplacanyDodatek = new ArrayList<DodatekWyplacanyZeSwiadczeniemTyp>();
        }
        return this.wyplacanyDodatek;
    }

}
