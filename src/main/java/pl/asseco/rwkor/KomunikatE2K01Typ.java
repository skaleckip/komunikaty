package pl.asseco.rwkor;

import jakarta.xml.bind.annotation.*;
import pl.asseco.rwkor.komunikaty.K01Typ;
import pl.asseco.rwkor.komunikaty.KomunikatTyp;

@XmlRootElement(name = "KomunikatE2K01", namespace = "http://zus.pl/schematy/b2bior/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KomunikatE2", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
        "danePostepowania",
        "komunikat",
})
public class KomunikatE2K01Typ {
    @XmlElement(name = "DanePostepowania", required = true)
    protected DanePostepowaniaTyp danePostepowania;

    @XmlElement(name = "Komunikat", required = true)
    protected K01Typ komunikat;

    public DanePostepowaniaTyp getDanePostepowania() {
        return danePostepowania;
    }

    public void setDanePostepowania(DanePostepowaniaTyp danePostepowania) {
        this.danePostepowania = danePostepowania;
    }

    public K01Typ getKomunikat() {
        return komunikat;
    }

    public void setKomunikat(K01Typ komunikat) {
        this.komunikat = komunikat;
    }
}
