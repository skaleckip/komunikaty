
package pl.asseco.rwkor.komunikaty;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Okres obowiązywania wysokości i stanu świadczenia
 * 
 * <p>Java class for OkresObowiazywaniaWysokosciIStanuSwiadczeniaTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OkresObowiazywaniaWysokosciIStanuSwiadczeniaTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataOd" type="{http://zus.pl/schematy/b2bior/}DataTyp"/&gt;
 *         &lt;element name="DataDo" type="{http://zus.pl/schematy/b2bior/}DataTyp"/&gt;
 *         &lt;element name="WariantZbieguSwiadczen" type="{http://zus.pl/schematy/b2bior/}WariantZbieguSwiadczenTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OkresObowiazywaniaWysokosciIStanuSwiadczeniaTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "dataOd",
    "dataDo",
    "wariantZbieguSwiadczen"
})
public class OkresObowiazywaniaWysokosciIStanuSwiadczeniaTyp {

    @XmlElement(name = "DataOd", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOd;
    @XmlElement(name = "DataDo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDo;
    @XmlElement(name = "WariantZbieguSwiadczen")
    protected List<WariantZbieguSwiadczenTyp> wariantZbieguSwiadczen;

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

    /**
     * Gets the value of the wariantZbieguSwiadczen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the wariantZbieguSwiadczen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWariantZbieguSwiadczen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WariantZbieguSwiadczenTyp }
     * 
     * 
     */
    public List<WariantZbieguSwiadczenTyp> getWariantZbieguSwiadczen() {
        if (wariantZbieguSwiadczen == null) {
            wariantZbieguSwiadczen = new ArrayList<WariantZbieguSwiadczenTyp>();
        }
        return this.wariantZbieguSwiadczen;
    }

}
