package pl.asseco.rwkor;

import jakarta.xml.bind.annotation.*;
import pl.asseco.rwkor.komunikaty.K00Typ;

@XmlRootElement(name = "KomunikatE2K00", namespace = "http://zus.pl/schematy/b2bior/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KomunikatE2", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
        "danePostepowania",
        "komunikat",
})
public class KomunikatE2K00Typ {
    @XmlElement(name = "DanePostepowania", required = true)
    protected DanePostepowaniaTyp danePostepowania;

    @XmlElement(name = "Komunikat", required = true)
    protected K00Typ komunikat;

    public DanePostepowaniaTyp getDanePostepowania() {
        return danePostepowania;
    }

    public void setDanePostepowania(DanePostepowaniaTyp danePostepowania) {
        this.danePostepowania = danePostepowania;
    }

    public K00Typ getKomunikat() {
        return komunikat;
    }

    public void setKomunikat(K00Typ komunikat) {
        this.komunikat = komunikat;
    }
}
