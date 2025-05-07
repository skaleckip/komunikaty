
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Unikalny identyfikator komunikatu, na który odpowiada niniejszy komunikat
 * 
 * <p>Java class for UUIDOdpowiedziK05 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UUIDOdpowiedziK05"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://zus.pl/schematy/b2bior/}UUIDTyp"/&gt;
 *         &lt;element name="Symbol"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://zus.pl/schematy/b2bior/}SymbolKomunikatuTyp"&gt;
 *               &lt;enumeration value="K01"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UUIDOdpowiedziK05", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "uuid",
    "symbol"
})
public class UUIDOdpowiedziK05 {

    @XmlElement(name = "UUID", required = true)
    protected String uuid;
    @XmlElement(name = "Symbol", required = true)
    protected SymbolKomunikatuTyp symbol;

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

}
