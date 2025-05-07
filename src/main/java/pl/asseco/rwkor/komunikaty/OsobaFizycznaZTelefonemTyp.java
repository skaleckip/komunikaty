
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Osoba fizyczna z telefonem
 * 
 * <p>Java class for OsobaFizycznaZTelefonemTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OsobaFizycznaZTelefonemTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://zus.pl/schematy/b2bior/}OsobaFizycznaTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumerTelefonu" type="{http://zus.pl/schematy/b2bior/}TelefonTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OsobaFizycznaZTelefonemTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "numerTelefonu"
})
public class OsobaFizycznaZTelefonemTyp
    extends OsobaFizycznaTyp
{

    @XmlElement(name = "NumerTelefonu")
    protected String numerTelefonu;

    /**
     * Gets the value of the numerTelefonu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    /**
     * Sets the value of the numerTelefonu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerTelefonu(String value) {
        this.numerTelefonu = value;
    }

}
