
package pl.asseco.rwkor.komunikaty;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Wymagany dzień albo okres potwierdzenia
 * 
 * <p>Java class for DzienLubOkresTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DzienLubOkresTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="OkresPotwierdzenia" type="{http://zus.pl/schematy/b2bior/}OkresPotwierdzeniaTyp"/&gt;
 *         &lt;element name="Dzien" type="{http://zus.pl/schematy/b2bior/}DataTyp"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DzienLubOkresTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "okresPotwierdzenia",
    "dzien"
})
public class DzienLubOkresTyp {

    @XmlElement(name = "OkresPotwierdzenia")
    protected OkresPotwierdzeniaTyp okresPotwierdzenia;
    @XmlElement(name = "Dzien")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dzien;

    /**
     * Gets the value of the okresPotwierdzenia property.
     * 
     * @return
     *     possible object is
     *     {@link OkresPotwierdzeniaTyp }
     *     
     */
    public OkresPotwierdzeniaTyp getOkresPotwierdzenia() {
        return okresPotwierdzenia;
    }

    /**
     * Sets the value of the okresPotwierdzenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkresPotwierdzeniaTyp }
     *     
     */
    public void setOkresPotwierdzenia(OkresPotwierdzeniaTyp value) {
        this.okresPotwierdzenia = value;
    }

    /**
     * Gets the value of the dzien property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDzien() {
        return dzien;
    }

    /**
     * Sets the value of the dzien property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDzien(XMLGregorianCalendar value) {
        this.dzien = value;
    }

}
