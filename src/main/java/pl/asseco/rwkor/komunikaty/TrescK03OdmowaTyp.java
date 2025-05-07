
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Treść komunikatu K03 - odmowa ustalenia zbiegu świadczenia z rentą rodzinną
 * 
 * <p>Java class for TrescK03OdmowaTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrescK03OdmowaTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://zus.pl/schematy/b2bior/}TrescK03Typ"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusUstaleniaZbiegu"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://zus.pl/schematy/b2bior/}DecyzjaTyp"&gt;
 *               &lt;enumeration value="Odmowa"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrescK03OdmowaTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "statusUstaleniaZbiegu"
})
public class TrescK03OdmowaTyp
    extends TrescK03Typ
{

    @XmlElement(name = "StatusUstaleniaZbiegu", required = true)
    protected DecyzjaTyp statusUstaleniaZbiegu;

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

}
