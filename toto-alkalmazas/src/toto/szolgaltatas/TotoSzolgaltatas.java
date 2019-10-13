package toto.szolgaltatas;

import toto.tarolo.Fordulo;
import toto.tarolo.Talalat;
import toto.tarolo.Eredmeny;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TotoSzolgaltatas {
    
    private List<Fordulo> fordulok = new ArrayList<Fordulo>();
    private List<Eredmeny> eredmenyek = new ArrayList<Eredmeny>();
    private List<Talalat> talalatok = new ArrayList<Talalat>();
    
    public void Beolvas(String fajlNev) throws IOException{
        try{
            FileReader fr = new FileReader(fajlNev);
            BufferedReader br = new BufferedReader(fr);
            
            String sor = br.readLine();
            while (sor!=""){
                String[] adatok = sor.split(";");
                Fordulo f = new Fordulo();
                f.setEv(Integer.parseInt(adatok[0]));
                f.setHet(Integer.parseInt(adatok[1]));
                if (adatok[2]=="") {  
                    adatok[2] = "1";
                    Integer.parseInt(adatok[2]);
                }
                f.setForduloAHeten(Integer.parseInt(adatok[2]));
                f.setDatum(LocalDate.parse(adatok[3]));
                f.setTalalatok(talalatok);
                f.setEredmenyek(eredmenyek);
        }
            fr.close();
            br.close();
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
