package toto.tarolo;


public class Talalat {

    private int talalatokSzama;  // adatagok 
    private int nyertTalalatokSzama;
    private int nyeremeny;

    public Talalat(int talalatokSzama, int nyertTalalatokSzama, int nyeremeny) {   // A konstruckor arra való, hogy a példány adatagjait lefoglalja, és megadadjuk a kezdő értékét
        this.talalatokSzama = talalatokSzama;  //adattagok kezdőértékét megadom
        this.nyertTalalatokSzama = nyertTalalatokSzama; // Ennek a 3-nak a kezdőértékét adom meg késöbb a konstruktorral, amikor plédányt létrehozom (new Talalat())
        this.nyeremeny = nyeremeny;
    }
    public Talalat(int talalatokSzama, int nyeremeny){
        this.talalatokSzama = talalatokSzama;
        this.nyeremeny = nyeremeny; 
    }
    
    public void setTalalatokSzama(int a){
        this.talalatokSzama=a;
    }
    
    public int getTalalatokSzama(){
        
        return this.talalatokSzama;
    }
    public int getNyertTalalatokSzama(){
        
        return this.nyertTalalatokSzama;
    }
    public int getNyeremeny(){
        
        return this.nyeremeny;
    }
    
}
