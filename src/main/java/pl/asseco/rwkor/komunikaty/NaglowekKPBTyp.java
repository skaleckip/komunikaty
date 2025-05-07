
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Nagłówek komunikatu KPB
 * 
 * <p>Java class for NaglowekKPBTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NaglowekKPBTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Symbol"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://zus.pl/schematy/b2bior/}SymbolKomunikatuTyp"&gt;
 *               &lt;enumeration value="KPB"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WersjaSchematu"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://zus.pl/schematy/b2bior/}WersjaSchematuTyp"&gt;
 *               &lt;enumeration value="1.2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UUID" type="{http://zus.pl/schematy/b2bior/}UUIDTyp"/&gt;
 *         &lt;element name="UUIDOdpowiedzi" type="{http://zus.pl/schematy/b2bior/}UUIDOdpowiedziKPB"/&gt;
 *         &lt;element name="Nadawca" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="Adresat" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaglowekKPBTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "symbol",
    "wersjaSchematu",
    "uuid",
    "uuidOdpowiedzi",
    "nadawca",
    "adresat"
})
public class NaglowekKPBTyp {

    @XmlElement(name = "Symbol", required = true)
    protected SymbolKomunikatuTyp symbol;
    @XmlElement(name = "WersjaSchematu", required = true)
    protected String wersjaSchematu;
    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "UUIDOdpowiedzi", required = true)
    protected UUIDOdpowiedziKPB uuidOdpowiedzi;
    @XmlElement(name = "Nadawca", required = true)
    protected String nadawca;
    @XmlElement(name = "Adresat", required = true)
    protected String adresat;

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link SymbolKomunikatuTyp }
     *     
     */
    public SymbolKomunikatuTyp getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolKomunikatuTyp }
     *     
     */
    public void setSymbol(SymbolKomunikatuTyp value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the wersjaSchematu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWersjaSchematu() {
        return wersjaSchematu;
    }

    /**
     * Sets the value of the wersjaSchematu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWersjaSchematu(String value) {
        this.wersjaSchematu = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the uuidOdpowiedzi property.
     * 
     * @return
     *     possible object is
     *     {@link UUIDOdpowiedziKPB }
     *     
     */
    public UUIDOdpowiedziKPB getUUIDOdpowiedzi() {
        return uuidOdpowiedzi;
    }

    /**
     * Sets the value of the uuidOdpowiedzi property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUIDOdpowiedziKPB }
     *     
     */
    public void setUUIDOdpowiedzi(UUIDOdpowiedziKPB value) {
        this.uuidOdpowiedzi = value;
    }

    /**
     * Gets the value of the nadawca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNadawca() {
        return nadawca;
    }

    /**
     * Sets the value of the nadawca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNadawca(String value) {
        this.nadawca = value;
    }

    /**
     * Gets the value of the adresat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresat() {
        return adresat;
    }

    /**
     * Sets the value of the adresat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresat(String value) {
        this.adresat = value;
    }

}
