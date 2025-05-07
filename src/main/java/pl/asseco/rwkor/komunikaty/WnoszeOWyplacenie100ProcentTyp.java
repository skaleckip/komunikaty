
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Co wnioskodawca zaznaczył we wniosku ERWD  dla zakresu 'wypłacanie w wysokości 100%'?
 * 
 * <p>Java class for WnoszeOWyplacenie100ProcentTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WnoszeOWyplacenie100ProcentTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="RentyRodzinnej" type="{http://zus.pl/schematy/b2bior/}TakNieTyp"/&gt;
 *         &lt;element name="InnegoSwiadczenia" type="{http://zus.pl/schematy/b2bior/}TakNieTyp"/&gt;
 *         &lt;element name="WyzszegoSwiadczenia" type="{http://zus.pl/schematy/b2bior/}TakNieTyp"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WnoszeOWyplacenie100ProcentTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "rentyRodzinnej",
    "innegoSwiadczenia",
    "wyzszegoSwiadczenia"
})
public class WnoszeOWyplacenie100ProcentTyp {

    @XmlElement(name = "RentyRodzinnej")
    @XmlSchemaType(name = "string")
    protected TakNieTyp rentyRodzinnej;
    @XmlElement(name = "InnegoSwiadczenia")
    @XmlSchemaType(name = "string")
    protected TakNieTyp innegoSwiadczenia;
    @XmlElement(name = "WyzszegoSwiadczenia")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wyzszegoSwiadczenia;

    /**
     * Gets the value of the rentyRodzinnej property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getRentyRodzinnej() {
        return rentyRodzinnej;
    }

    /**
     * Sets the value of the rentyRodzinnej property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setRentyRodzinnej(TakNieTyp value) {
        this.rentyRodzinnej = value;
    }

    /**
     * Gets the value of the innegoSwiadczenia property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getInnegoSwiadczenia() {
        return innegoSwiadczenia;
    }

    /**
     * Sets the value of the innegoSwiadczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setInnegoSwiadczenia(TakNieTyp value) {
        this.innegoSwiadczenia = value;
    }

    /**
     * Gets the value of the wyzszegoSwiadczenia property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWyzszegoSwiadczenia() {
        return wyzszegoSwiadczenia;
    }

    /**
     * Sets the value of the wyzszegoSwiadczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWyzszegoSwiadczenia(TakNieTyp value) {
        this.wyzszegoSwiadczenia = value;
    }

}
