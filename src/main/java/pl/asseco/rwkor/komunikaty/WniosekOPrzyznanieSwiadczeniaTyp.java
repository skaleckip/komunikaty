
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Wniosek o przyznanie świadczenia
 * 
 * <p>Java class for WniosekOPrzyznanieSwiadczeniaTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WniosekOPrzyznanieSwiadczeniaTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CzyZlozonyWniosekRentaRodzinna" type="{http://zus.pl/schematy/b2bior/}TakNieTyp"/&gt;
 *         &lt;element name="CzyZlozonyWniosekInneSwiadczenie" type="{http://zus.pl/schematy/b2bior/}TakNieTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WniosekOPrzyznanieSwiadczeniaTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "czyZlozonyWniosekRentaRodzinna",
    "czyZlozonyWniosekInneSwiadczenie"
})
public class WniosekOPrzyznanieSwiadczeniaTyp {

    @XmlElement(name = "CzyZlozonyWniosekRentaRodzinna", required = true)
    @XmlSchemaType(name = "string")
    protected TakNieTyp czyZlozonyWniosekRentaRodzinna;
    @XmlElement(name = "CzyZlozonyWniosekInneSwiadczenie", required = true)
    @XmlSchemaType(name = "string")
    protected TakNieTyp czyZlozonyWniosekInneSwiadczenie;

    /**
     * Gets the value of the czyZlozonyWniosekRentaRodzinna property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getCzyZlozonyWniosekRentaRodzinna() {
        return czyZlozonyWniosekRentaRodzinna;
    }

    /**
     * Sets the value of the czyZlozonyWniosekRentaRodzinna property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setCzyZlozonyWniosekRentaRodzinna(TakNieTyp value) {
        this.czyZlozonyWniosekRentaRodzinna = value;
    }

    /**
     * Gets the value of the czyZlozonyWniosekInneSwiadczenie property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getCzyZlozonyWniosekInneSwiadczenie() {
        return czyZlozonyWniosekInneSwiadczenie;
    }

    /**
     * Sets the value of the czyZlozonyWniosekInneSwiadczenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setCzyZlozonyWniosekInneSwiadczenie(TakNieTyp value) {
        this.czyZlozonyWniosekInneSwiadczenie = value;
    }

}
