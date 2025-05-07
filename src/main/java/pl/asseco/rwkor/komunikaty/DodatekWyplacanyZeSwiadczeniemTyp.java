
package pl.asseco.rwkor.komunikaty;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dodatek wypłacany wraz ze świadczeniem
 * 
 * <p>Java class for DodatekWyplacanyZeSwiadczeniemTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DodatekWyplacanyZeSwiadczeniemTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KodRodzaju" type="{http://zus.pl/schematy/b2bior/}KodRodzajuDodatkuTyp"/&gt;
 *         &lt;element name="Symbol" type="{http://zus.pl/schematy/b2bior/}SymbolDodatkuTyp"/&gt;
 *         &lt;element name="Wysokosc" type="{http://zus.pl/schematy/b2bior/}KwotaTyp"/&gt;
 *         &lt;element name="DataPoczatkuObowiazywania" type="{http://zus.pl/schematy/b2bior/}DataTyp"/&gt;
 *         &lt;element name="DataKoncaObowiazywania" type="{http://zus.pl/schematy/b2bior/}DataTyp" minOccurs="0"/&gt;
 *         &lt;element name="SymbolGrupyFinansowaniaPomniejszenia" type="{http://zus.pl/schematy/b2bior/}SymbolGrupyFinansowaniaPomniejszeniaTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DodatekWyplacanyZeSwiadczeniemTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "kodRodzaju",
    "symbol",
    "wysokosc",
    "dataPoczatkuObowiazywania",
    "dataKoncaObowiazywania",
    "symbolGrupyFinansowaniaPomniejszenia"
})
public class DodatekWyplacanyZeSwiadczeniemTyp {

    @XmlElement(name = "KodRodzaju", required = true)
    protected String kodRodzaju;
    @XmlElement(name = "Symbol", required = true)
    protected String symbol;
    @XmlElement(name = "Wysokosc", required = true)
    protected BigDecimal wysokosc;
    @XmlElement(name = "DataPoczatkuObowiazywania", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataPoczatkuObowiazywania;
    @XmlElement(name = "DataKoncaObowiazywania")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataKoncaObowiazywania;
    @XmlElement(name = "SymbolGrupyFinansowaniaPomniejszenia", required = true)
    protected String symbolGrupyFinansowaniaPomniejszenia;

    /**
     * Gets the value of the kodRodzaju property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodRodzaju() {
        return kodRodzaju;
    }

    /**
     * Sets the value of the kodRodzaju property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodRodzaju(String value) {
        this.kodRodzaju = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the wysokosc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWysokosc() {
        return wysokosc;
    }

    /**
     * Sets the value of the wysokosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWysokosc(BigDecimal value) {
        this.wysokosc = value;
    }

    /**
     * Gets the value of the dataPoczatkuObowiazywania property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPoczatkuObowiazywania() {
        return dataPoczatkuObowiazywania;
    }

    /**
     * Sets the value of the dataPoczatkuObowiazywania property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPoczatkuObowiazywania(XMLGregorianCalendar value) {
        this.dataPoczatkuObowiazywania = value;
    }

    /**
     * Gets the value of the dataKoncaObowiazywania property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataKoncaObowiazywania() {
        return dataKoncaObowiazywania;
    }

    /**
     * Sets the value of the dataKoncaObowiazywania property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataKoncaObowiazywania(XMLGregorianCalendar value) {
        this.dataKoncaObowiazywania = value;
    }

    /**
     * Gets the value of the symbolGrupyFinansowaniaPomniejszenia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolGrupyFinansowaniaPomniejszenia() {
        return symbolGrupyFinansowaniaPomniejszenia;
    }

    /**
     * Sets the value of the symbolGrupyFinansowaniaPomniejszenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolGrupyFinansowaniaPomniejszenia(String value) {
        this.symbolGrupyFinansowaniaPomniejszenia = value;
    }

}
