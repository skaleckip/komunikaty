
package pl.asseco.rwkor.komunikaty;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Wariant zbiegu świadczeń
 * 
 * <p>Java class for WariantZbieguSwiadczenTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WariantZbieguSwiadczenTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumerWariantu" type="{http://zus.pl/schematy/b2bior/}LiczbaTyp"/&gt;
 *         &lt;element name="CzyWariantWyplacany" type="{http://zus.pl/schematy/b2bior/}TakNieTyp"/&gt;
 *         &lt;element name="Swiadczenie" type="{http://zus.pl/schematy/b2bior/}SwiadczeniePozostajaceWZbieguTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WariantZbieguSwiadczenTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "numerWariantu",
    "czyWariantWyplacany",
    "swiadczenie"
})
public class WariantZbieguSwiadczenTyp {

    @XmlElement(name = "NumerWariantu", required = true)
    protected String numerWariantu;
    @XmlElement(name = "CzyWariantWyplacany", required = true)
    @XmlSchemaType(name = "string")
    protected TakNieTyp czyWariantWyplacany;
    @XmlElement(name = "Swiadczenie")
    protected List<SwiadczeniePozostajaceWZbieguTyp> swiadczenie;

    /**
     * Gets the value of the numerWariantu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerWariantu() {
        return numerWariantu;
    }

    /**
     * Sets the value of the numerWariantu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerWariantu(String value) {
        this.numerWariantu = value;
    }

    /**
     * Gets the value of the czyWariantWyplacany property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getCzyWariantWyplacany() {
        return czyWariantWyplacany;
    }

    /**
     * Sets the value of the czyWariantWyplacany property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setCzyWariantWyplacany(TakNieTyp value) {
        this.czyWariantWyplacany = value;
    }

    /**
     * Gets the value of the swiadczenie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the swiadczenie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwiadczenie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwiadczeniePozostajaceWZbieguTyp }
     * 
     * 
     */
    public List<SwiadczeniePozostajaceWZbieguTyp> getSwiadczenie() {
        if (swiadczenie == null) {
            swiadczenie = new ArrayList<SwiadczeniePozostajaceWZbieguTyp>();
        }
        return this.swiadczenie;
    }

}
