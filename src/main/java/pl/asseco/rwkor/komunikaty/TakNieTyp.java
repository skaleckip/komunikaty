
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TakNieTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TakNieTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Tak"/&gt;
 *     &lt;enumeration value="Nie"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TakNieTyp", namespace = "http://zus.pl/schematy/b2bior/")
@XmlEnum
public enum TakNieTyp {

    @XmlEnumValue("Tak")
    TAK("Tak"),
    @XmlEnumValue("Nie")
    NIE("Nie");
    private final String value;

    TakNieTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TakNieTyp fromValue(String v) {
        for (TakNieTyp c: TakNieTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
