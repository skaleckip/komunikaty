
package pl.asseco.rwkor.komunikaty;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Świadczenia pozostające w zbiegu
 * 
 * <p>Java class for SwiadczeniaPozostajaceWZbieguTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwiadczeniaPozostajaceWZbieguTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Okres" type="{http://zus.pl/schematy/b2bior/}OkresObowiazywaniaWysokosciIStanuSwiadczeniaTyp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwiadczeniaPozostajaceWZbieguTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "okres"
})
public class SwiadczeniaPozostajaceWZbieguTyp {

    @XmlElement(name = "Okres")
    protected List<OkresObowiazywaniaWysokosciIStanuSwiadczeniaTyp> okres;

    /**
     * Gets the value of the okres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the okres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOkres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OkresObowiazywaniaWysokosciIStanuSwiadczeniaTyp }
     * 
     * 
     */
    public List<OkresObowiazywaniaWysokosciIStanuSwiadczeniaTyp> getOkres() {
        if (okres == null) {
            okres = new ArrayList<OkresObowiazywaniaWysokosciIStanuSwiadczeniaTyp>();
        }
        return this.okres;
    }

}
