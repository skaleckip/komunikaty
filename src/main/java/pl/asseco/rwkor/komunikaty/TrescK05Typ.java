
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Treść komunikatu K05
 * 
 * <p>Java class for TrescK05Typ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrescK05Typ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SymbolORZ" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="SymbolORS" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="NumerPonaglenia" type="{http://zus.pl/schematy/b2bior/}LiczbaTyp"/&gt;
 *         &lt;element name="DaneZadania" type="{http://zus.pl/schematy/b2bior/}DaneZadaniaTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrescK05Typ", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "symbolORZ",
    "symbolORS",
    "numerPonaglenia",
    "daneZadania"
})
public class TrescK05Typ {

    @XmlElement(name = "SymbolORZ", required = true)
    protected String symbolORZ;
    @XmlElement(name = "SymbolORS", required = true)
    protected String symbolORS;
    @XmlElement(name = "NumerPonaglenia", required = true)
    protected String numerPonaglenia;
    @XmlElement(name = "DaneZadania", required = true)
    protected DaneZadaniaTyp daneZadania;

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
     * Gets the value of the numerPonaglenia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerPonaglenia() {
        return numerPonaglenia;
    }

    /**
     * Sets the value of the numerPonaglenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerPonaglenia(String value) {
        this.numerPonaglenia = value;
    }

    /**
     * Gets the value of the daneZadania property.
     * 
     * @return
     *     possible object is
     *     {@link DaneZadaniaTyp }
     *     
     */
    public DaneZadaniaTyp getDaneZadania() {
        return daneZadania;
    }

    /**
     * Sets the value of the daneZadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaneZadaniaTyp }
     *     
     */
    public void setDaneZadania(DaneZadaniaTyp value) {
        this.daneZadania = value;
    }

}
