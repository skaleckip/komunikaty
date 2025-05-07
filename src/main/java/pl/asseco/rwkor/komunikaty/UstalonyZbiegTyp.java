
package pl.asseco.rwkor.komunikaty;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ustalony zbieg
 * 
 * <p>Java class for UstalonyZbiegTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UstalonyZbiegTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SygnaturaSprawy" type="{http://zus.pl/schematy/b2bior/}SygnaturaTyp"/&gt;
 *         &lt;element name="SygnaturaDecyzji" type="{http://zus.pl/schematy/b2bior/}SygnaturaTyp"/&gt;
 *         &lt;element name="DataDecyzji" type="{http://zus.pl/schematy/b2bior/}DataTyp"/&gt;
 *         &lt;element name="PreferowanyWariantZbiegu" type="{http://zus.pl/schematy/b2bior/}WariantZbieguTyp"/&gt;
 *         &lt;element name="ZastosowanyWariantZbiegu" type="{http://zus.pl/schematy/b2bior/}SymbolWariantuZbieguTyp"/&gt;
 *         &lt;element name="ZastosowanyProcent" type="{http://zus.pl/schematy/b2bior/}ProcentTyp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UstalonyZbiegTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "sygnaturaSprawy",
    "sygnaturaDecyzji",
    "dataDecyzji",
    "preferowanyWariantZbiegu",
    "zastosowanyWariantZbiegu",
    "zastosowanyProcent"
})
public class UstalonyZbiegTyp {

    @XmlElement(name = "SygnaturaSprawy", required = true)
    protected String sygnaturaSprawy;
    @XmlElement(name = "SygnaturaDecyzji", required = true)
    protected String sygnaturaDecyzji;
    @XmlElement(name = "DataDecyzji", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDecyzji;
    @XmlElement(name = "PreferowanyWariantZbiegu", required = true)
    protected String preferowanyWariantZbiegu;
    @XmlElement(name = "ZastosowanyWariantZbiegu", required = true)
    protected String zastosowanyWariantZbiegu;
    @XmlElement(name = "ZastosowanyProcent", required = true)
    protected BigDecimal zastosowanyProcent;

    /**
     * Gets the value of the sygnaturaSprawy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSygnaturaSprawy() {
        return sygnaturaSprawy;
    }

    /**
     * Sets the value of the sygnaturaSprawy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSygnaturaSprawy(String value) {
        this.sygnaturaSprawy = value;
    }

    /**
     * Gets the value of the sygnaturaDecyzji property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSygnaturaDecyzji() {
        return sygnaturaDecyzji;
    }

    /**
     * Sets the value of the sygnaturaDecyzji property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSygnaturaDecyzji(String value) {
        this.sygnaturaDecyzji = value;
    }

    /**
     * Gets the value of the dataDecyzji property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDecyzji() {
        return dataDecyzji;
    }

    /**
     * Sets the value of the dataDecyzji property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDecyzji(XMLGregorianCalendar value) {
        this.dataDecyzji = value;
    }

    /**
     * Gets the value of the preferowanyWariantZbiegu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferowanyWariantZbiegu() {
        return preferowanyWariantZbiegu;
    }

    /**
     * Sets the value of the preferowanyWariantZbiegu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferowanyWariantZbiegu(String value) {
        this.preferowanyWariantZbiegu = value;
    }

    /**
     * Gets the value of the zastosowanyWariantZbiegu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZastosowanyWariantZbiegu() {
        return zastosowanyWariantZbiegu;
    }

    /**
     * Sets the value of the zastosowanyWariantZbiegu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZastosowanyWariantZbiegu(String value) {
        this.zastosowanyWariantZbiegu = value;
    }

    /**
     * Gets the value of the zastosowanyProcent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZastosowanyProcent() {
        return zastosowanyProcent;
    }

    /**
     * Sets the value of the zastosowanyProcent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZastosowanyProcent(BigDecimal value) {
        this.zastosowanyProcent = value;
    }

}
