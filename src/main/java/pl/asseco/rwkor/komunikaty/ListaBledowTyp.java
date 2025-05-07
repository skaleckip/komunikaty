
package pl.asseco.rwkor.komunikaty;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Lista błędów uniemożliwiających przekazanie komunikatu
 * 
 * <p>Java class for ListaBledowTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaBledowTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Blad" type="{http://zus.pl/schematy/b2bior/}BladTyp" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaBledowTyp", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
    "blad"
})
public class ListaBledowTyp {

    @XmlElement(name = "Blad", required = true)
    protected List<BladTyp> blad;

    /**
     * Gets the value of the blad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the blad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BladTyp }
     * 
     * 
     */
    public List<BladTyp> getBlad() {
        if (blad == null) {
            blad = new ArrayList<BladTyp>();
        }
        return this.blad;
    }

}
