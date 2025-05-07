
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Komunikat K01
 * 
 * <p>Java class for K01Typ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="K01Typ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://zus.pl/schematy/b2bior/}KomunikatTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Naglowek" type="{http://zus.pl/schematy/b2bior/}NaglowekK01Typ"/&gt;
 *         &lt;element name="Tresc" type="{http://zus.pl/schematy/b2bior/}TrescK01Typ"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "K01Typ", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "naglowek",
    "tresc"
})
public class K01Typ
    extends KomunikatTyp
{

    @XmlElement(name = "Naglowek", required = true)
    protected NaglowekK01Typ naglowek;
    @XmlElement(name = "Tresc", required = true)
    protected TrescK01Typ tresc;

    /**
     * Gets the value of the naglowek property.
     * 
     * @return
     *     possible object is
     *     {@link NaglowekK01Typ }
     *     
     */
    public NaglowekK01Typ getNaglowek() {
        return naglowek;
    }

    /**
     * Sets the value of the naglowek property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaglowekK01Typ }
     *     
     */
    public void setNaglowek(NaglowekK01Typ value) {
        this.naglowek = value;
    }

    /**
     * Gets the value of the tresc property.
     * 
     * @return
     *     possible object is
     *     {@link TrescK01Typ }
     *     
     */
    public TrescK01Typ getTresc() {
        return tresc;
    }

    /**
     * Sets the value of the tresc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrescK01Typ }
     *     
     */
    public void setTresc(TrescK01Typ value) {
        this.tresc = value;
    }

}
