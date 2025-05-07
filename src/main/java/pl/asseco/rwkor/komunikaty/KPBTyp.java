
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Komunikat KPB
 * 
 * <p>Java class for KPBTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KPBTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://zus.pl/schematy/b2bior/}KomunikatTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Naglowek" type="{http://zus.pl/schematy/b2bior/}NaglowekKPBTyp"/&gt;
 *         &lt;element name="Tresc" type="{http://zus.pl/schematy/b2bior/}TrescKPBTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KPBTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "naglowek",
    "tresc"
})
public class KPBTyp
    extends KomunikatTyp
{

    @XmlElement(name = "Naglowek", required = true)
    protected NaglowekKPBTyp naglowek;
    @XmlElement(name = "Tresc", required = true)
    protected TrescKPBTyp tresc;

    /**
     * Gets the value of the naglowek property.
     * 
     * @return
     *     possible object is
     *     {@link NaglowekKPBTyp }
     *     
     */
    public NaglowekKPBTyp getNaglowek() {
        return naglowek;
    }

    /**
     * Sets the value of the naglowek property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaglowekKPBTyp }
     *     
     */
    public void setNaglowek(NaglowekKPBTyp value) {
        this.naglowek = value;
    }

    /**
     * Gets the value of the tresc property.
     * 
     * @return
     *     possible object is
     *     {@link TrescKPBTyp }
     *     
     */
    public TrescKPBTyp getTresc() {
        return tresc;
    }

    /**
     * Sets the value of the tresc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrescKPBTyp }
     *     
     */
    public void setTresc(TrescKPBTyp value) {
        this.tresc = value;
    }

}
