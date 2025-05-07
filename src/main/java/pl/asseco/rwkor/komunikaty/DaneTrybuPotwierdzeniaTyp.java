
package pl.asseco.rwkor.komunikaty;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dane trybu potwierdzenia
 * 
 * <p>Java class for DaneTrybuPotwierdzeniaTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DaneTrybuPotwierdzeniaTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrybPotwierdzenia" type="{http://zus.pl/schematy/b2bior/}TrybPotwierdzeniaTyp"/&gt;
 *         &lt;element name="PowodZmiany" type="{http://zus.pl/schematy/b2bior/}PowodZmianyTyp" minOccurs="0"/&gt;
 *         &lt;element name="DataZmianyZgonu" type="{http://zus.pl/schematy/b2bior/}DataTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DaneTrybuPotwierdzeniaTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "trybPotwierdzenia",
    "powodZmiany",
    "dataZmianyZgonu"
})
public class DaneTrybuPotwierdzeniaTyp {

    @XmlElement(name = "TrybPotwierdzenia", required = true)
    protected String trybPotwierdzenia;
    @XmlElement(name = "PowodZmiany")
    protected String powodZmiany;
    @XmlElement(name = "DataZmianyZgonu")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataZmianyZgonu;

    /**
     * Gets the value of the trybPotwierdzenia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrybPotwierdzenia() {
        return trybPotwierdzenia;
    }

    /**
     * Sets the value of the trybPotwierdzenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrybPotwierdzenia(String value) {
        this.trybPotwierdzenia = value;
    }

    /**
     * Gets the value of the powodZmiany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowodZmiany() {
        return powodZmiany;
    }

    /**
     * Sets the value of the powodZmiany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowodZmiany(String value) {
        this.powodZmiany = value;
    }

    /**
     * Gets the value of the dataZmianyZgonu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataZmianyZgonu() {
        return dataZmianyZgonu;
    }

    /**
     * Sets the value of the dataZmianyZgonu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataZmianyZgonu(XMLGregorianCalendar value) {
        this.dataZmianyZgonu = value;
    }

}
