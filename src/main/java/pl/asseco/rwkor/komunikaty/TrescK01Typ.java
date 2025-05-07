
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Treść komunikatu K01
 * 
 * <p>Java class for TrescK01Typ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrescK01Typ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SymbolORZ" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="SymbolORS" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="PowodZadania" type="{http://zus.pl/schematy/b2bior/}PowodZadaniaTyp"/&gt;
 *         &lt;element name="DzienLubOkresPotwierdzenia" type="{http://zus.pl/schematy/b2bior/}DzienLubOkresTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrescK01Typ", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "symbolORZ",
    "symbolORS",
    "powodZadania",
    "dzienLubOkresPotwierdzenia"
})
public class TrescK01Typ {

    @XmlElement(name = "SymbolORZ", required = true)
    protected String symbolORZ;
    @XmlElement(name = "SymbolORS", required = true)
    protected String symbolORS;
    @XmlElement(name = "PowodZadania", required = true)
    protected String powodZadania;
    @XmlElement(name = "DzienLubOkresPotwierdzenia")
    protected DzienLubOkresTyp dzienLubOkresPotwierdzenia;

    /**
     * Gets the value of the symbolORZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolORZ() {
        return symbolORZ;
    }

    /**
     * Sets the value of the symbolORZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolORZ(String value) {
        this.symbolORZ = value;
    }

    /**
     * Gets the value of the symbolORS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolORS() {
        return symbolORS;
    }

    /**
     * Sets the value of the symbolORS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolORS(String value) {
        this.symbolORS = value;
    }

    /**
     * Gets the value of the powodZadania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowodZadania() {
        return powodZadania;
    }

    /**
     * Sets the value of the powodZadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowodZadania(String value) {
        this.powodZadania = value;
    }

    /**
     * Gets the value of the dzienLubOkresPotwierdzenia property.
     * 
     * @return
     *     possible object is
     *     {@link DzienLubOkresTyp }
     *     
     */
    public DzienLubOkresTyp getDzienLubOkresPotwierdzenia() {
        return dzienLubOkresPotwierdzenia;
    }

    /**
     * Sets the value of the dzienLubOkresPotwierdzenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link DzienLubOkresTyp }
     *     
     */
    public void setDzienLubOkresPotwierdzenia(DzienLubOkresTyp value) {
        this.dzienLubOkresPotwierdzenia = value;
    }

}
