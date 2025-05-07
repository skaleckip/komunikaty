
package pl.asseco.rwkor.komunikaty;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SymbolKomunikatuTyp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SymbolKomunikatuTyp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="K00"/&gt;
 *     &lt;enumeration value="K01"/&gt;
 *     &lt;enumeration value="K02"/&gt;
 *     &lt;enumeration value="K03"/&gt;
 *     &lt;enumeration value="K04"/&gt;
 *     &lt;enumeration value="K05"/&gt;
 *     &lt;enumeration value="K06"/&gt;
 *     &lt;enumeration value="KPB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SymbolKomunikatuTyp", namespace = "http://zus.pl/schematy/b2bior/")
@XmlEnum
public enum SymbolKomunikatuTyp {


    /**
     * Informacja o wniosku o ustalenie zbiegu świadczeń z rentą rodzinną ERWD
     * 
     */
    @XmlEnumValue("K00")
    K_00("K00"),

    /**
     * Żądanie potwierdzenia występowania świadczeń i ich wysokości
     * 
     */
    @XmlEnumValue("K01")
    K_01("K01"),

    /**
     * Odpowiedź na żądanie potwierdzenia występowania świadczeń i ich wysokości
     * 
     */
    @XmlEnumValue("K02")
    K_02("K02"),

    /**
     * Informacja o rozstrzygnięciu: odmowie lub ustaleniu zbiegu świadczenia z rentą rodzinną
     * 
     */
    @XmlEnumValue("K03")
    K_03("K03"),

    /**
     * Informacja o ustaniu prawa lub zmianie wysokości świadczeń
     * 
     */
    @XmlEnumValue("K04")
    K_04("K04"),

    /**
     * Ponaglenie dotyczące potwierdzenia występowania świadczeń w organie rentowym oraz jego wysokości
     * 
     */
    @XmlEnumValue("K05")
    K_05("K05"),

    /**
     * Informacja o zmianie ustalonego zbiegu świadczeń z rentą rodzinną
     * 
     */
    @XmlEnumValue("K06")
    K_06("K06"),

    /**
     * Informacja o potwierdzeniu przyjęcia komunikatu albo błędach uniemożliwiających jego przyjęcie
     * 
     */
    KPB("KPB");
    private final String value;

    SymbolKomunikatuTyp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SymbolKomunikatuTyp fromValue(String v) {
        for (SymbolKomunikatuTyp c: SymbolKomunikatuTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
