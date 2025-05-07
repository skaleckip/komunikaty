
package pl.asseco.rwkor.komunikaty;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Okres potwierdzenia
 * 
 * <p>Java class for OkresPotwierdzeniaTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OkresPotwierdzeniaTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataOd" type="{http://zus.pl/schematy/b2bior/}DataTyp"/&gt;
 *         &lt;element name="DataDo" type="{http://zus.pl/schematy/b2bior/}DataTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OkresPotwierdzeniaTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "dataOd",
    "dataDo"
})
public class OkresPotwierdzeniaTyp {

    @XmlElement(name = "DataOd", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOd;
    @XmlElement(name = "DataDo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDo;

    /**
     * Gets the value of the dataOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOd() {
        return dataOd;
    }

    /**
     * Sets the value of the dataOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOd(XMLGregorianCalendar value) {
        this.dataOd = value;
    }

    /**
     * Gets the value of the dataDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDo() {
        return dataDo;
    }

    /**
     * Sets the value of the dataDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDo(XMLGregorianCalendar value) {
        this.dataDo = value;
    }

}
