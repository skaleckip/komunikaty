
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Lista zaznaczonych we wniosku ERWD organów rentowych, w których wnioskodawca ma przyznaną rentę rodzinną lub ma złożony wniosek o nią
 * 
 * <p>Java class for RodzajInstytucjiTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RodzajInstytucjiTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZUS" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="KRUS" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="ZERMSWiA" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="BESW" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WBEBialystok" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WBEKrakow" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WBERzeszow" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WBEBydgoszcz" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WBELublin" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WBESzczecin" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WBEGdansk" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WBELodz" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WBEWarszawa" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WBEKatowice" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WBEOlsztyn" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WBEWroclaw" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WBEKielce" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WBEPoznan" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *         &lt;element name="WBEZielonaGora" type="{http://zus.pl/schematy/b2bior/}TakNieTyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RodzajInstytucjiTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "zus",
    "krus",
    "zermsWiA",
    "besw",
    "wbeBialystok",
    "wbeKrakow",
    "wbeRzeszow",
    "wbeBydgoszcz",
    "wbeLublin",
    "wbeSzczecin",
    "wbeGdansk",
    "wbeLodz",
    "wbeWarszawa",
    "wbeKatowice",
    "wbeOlsztyn",
    "wbeWroclaw",
    "wbeKielce",
    "wbePoznan",
    "wbeZielonaGora"
})
public class RodzajInstytucjiTyp {

    @XmlElement(name = "ZUS")
    @XmlSchemaType(name = "string")
    protected TakNieTyp zus;
    @XmlElement(name = "KRUS")
    @XmlSchemaType(name = "string")
    protected TakNieTyp krus;
    @XmlElement(name = "ZERMSWiA")
    @XmlSchemaType(name = "string")
    protected TakNieTyp zermsWiA;
    @XmlElement(name = "BESW")
    @XmlSchemaType(name = "string")
    protected TakNieTyp besw;
    @XmlElement(name = "WBEBialystok")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wbeBialystok;
    @XmlElement(name = "WBEKrakow")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wbeKrakow;
    @XmlElement(name = "WBERzeszow")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wbeRzeszow;
    @XmlElement(name = "WBEBydgoszcz")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wbeBydgoszcz;
    @XmlElement(name = "WBELublin")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wbeLublin;
    @XmlElement(name = "WBESzczecin")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wbeSzczecin;
    @XmlElement(name = "WBEGdansk")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wbeGdansk;
    @XmlElement(name = "WBELodz")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wbeLodz;
    @XmlElement(name = "WBEWarszawa")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wbeWarszawa;
    @XmlElement(name = "WBEKatowice")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wbeKatowice;
    @XmlElement(name = "WBEOlsztyn")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wbeOlsztyn;
    @XmlElement(name = "WBEWroclaw")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wbeWroclaw;
    @XmlElement(name = "WBEKielce")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wbeKielce;
    @XmlElement(name = "WBEPoznan")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wbePoznan;
    @XmlElement(name = "WBEZielonaGora")
    @XmlSchemaType(name = "string")
    protected TakNieTyp wbeZielonaGora;

