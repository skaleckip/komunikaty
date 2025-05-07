
package pl.asseco.rwkor.komunikaty;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Składniki świadczenia
 * 
 * <p>Java class for SkladnikSwiadczeniaTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SkladnikSwiadczeniaTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KodSkladnikaSwiadczenia" type="{http://zus.pl/schematy/b2bior/}Tekst20Typ"/&gt;
 *         &lt;element name="SymbolGrupyFinansowaniaPomniejszenia" type="{http://zus.pl/schematy/b2bior/}SymbolGrupyFinansowaniaPomniejszeniaTyp"/&gt;
 *         &lt;element name="SposobZmniejszeniaSkladnikaWSwiadczeniu" type="{http://zus.pl/schematy/b2bior/}SposobZmniejszeniaSkladnikaWSwiadczeniuTyp"/&gt;
 *         &lt;element name="WysokoscSkladnika" type="{http://zus.pl/schematy/b2bior/}KwotaTyp"/&gt;
 *         &lt;element name="WysokoscSkladnikaWyplacanegoWXProc" type="{http://zus.pl/schematy/b2bior/}KwotaTyp"/&gt;
 *         &lt;element name="WysokoscSkladnikaWyplacanegoWXProcPoZmniejszeniu" type="{http://zus.pl/schematy/b2bior/}KwotaTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkladnikSwiadczeniaTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "kodSkladnikaSwiadczenia",
    "symbolGrupyFinansowaniaPomniejszenia",
    "sposobZmniejszeniaSkladnikaWSwiadczeniu",
    "wysokoscSkladnika",
    "wysokoscSkladnikaWyplacanegoWXProc",
    "wysokoscSkladnikaWyplacanegoWXProcPoZmniejszeniu"
})
public class SkladnikSwiadczeniaTyp {

    @XmlElement(name = "KodSkladnikaSwiadczenia", required = true)
    protected String kodSkladnikaSwiadczenia;
    @XmlElement(name = "SymbolGrupyFinansowaniaPomniejszenia", required = true)
    protected String symbolGrupyFinansowaniaPomniejszenia;
    @XmlElement(name = "SposobZmniejszeniaSkladnikaWSwiadczeniu", required = true)
    protected String sposobZmniejszeniaSkladnikaWSwiadczeniu;
    @XmlElement(name = "WysokoscSkladnika", required = true)
    protected BigDecimal wysokoscSkladnika;
    @XmlElement(name = "WysokoscSkladnikaWyplacanegoWXProc", required = true)
    protected BigDecimal wysokoscSkladnikaWyplacanegoWXProc;
    @XmlElement(name = "WysokoscSkladnikaWyplacanegoWXProcPoZmniejszeniu", required = true)
    protected BigDecimal wysokoscSkladnikaWyplacanegoWXProcPoZmniejszeniu;

    /**
     * Gets the value of the kodSkladnikaSwiadczenia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodSkladnikaSwiadczenia() {
        return kodSkladnikaSwiadczenia;
    }

    /**
     * Sets the value of the kodSkladnikaSwiadczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodSkladnikaSwiadczenia(String value) {
        this.kodSkladnikaSwiadczenia = value;
    }

    /**
     * Gets the value of the symbolGrupyFinansowaniaPomniejszenia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolGrupyFinansowaniaPomniejszenia() {
        return symbolGrupyFinansowaniaPomniejszenia;
    }

    /**
     * Sets the value of the symbolGrupyFinansowaniaPomniejszenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolGrupyFinansowaniaPomniejszenia(String value) {
        this.symbolGrupyFinansowaniaPomniejszenia = value;
    }

    /**
     * Gets the value of the sposobZmniejszeniaSkladnikaWSwiadczeniu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSposobZmniejszeniaSkladnikaWSwiadczeniu() {
        return sposobZmniejszeniaSkladnikaWSwiadczeniu;
    }

    /**
     * Sets the value of the sposobZmniejszeniaSkladnikaWSwiadczeniu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSposobZmniejszeniaSkladnikaWSwiadczeniu(String value) {
        this.sposobZmniejszeniaSkladnikaWSwiadczeniu = value;
    }

    /**
     * Gets the value of the wysokoscSkladnika property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWysokoscSkladnika() {
        return wysokoscSkladnika;
    }

    /**
     * Sets the value of the wysokoscSkladnika property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWysokoscSkladnika(BigDecimal value) {
        this.wysokoscSkladnika = value;
    }

    /**
     * Gets the value of the wysokoscSkladnikaWyplacanegoWXProc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWysokoscSkladnikaWyplacanegoWXProc() {
        return wysokoscSkladnikaWyplacanegoWXProc;
    }

    /**
     * Sets the value of the wysokoscSkladnikaWyplacanegoWXProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWysokoscSkladnikaWyplacanegoWXProc(BigDecimal value) {
        this.wysokoscSkladnikaWyplacanegoWXProc = value;
    }

    /**
     * Gets the value of the wysokoscSkladnikaWyplacanegoWXProcPoZmniejszeniu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWysokoscSkladnikaWyplacanegoWXProcPoZmniejszeniu() {
        return wysokoscSkladnikaWyplacanegoWXProcPoZmniejszeniu;
    }

    /**
     * Sets the value of the wysokoscSkladnikaWyplacanegoWXProcPoZmniejszeniu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWysokoscSkladnikaWyplacanegoWXProcPoZmniejszeniu(BigDecimal value) {
        this.wysokoscSkladnikaWyplacanegoWXProcPoZmniejszeniu = value;
    }

}
