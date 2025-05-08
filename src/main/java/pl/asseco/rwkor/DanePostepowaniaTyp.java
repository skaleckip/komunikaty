package pl.asseco.rwkor;


import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DanePostepowania", namespace = "http://zus.pl/schematy/b2bior/", propOrder = {
        "idPostepowania",
        "symbolJednostkiEpwd",
        "idKomorkiZus",
        "idCenRej",
        "rejestrTyp"
})
public class DanePostepowaniaTyp {
    @XmlElement(name = "idPostepowania", required = true)
    protected String idPostepowania;

    @XmlElement(name = "symbolJednostkiEpwd", required = true)
    protected String symbolJednostkiEpwd;

    @XmlElement(name = "idKomorkiZus", required = true)
    protected String idKomorkiZus;

    @XmlElement(name = "IdCenRej", required = true)
    protected String idCenRej;

    @XmlElement(name = "RejestrTyp", required = true )
    protected String rejestrTyp;

    public String getIdPostepowania() {
        return idPostepowania;
    }

    public void setIdPostepowania(String idPostepowania) {
        this.idPostepowania = idPostepowania;
    }

    public String getSymbolJednostkiEpwd() {
        return symbolJednostkiEpwd;
    }

    public void setSymbolJednostkiEpwd(String symbolJednostkiEpwd) {
        this.symbolJednostkiEpwd = symbolJednostkiEpwd;
    }

    public String getIdKomorkiZus() {
        return idKomorkiZus;
    }

    public void setIdKomorkiZus(String idKomorkiZus) {
        this.idKomorkiZus = idKomorkiZus;
    }

    public String getIdCenRej() {
        return idCenRej;
    }

    public void setIdCenRej(String idCenRej) {
        this.idCenRej = idCenRej;
    }

    public String getRejestrTyp() {
        return rejestrTyp;
    }

    public void setRejestrTyp(String rejestrTyp) {
        this.rejestrTyp = rejestrTyp;
    }
}
