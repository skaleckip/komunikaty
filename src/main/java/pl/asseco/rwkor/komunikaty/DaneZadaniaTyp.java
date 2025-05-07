
package pl.asseco.rwkor.komunikaty;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Informacje dotyczące żądania
 * 
 * <p>Java class for DaneZadaniaTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DaneZadaniaTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWyslaniaZadania" type="{http://zus.pl/schematy/b2bior/}DataTyp"/&gt;
 *         &lt;element name="NiedotrzymanyTerminOdpowiedziNaZadanie" type="{http://zus.pl/schematy/b2bior/}DataTyp"/&gt;
 *         &lt;element name="NiedotrzymanyTerminOdpowiedziNaPonaglenie" type="{http://zus.pl/schematy/b2bior/}DataTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DaneZadaniaTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "dataWyslaniaZadania",
    "niedotrzymanyTerminOdpowiedziNaZadanie",
    "niedotrzymanyTerminOdpowiedziNaPonaglenie"
})
public class DaneZadaniaTyp {

    @XmlElement(name = "DataWyslaniaZadania", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataWyslaniaZadania;
    @XmlElement(name = "NiedotrzymanyTerminOdpowiedziNaZadanie", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar niedotrzymanyTerminOdpowiedziNaZadanie;
    @XmlElement(name = "NiedotrzymanyTerminOdpowiedziNaPonaglenie")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar niedotrzymanyTerminOdpowiedziNaPonaglenie;

    /**
     * Gets the value of the dataWyslaniaZadania property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataWyslaniaZadania() {
        return dataWyslaniaZadania;
    }

    /**
     * Sets the value of the dataWyslaniaZadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataWyslaniaZadania(XMLGregorianCalendar value) {
        this.dataWyslaniaZadania = value;
    }

    /**
     * Gets the value of the niedotrzymanyTerminOdpowiedziNaZadanie property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNiedotrzymanyTerminOdpowiedziNaZadanie() {
        return niedotrzymanyTerminOdpowiedziNaZadanie;
    }

    /**
     * Sets the value of the niedotrzymanyTerminOdpowiedziNaZadanie property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNiedotrzymanyTerminOdpowiedziNaZadanie(XMLGregorianCalendar value) {
        this.niedotrzymanyTerminOdpowiedziNaZadanie = value;
    }

    /**
     * Gets the value of the niedotrzymanyTerminOdpowiedziNaPonaglenie property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNiedotrzymanyTerminOdpowiedziNaPonaglenie() {
        return niedotrzymanyTerminOdpowiedziNaPonaglenie;
    }

    /**
     * Sets the value of the niedotrzymanyTerminOdpowiedziNaPonaglenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNiedotrzymanyTerminOdpowiedziNaPonaglenie(XMLGregorianCalendar value) {
        this.niedotrzymanyTerminOdpowiedziNaPonaglenie = value;
    }

}
