package toto.Alk;

import toto.tarolo.Talalat;
import toto.szolgaltatas.TotoSzolgaltatas;


public class TotoAlk {
    
    public static void main(String[] args) {
        
        TotoSzolgaltatas tsz = new TotoSzolgaltatas();
        tsz.Beolvas("toto.csv"); 
        tsz.LegmagasabbNyertOsszeg();
        System.out.println("A legnagyobb nyeremeny amit rogzitettek: " + tsz.LegmagasabbNyertOsszeg()+" Ft");
        System.out.println("Statisztika: ");
        System.out.println("Kerem adjon meg egy datumot: ");
    }    
}
