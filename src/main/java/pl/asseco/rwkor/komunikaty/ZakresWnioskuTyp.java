
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Zakres wniosku
 * 
 * <p>Java class for ZakresWnioskuTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZakresWnioskuTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WnoszeOWyplacenie100Procent" type="{http://zus.pl/schematy/b2bior/}WnoszeOWyplacenie100ProcentTyp"/&gt;
 *         &lt;element name="WnoszeOWyplacanieSwiadczenKtoreObecniePobieram" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="SwiadczenieWZbieguProszePrzekazywac" type="{http://zus.pl/schematy/b2bior/}SwiadczenieWZbieguProszePrzekazywacTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZakresWnioskuTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "wnoszeOWyplacenie100Procent",
    "wnoszeOWyplacanieSwiadczenKtoreObecniePobieram",
    "swiadczenieWZbieguProszePrzekazywac"
})
public class ZakresWnioskuTyp {

    @XmlElement(name = "WnoszeOWyplacenie100Procent", required = true)
    protected WnoszeOWyplacenie100ProcentTyp wnoszeOWyplacenie100Procent;
    @XmlElement(name = "WnoszeOWyplacanieSwiadczenKtoreObecniePobieram")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wnoszeOWyplacanieSwiadczenKtoreObecniePobieram;
    @XmlElement(name = "SwiadczenieWZbieguProszePrzekazywac", required = true)
    protected SwiadczenieWZbieguProszePrzekazywacTyp swiadczenieWZbieguProszePrzekazywac;

    /**
     * Gets the value of the wnoszeOWyplacenie100Procent property.
     * 
     * @return
     *     possible object is
     *     {@link WnoszeOWyplacenie100ProcentTyp }
     *     
     */
    public WnoszeOWyplacenie100ProcentTyp getWnoszeOWyplacenie100Procent() {
        return wnoszeOWyplacenie100Procent;
    }

    /**
     * Sets the value of the wnoszeOWyplacenie100Procent property.
     * 
     * @param value
     *     allowed object is
     *     {@link WnoszeOWyplacenie100ProcentTyp }
     *     
     */
    public void setWnoszeOWyplacenie100Procent(WnoszeOWyplacenie100ProcentTyp value) {
        this.wnoszeOWyplacenie100Procent = value;
    }

    /**
     * Gets the value of the wnoszeOWyplacanieSwiadczenKtoreObecniePobieram property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWnoszeOWyplacanieSwiadczenKtoreObecniePobieram() {
        return wnoszeOWyplacanieSwiadczenKtoreObecniePobieram;
    }

    /**
     * Sets the value of the wnoszeOWyplacanieSwiadczenKtoreObecniePobieram property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWnoszeOWyplacanieSwiadczenKtoreObecniePobieram(TakNieTyp value) {
        this.wnoszeOWyplacanieSwiadczenKtoreObecniePobieram = value;
    }

    /**
     * Gets the value of the swiadczenieWZbieguProszePrzekazywac property.
     * 
     * @return
     *     possible object is
     *     {@link SwiadczenieWZbieguProszePrzekazywacTyp }
     *     
     */
    public SwiadczenieWZbieguProszePrzekazywacTyp getSwiadczenieWZbieguProszePrzekazywac() {
        return swiadczenieWZbieguProszePrzekazywac;
    }

    /**
     * Sets the value of the swiadczenieWZbieguProszePrzekazywac property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwiadczenieWZbieguProszePrzekazywacTyp }
     *     
     */
    public void setSwiadczenieWZbieguProszePrzekazywac(SwiadczenieWZbieguProszePrzekazywacTyp value) {
        this.swiadczenieWZbieguProszePrzekazywac = value;
    }

}
