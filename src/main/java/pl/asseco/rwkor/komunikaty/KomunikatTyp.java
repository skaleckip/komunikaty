
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Komunikat
 * 
 * <p>Java class for KomunikatTyp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KomunikatTyp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KomunikatTyp", namespace = "http://zus.pl/schematy/b2bior/")
@XmlSeeAlso({
    K00Typ.class,
    K01Typ.class,
    K02Typ.class,
    K03Typ.class,
    K04Typ.class,
    K05Typ.class,
    K06Typ.class,
    KPBTyp.class
})
public abstract class KomunikatTyp {


}
