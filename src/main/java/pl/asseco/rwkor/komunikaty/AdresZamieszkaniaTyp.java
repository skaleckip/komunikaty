
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Adres zamieszkania
 * 
 * <p>Java class for AdresZamieszkaniaTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdresZamieszkaniaTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://zus.pl/schematy/b2bior/}AdresZamieszkaniaBezPanstwaTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NazwaPanstwa" type="{http://zus.pl/schematy/b2bior/}NazwaPanstwaTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdresZamieszkaniaTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "nazwaPanstwa"
})
public class AdresZamieszkaniaTyp
    extends AdresZamieszkaniaBezPanstwaTyp
{

    @XmlElement(name = "NazwaPanstwa")
    protected String nazwaPanstwa;

    /**
     * Gets the value of the nazwaPanstwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwaPanstwa() {
        return nazwaPanstwa;
    }

    /**
     * Sets the value of the nazwaPanstwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwaPanstwa(String value) {
        this.nazwaPanstwa = value;
    }

}
