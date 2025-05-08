package pl.asseco.rwkor;

import jakarta.xml.bind.annotation.*;
import pl.asseco.rwkor.komunikaty.K02Typ;

@XmlRootElement(name = "KomunikatE2K02", namespace = "http://zus.pl/schematy/b2bior/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KomunikatE2", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
        "danePostepowania",
        "komunikat",
})
public class KomunikatE2K02Typ {
    @XmlElement(name = "DanePostepowania", required = true)
    protected DanePostepowaniaTyp danePostepowania;

    @XmlElement(name = "Komunikat", required = true)
    protected K02Typ komunikat;

    public DanePostepowaniaTyp getDanePostepowania() {
        return danePostepowania;
    }

    public void setDanePostepowania(DanePostepowaniaTyp danePostepowania) {
        this.danePostepowania = danePostepowania;
    }

    public K02Typ getKomunikat() {
        return komunikat;
    }

    public void setKomunikat(K02Typ komunikat) {
        this.komunikat = komunikat;
    }
}