    /**
     * Gets the value of the zus property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getZUS() {
        return zus;
    }

    /**
     * Sets the value of the zus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setZUS(TakNieTyp value) {
        this.zus = value;
    }

    /**
     * Gets the value of the krus property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getKRUS() {
        return krus;
    }

    /**
     * Sets the value of the krus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setKRUS(TakNieTyp value) {
        this.krus = value;
    }

    /**
     * Gets the value of the zermsWiA property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getZERMSWiA() {
        return zermsWiA;
    }

    /**
     * Sets the value of the zermsWiA property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setZERMSWiA(TakNieTyp value) {
        this.zermsWiA = value;
    }

    /**
     * Gets the value of the besw property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getBESW() {
        return besw;
    }

    /**
     * Sets the value of the besw property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setBESW(TakNieTyp value) {
        this.besw = value;
    }

    /**
     * Gets the value of the wbeBialystok property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWBEBialystok() {
        return wbeBialystok;
    }

    /**
     * Sets the value of the wbeBialystok property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWBEBialystok(TakNieTyp value) {
        this.wbeBialystok = value;
    }

    /**
     * Gets the value of the wbeKrakow property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWBEKrakow() {
        return wbeKrakow;
    }

    /**
     * Sets the value of the wbeKrakow property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWBEKrakow(TakNieTyp value) {
        this.wbeKrakow = value;
    }

    /**
     * Gets the value of the wbeRzeszow property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWBERzeszow() {
        return wbeRzeszow;
    }

    /**
     * Sets the value of the wbeRzeszow property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWBERzeszow(TakNieTyp value) {
        this.wbeRzeszow = value;
    }

    /**
     * Gets the value of the wbeBydgoszcz property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWBEBydgoszcz() {
        return wbeBydgoszcz;
    }

    /**
     * Sets the value of the wbeBydgoszcz property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWBEBydgoszcz(TakNieTyp value) {
        this.wbeBydgoszcz = value;
    }

    /**
     * Gets the value of the wbeLublin property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWBELublin() {
        return wbeLublin;
    }

    /**
     * Sets the value of the wbeLublin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWBELublin(TakNieTyp value) {
        this.wbeLublin = value;
    }

    /**
     * Gets the value of the wbeSzczecin property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWBESzczecin() {
        return wbeSzczecin;
    }

    /**
     * Sets the value of the wbeSzczecin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWBESzczecin(TakNieTyp value) {
        this.wbeSzczecin = value;
    }

    /**
     * Gets the value of the wbeGdansk property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWBEGdansk() {
        return wbeGdansk;
    }

    /**
     * Sets the value of the wbeGdansk property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWBEGdansk(TakNieTyp value) {
        this.wbeGdansk = value;
    }

    /**
     * Gets the value of the wbeLodz property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWBELodz() {
        return wbeLodz;
    }

    /**
     * Sets the value of the wbeLodz property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWBELodz(TakNieTyp value) {
        this.wbeLodz = value;
    }

    /**
     * Gets the value of the wbeWarszawa property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWBEWarszawa() {
        return wbeWarszawa;
    }

    /**
     * Sets the value of the wbeWarszawa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWBEWarszawa(TakNieTyp value) {
        this.wbeWarszawa = value;
    }

    /**
     * Gets the value of the wbeKatowice property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWBEKatowice() {
        return wbeKatowice;
    }

    /**
     * Sets the value of the wbeKatowice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWBEKatowice(TakNieTyp value) {
        this.wbeKatowice = value;
    }

    /**
     * Gets the value of the wbeOlsztyn property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWBEOlsztyn() {
        return wbeOlsztyn;
    }

    /**
     * Sets the value of the wbeOlsztyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWBEOlsztyn(TakNieTyp value) {
        this.wbeOlsztyn = value;
    }

    /**
     * Gets the value of the wbeWroclaw property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWBEWroclaw() {
        return wbeWroclaw;
    }

    /**
     * Sets the value of the wbeWroclaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWBEWroclaw(TakNieTyp value) {
        this.wbeWroclaw = value;
    }

    /**
     * Gets the value of the wbeKielce property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWBEKielce() {
        return wbeKielce;
    }

    /**
     * Sets the value of the wbeKielce property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWBEKielce(TakNieTyp value) {
        this.wbeKielce = value;
    }

    /**
     * Gets the value of the wbePoznan property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWBEPoznan() {
        return wbePoznan;
    }

    /**
     * Sets the value of the wbePoznan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWBEPoznan(TakNieTyp value) {
        this.wbePoznan = value;
    }

    /**
     * Gets the value of the wbeZielonaGora property.
     * 
     * @return
     *     possible object is
     *     {@link TakNieTyp }
     *     
     */
    public TakNieTyp getWBEZielonaGora() {
        return wbeZielonaGora;
    }

    /**
     * Sets the value of the wbeZielonaGora property.
     * 
     * @param value
     *     allowed object is
     *     {@link TakNieTyp }
     *     
     */
    public void setWBEZielonaGora(TakNieTyp value) {
        this.wbeZielonaGora = value;
    }

}
