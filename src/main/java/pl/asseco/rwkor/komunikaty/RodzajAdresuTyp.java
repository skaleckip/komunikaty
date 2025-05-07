
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RodzajAdresuTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RodzajAdresuTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Adres"/&gt;
 *     &lt;enumeration value="Poste restante"/&gt;
 *     &lt;enumeration value="Skrytka pocztowa"/&gt;
 *     &lt;enumeration value="Przegródka pocztowa"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RodzajAdresuTyp", namespace = "http://zus.pl/schematy/b2bior/")
@XmlEnum
public enum RodzajAdresuTyp {

    @XmlEnumValue("Adres")
    ADRES("Adres"),
    @XmlEnumValue("Poste restante")
    POSTE_RESTANTE("Poste restante"),
    @XmlEnumValue("Skrytka pocztowa")
    SKRYTKA_POCZTOWA("Skrytka pocztowa"),
    @XmlEnumValue("Przegr\u00f3dka pocztowa")
    PRZEGRÓDKA_POCZTOWA("Przegr\u00f3dka pocztowa");
    private final String value;

    RodzajAdresuTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RodzajAdresuTyp fromValue(String v) {
        for (RodzajAdresuTyp c: RodzajAdresuTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
