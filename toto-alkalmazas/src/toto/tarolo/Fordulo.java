package toto.tarolo;
import toto.tarolo.Eredmeny;
import toto.tarolo.Talalat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Fordulo {
    
    private int ev;
    private int het;
    private int forduloAHeten;
    private LocalDate datum;
    private List<Talalat> talalatok = new ArrayList<Talalat>();
    private List<Eredmeny> eredmenyek = new ArrayList<Eredmeny>();

    public Fordulo() {
        throw new UnsupportedOperationException("Not supported yet."); //ez rossz volt
    }
    
    public Fordulo(int ev, int het, int forduloAHeten, LocalDate datum) {
        this.ev = ev;
        this.het = het;
        this.forduloAHeten = forduloAHeten;
        this.datum = datum;
    }

    public int getEv() {
        return ev;
    }

    public int getHet() {
        return het;
    }

    public int getForduloAHeten() {
        return forduloAHeten;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public List<Talalat> getTalalatok() {
        return talalatok;
    }

    public List<Eredmeny> getEredmenyek() {
        return eredmenyek;
    }
    
    public void setEv(int ev) {
        this.ev = ev;
    }

    public void setHet(int het) {
        this.het = het;
    }

    public void setForduloAHeten(int forduloAHeten) {
        this.forduloAHeten = forduloAHeten;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public void setTalalatok(List<Talalat> talalatok) {
        this.talalatok = talalatok;
    }

    public void setEredmenyek(List<Eredmeny> eredmenyek) {
        this.eredmenyek = eredmenyek;
    }
    
}
