
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Treść komunikatu KPB
 * 
 * <p>Java class for TrescKPBTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrescKPBTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SymbolOrganuPotwierdzajacego" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="SymbolOrganuOczekujacegoPotwierdzenia" type="{http://zus.pl/schematy/b2bior/}OrganRentowyTyp"/&gt;
 *         &lt;element name="DecyzjaPrzyjmujacego" type="{http://zus.pl/schematy/b2bior/}DecyzjaPrzyjmujacegoTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrescKPBTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "symbolOrganuPotwierdzajacego",
    "symbolOrganuOczekujacegoPotwierdzenia",
    "decyzjaPrzyjmujacego"
})
public class TrescKPBTyp {

    @XmlElement(name = "SymbolOrganuPotwierdzajacego", required = true)
    protected String symbolOrganuPotwierdzajacego;
    @XmlElement(name = "SymbolOrganuOczekujacegoPotwierdzenia", required = true)
    protected String symbolOrganuOczekujacegoPotwierdzenia;
    @XmlElement(name = "DecyzjaPrzyjmujacego", required = true)
    protected DecyzjaPrzyjmujacegoTyp decyzjaPrzyjmujacego;

    /**
     * Gets the value of the symbolOrganuPotwierdzajacego property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolOrganuPotwierdzajacego() {
        return symbolOrganuPotwierdzajacego;
    }

    /**
     * Sets the value of the symbolOrganuPotwierdzajacego property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolOrganuPotwierdzajacego(String value) {
        this.symbolOrganuPotwierdzajacego = value;
    }

    /**
     * Gets the value of the symbolOrganuOczekujacegoPotwierdzenia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolOrganuOczekujacegoPotwierdzenia() {
        return symbolOrganuOczekujacegoPotwierdzenia;
    }

    /**
     * Sets the value of the symbolOrganuOczekujacegoPotwierdzenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolOrganuOczekujacegoPotwierdzenia(String value) {
        this.symbolOrganuOczekujacegoPotwierdzenia = value;
    }

    /**
     * Gets the value of the decyzjaPrzyjmujacego property.
     * 
     * @return
     *     possible object is
     *     {@link DecyzjaPrzyjmujacegoTyp }
     *     
     */
    public DecyzjaPrzyjmujacegoTyp getDecyzjaPrzyjmujacego() {
        return decyzjaPrzyjmujacego;
    }

    /**
     * Sets the value of the decyzjaPrzyjmujacego property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecyzjaPrzyjmujacegoTyp }
     *     
     */
    public void setDecyzjaPrzyjmujacego(DecyzjaPrzyjmujacegoTyp value) {
        this.decyzjaPrzyjmujacego = value;
    }

}
