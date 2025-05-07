
package pl.asseco.rwkor.komunikaty;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dane ewidencyjne wniosku
 * 
 * <p>Java class for DaneEwidencyjneWnioskuTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DaneEwidencyjneWnioskuTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataZgloszenia" type="{http://zus.pl/schematy/b2bior/}DataTyp"/&gt;
 *         &lt;element name="DataWplywu" type="{http://zus.pl/schematy/b2bior/}DataTyp"/&gt;
 *         &lt;element name="BiegWniosku" type="{http://zus.pl/schematy/b2bior/}BiegWnioskuTyp"/&gt;
 *         &lt;element name="DataNadaniaBiegu" type="{http://zus.pl/schematy/b2bior/}DataTyp"/&gt;
 *         &lt;element name="DataUmorzenia" type="{http://zus.pl/schematy/b2bior/}DataTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DaneEwidencyjneWnioskuTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "dataZgloszenia",
    "dataWplywu",
    "biegWniosku",
    "dataNadaniaBiegu",
    "dataUmorzenia"
})
public class DaneEwidencyjneWnioskuTyp {

    @XmlElement(name = "DataZgloszenia", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataZgloszenia;
    @XmlElement(name = "DataWplywu", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataWplywu;
    @XmlElement(name = "BiegWniosku", required = true)
    protected String biegWniosku;
    @XmlElement(name = "DataNadaniaBiegu", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNadaniaBiegu;
    @XmlElement(name = "DataUmorzenia")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataUmorzenia;

    /**
     * Gets the value of the dataZgloszenia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataZgloszenia() {
        return dataZgloszenia;
    }

    /**
     * Sets the value of the dataZgloszenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataZgloszenia(XMLGregorianCalendar value) {
        this.dataZgloszenia = value;
    }

    /**
     * Gets the value of the dataWplywu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataWplywu() {
        return dataWplywu;
    }

    /**
     * Sets the value of the dataWplywu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataWplywu(XMLGregorianCalendar value) {
        this.dataWplywu = value;
    }

    /**
     * Gets the value of the biegWniosku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiegWniosku() {
        return biegWniosku;
    }

    /**
     * Sets the value of the biegWniosku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiegWniosku(String value) {
        this.biegWniosku = value;
    }

    /**
     * Gets the value of the dataNadaniaBiegu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNadaniaBiegu() {
        return dataNadaniaBiegu;
    }

    /**
     * Sets the value of the dataNadaniaBiegu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNadaniaBiegu(XMLGregorianCalendar value) {
        this.dataNadaniaBiegu = value;
    }

    /**
     * Gets the value of the dataUmorzenia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataUmorzenia() {
        return dataUmorzenia;
    }

    /**
     * Sets the value of the dataUmorzenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataUmorzenia(XMLGregorianCalendar value) {
        this.dataUmorzenia = value;
    }

}
