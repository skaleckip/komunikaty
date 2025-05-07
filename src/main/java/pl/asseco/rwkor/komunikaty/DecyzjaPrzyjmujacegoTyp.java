
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Decyzja przyjmującego
 * 
 * <p>Java class for DecyzjaPrzyjmujacegoTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecyzjaPrzyjmujacegoTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CzyPrzyjetoKomunikat" type="{http://zus.pl/schematy/b2bior/}TakNieTyp"/&gt;
 *         &lt;element name="ListaBledow" type="{http://zus.pl/schematy/b2bior/}ListaBledowTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecyzjaPrzyjmujacegoTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "czyPrzyjetoKomunikat",
    "listaBledow"
})
public class DecyzjaPrzyjmujacegoTyp {

    @XmlElement(name = "CzyPrzyjetoKomunikat", required = true)
    @XmlSchemaType(name = "string")
    protected TakNieTyp czyPrzyjetoKomunikat;
    @XmlElement(name = "ListaBledow")
    protected ListaBledowTyp listaBledow;

    /**
     * Gets the value of the czyPrzyjetoKomunikat property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getCzyPrzyjetoKomunikat() {
        return czyPrzyjetoKomunikat;
    }

    /**
     * Sets the value of the czyPrzyjetoKomunikat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setCzyPrzyjetoKomunikat(TakNieTyp value) {
        this.czyPrzyjetoKomunikat = value;
    }

    /**
     * Gets the value of the listaBledow property.
     * 
     * @return
     *     possible object is
     *     {@link ListaBledowTyp }
     *     
     */
    public ListaBledowTyp getListaBledow() {
        return listaBledow;
    }

    /**
     * Sets the value of the listaBledow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaBledowTyp }
     *     
     */
    public void setListaBledow(ListaBledowTyp value) {
        this.listaBledow = value;
    }

}
