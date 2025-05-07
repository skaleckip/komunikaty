
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RodzajRachunkuUsaTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RodzajRachunkuUsaTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RodzajRachunkuUsaTyp", namespace = "http://zus.pl/schematy/b2bior/")
@XmlEnum
public enum RodzajRachunkuUsaTyp {


    /**
     * bieżący
     * 
     */
    B,

    /**
     * oszczędnościowy
     * 
     */
    O;

    public String value() {
        return name();
    }

    public static RodzajRachunkuUsaTyp fromValue(String v) {
        return valueOf(v);
    }

}
