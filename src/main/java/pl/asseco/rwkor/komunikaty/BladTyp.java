
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Błąd uniemożliwiający przyjęcie komunikatu
 * 
 * <p>Java class for BladTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BladTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kod" type="{http://zus.pl/schematy/b2bior/}KodBleduTyp"/&gt;
 *         &lt;element name="MiejsceWystapienia" type="{http://zus.pl/schematy/b2bior/}MiejsceWystapieniaTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BladTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "kod",
    "miejsceWystapienia"
})
public class BladTyp {

    @XmlElement(name = "Kod", required = true)
    protected String kod;
    @XmlElement(name = "MiejsceWystapienia", required = true)
    protected String miejsceWystapienia;

    /**
     * Gets the value of the kod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKod() {
        return kod;
    }

    /**
     * Sets the value of the kod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKod(String value) {
        this.kod = value;
    }

    /**
     * Gets the value of the miejsceWystapienia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiejsceWystapienia() {
        return miejsceWystapienia;
    }

    /**
     * Sets the value of the miejsceWystapienia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiejsceWystapienia(String value) {
        this.miejsceWystapienia = value;
    }

}
