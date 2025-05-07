
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Treść komunikatu K03 - ustalenie zbiegu świadczenia z rentą rodzinną
 * 
 * <p>Java class for TrescK03UstalenieTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrescK03UstalenieTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://zus.pl/schematy/b2bior/}TrescK03Typ"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusUstaleniaZbiegu"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://zus.pl/schematy/b2bior/}DecyzjaTyp"&gt;
 *               &lt;enumeration value="Ustalenie"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UstalonyZbieg" type="{http://zus.pl/schematy/b2bior/}UstalonyZbiegTyp"/&gt;
 *         &lt;element name="WysokoscSwiadczenPrzedUstaleniemZbiegu" type="{http://zus.pl/schematy/b2bior/}SwiadczeniaPozostajaceWZbieguTyp" minOccurs="0"/&gt;
 *         &lt;element name="WysokoscSwiadczenPoUstaleniuZbiegu" type="{http://zus.pl/schematy/b2bior/}SwiadczeniaPozostajaceWZbieguTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrescK03UstalenieTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "statusUstaleniaZbiegu",
    "ustalonyZbieg",
    "wysokoscSwiadczenPrzedUstaleniemZbiegu",
    "wysokoscSwiadczenPoUstaleniuZbiegu"
})
public class TrescK03UstalenieTyp
    extends TrescK03Typ
{

    @XmlElement(name = "StatusUstaleniaZbiegu", required = true)
    protected DecyzjaTyp statusUstaleniaZbiegu;
    @XmlElement(name = "UstalonyZbieg", required = true)
    protected UstalonyZbiegTyp ustalonyZbieg;
    @XmlElement(name = "WysokoscSwiadczenPrzedUstaleniemZbiegu")
    protected SwiadczeniaPozostajaceWZbieguTyp wysokoscSwiadczenPrzedUstaleniemZbiegu;
    @XmlElement(name = "WysokoscSwiadczenPoUstaleniuZbiegu")
    protected SwiadczeniaPozostajaceWZbieguTyp wysokoscSwiadczenPoUstaleniuZbiegu;

    /**
     * Gets the value of the statusUstaleniaZbiegu property.
     * 
     * @return
     *     possible object is
     *     {@link DecyzjaTyp }
     *     
     */
    public DecyzjaTyp getStatusUstaleniaZbiegu() {
        return statusUstaleniaZbiegu;
    }

    /**
     * Sets the value of the statusUstaleniaZbiegu property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecyzjaTyp }
     *     
     */
    public void setStatusUstaleniaZbiegu(DecyzjaTyp value) {
        this.statusUstaleniaZbiegu = value;
    }

    /**
     * Gets the value of the ustalonyZbieg property.
     * 
     * @return
     *     possible object is
     *     {@link UstalonyZbiegTyp }
     *     
     */
    public UstalonyZbiegTyp getUstalonyZbieg() {
        return ustalonyZbieg;
    }

    /**
     * Sets the value of the ustalonyZbieg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UstalonyZbiegTyp }
     *     
     */
    public void setUstalonyZbieg(UstalonyZbiegTyp value) {
        this.ustalonyZbieg = value;
    }

    /**
     * Gets the value of the wysokoscSwiadczenPrzedUstaleniemZbiegu property.
     * 
     * @return
     *     possible object is
     *     {@link SwiadczeniaPozostajaceWZbieguTyp }
     *     
     */
    public SwiadczeniaPozostajaceWZbieguTyp getWysokoscSwiadczenPrzedUstaleniemZbiegu() {
        return wysokoscSwiadczenPrzedUstaleniemZbiegu;
    }

    /**
     * Sets the value of the wysokoscSwiadczenPrzedUstaleniemZbiegu property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwiadczeniaPozostajaceWZbieguTyp }
     *     
     */
    public void setWysokoscSwiadczenPrzedUstaleniemZbiegu(SwiadczeniaPozostajaceWZbieguTyp value) {
        this.wysokoscSwiadczenPrzedUstaleniemZbiegu = value;
    }

    /**
     * Gets the value of the wysokoscSwiadczenPoUstaleniuZbiegu property.
     * 
     * @return
     *     possible object is
     *     {@link SwiadczeniaPozostajaceWZbieguTyp }
     *     
     */
    public SwiadczeniaPozostajaceWZbieguTyp getWysokoscSwiadczenPoUstaleniuZbiegu() {
        return wysokoscSwiadczenPoUstaleniuZbiegu;
    }

    /**
     * Sets the value of the wysokoscSwiadczenPoUstaleniuZbiegu property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwiadczeniaPozostajaceWZbieguTyp }
     *     
     */
    public void setWysokoscSwiadczenPoUstaleniuZbiegu(SwiadczeniaPozostajaceWZbieguTyp value) {
        this.wysokoscSwiadczenPoUstaleniuZbiegu = value;
    }

}
