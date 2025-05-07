
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Na rachunek polski zamieszkałego za granicą
 * 
 * <p>Java class for NaRachunekPlZamieszkalegoZagranicaTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NaRachunekPlZamieszkalegoZagranicaTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://zus.pl/schematy/b2bior/}NaRachunekPlTyp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImieINazwiskoWlasciciela" type="{http://zus.pl/schematy/b2bior/}Tekst200Typ" minOccurs="0"/&gt;
 *         &lt;element name="PESEL" type="{http://zus.pl/schematy/b2bior/}PESELTyp" minOccurs="0"/&gt;
 *         &lt;element name="RodzajDokumentu" type="{http://zus.pl/schematy/b2bior/}RodzajDokumentuTyp" minOccurs="0"/&gt;
 *         &lt;element name="SeriaINumerDokumentu" type="{http://zus.pl/schematy/b2bior/}NrDowoduTozsamosciTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaRachunekPlZamieszkalegoZagranicaTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "imieINazwiskoWlasciciela",
    "pesel",
    "rodzajDokumentu",
    "seriaINumerDokumentu"
})
public class NaRachunekPlZamieszkalegoZagranicaTyp
    extends NaRachunekPlTyp
{

    @XmlElement(name = "ImieINazwiskoWlasciciela")
    protected String imieINazwiskoWlasciciela;
    @XmlElement(name = "PESEL")
    protected String pesel;
    @XmlElement(name = "RodzajDokumentu")
    protected String rodzajDokumentu;
    @XmlElement(name = "SeriaINumerDokumentu")
    protected String seriaINumerDokumentu;

    /**
     * Gets the value of the imieINazwiskoWlasciciela property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImieINazwiskoWlasciciela() {
        return imieINazwiskoWlasciciela;
    }

    /**
     * Sets the value of the imieINazwiskoWlasciciela property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImieINazwiskoWlasciciela(String value) {
        this.imieINazwiskoWlasciciela = value;
    }

    /**
     * Gets the value of the pesel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPESEL() {
        return pesel;
    }

    /**
     * Sets the value of the pesel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPESEL(String value) {
        this.pesel = value;
    }

    /**
     * Gets the value of the rodzajDokumentu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodzajDokumentu() {
        return rodzajDokumentu;
    }

    /**
     * Sets the value of the rodzajDokumentu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodzajDokumentu(String value) {
        this.rodzajDokumentu = value;
    }

    /**
     * Gets the value of the seriaINumerDokumentu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriaINumerDokumentu() {
        return seriaINumerDokumentu;
    }

    /**
     * Sets the value of the seriaINumerDokumentu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriaINumerDokumentu(String value) {
        this.seriaINumerDokumentu = value;
    }

}
