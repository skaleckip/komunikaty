
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecyzjaTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DecyzjaTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Odmowa"/&gt;
 *     &lt;enumeration value="Ustalenie"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DecyzjaTyp", namespace = "http://zus.pl/schematy/b2bior/")
@XmlEnum
public enum DecyzjaTyp {

    @XmlEnumValue("Odmowa")
    ODMOWA("Odmowa"),
    @XmlEnumValue("Ustalenie")
    USTALENIE("Ustalenie");
    private final String value;

    DecyzjaTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DecyzjaTyp fromValue(String v) {
        for (DecyzjaTyp c: DecyzjaTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
