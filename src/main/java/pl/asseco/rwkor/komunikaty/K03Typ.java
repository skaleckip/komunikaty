
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Komunikat K03
 * 
 * <p>Java class for K03Typ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="K03Typ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://zus.pl/schematy/b2bior/}KomunikatTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Naglowek" type="{http://zus.pl/schematy/b2bior/}NaglowekK03Typ"/&gt;
 *         &lt;element name="Tresc" type="{http://zus.pl/schematy/b2bior/}TrescK03Typ"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "K03Typ", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "naglowek",
    "tresc"
})
public class K03Typ
    extends KomunikatTyp
{

    @XmlElement(name = "Naglowek", required = true)
    protected NaglowekK03Typ naglowek;
    @XmlElement(name = "Tresc", required = true)
    protected TrescK03Typ tresc;

    /**
     * Gets the value of the naglowek property.
     * 
     * @return
     *     possible object is
     *     {@link NaglowekK03Typ }
     *     
     */
    public NaglowekK03Typ getNaglowek() {
        return naglowek;
    }

    /**
     * Sets the value of the naglowek property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaglowekK03Typ }
     *     
     */
    public void setNaglowek(NaglowekK03Typ value) {
        this.naglowek = value;
    }

    /**
     * Gets the value of the tresc property.
     * 
     * @return
     *     possible object is
     *     {@link TrescK03Typ }
     *     
     */
    public TrescK03Typ getTresc() {
        return tresc;
    }

    /**
     * Sets the value of the tresc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrescK03Typ }
     *     
     */
    public void setTresc(TrescK03Typ value) {
        this.tresc = value;
    }

}
