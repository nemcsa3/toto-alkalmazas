package toto.tarolo;
import toto.tarolo.Eredmeny;
import toto.tarolo.Talalat;

//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;




public class Fordulo {
    
    private int ev;
    private int het;
    private int fordulatAHeten;
    //private LocalDate datum;   //megpróbáltam...    
    private Date datum;
    private List<Talalat> talalatok = new ArrayList<Talalat>();
    private List<Eredmeny> eredmenyek = new ArrayList<Eredmeny>();

    public List<Talalat> getTalalatok() {
        return talalatok;
    }

    public void setTalalatok(List<Talalat> talalatok) {
        this.talalatok = talalatok;
    }

    public List<Eredmeny> getEredmenyek() {
        return eredmenyek;
    }

    public void setEredmenyek(List<Eredmeny> eredmenyek) {
        this.eredmenyek = eredmenyek;
    }
    
    public void Fordulo(){
        
    }
    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public int getHet() {
        return het;
    }

    public void setHet(int het) {
        this.het = het;
    }

    public int getFordulatAHeten() {
        return fordulatAHeten;
    }

    public void setFordulatAHeten(int fordulaAHeten) {
        this.fordulatAHeten = fordulaAHeten;
    }

    public Date getDatum() {
        return datum; 
    }

    public void setDatum(Date datum) {    
        this.datum = datum;
    }
    
    /*public LocalDate getDatum() {
    return datum;
    }
    public void setDatum(LocalDate datum) {
    this.datum = datum;
    }*/
    

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
