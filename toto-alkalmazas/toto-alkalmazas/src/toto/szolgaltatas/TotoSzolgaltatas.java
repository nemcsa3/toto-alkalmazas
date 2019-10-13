package toto.szolgaltatas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import toto.tarolo.Eredmeny;
import toto.tarolo.Fordulo;
import toto.tarolo.Talalat;
import java.util.Date;

public class TotoSzolgaltatas {

    public TotoSzolgaltatas() {
    }

    private int i = 0;
    private Calendar naptar;
    private List<Fordulo> fordulok = new ArrayList<Fordulo>();
    private List<Eredmeny> eredmenyek = new ArrayList<Eredmeny>();
    private List<Talalat> talalatok = new ArrayList<Talalat>();

    public void Beolvas(String fajlnev) {
        try {
            FileReader sr = new FileReader(fajlnev);
            BufferedReader br = new BufferedReader(sr);
            
            String sor = br.readLine();
            while (sor != null) {
                Fordulo f = new Fordulo();
                String[] adatok = sor.split(";");
                f.setEv(Integer.parseInt(adatok[0]));
                f.setHet(Integer.parseInt(adatok[1]));
                if (adatok[2].isEmpty()) {  
                    adatok[2] = "1";
                    Integer.parseInt(adatok[2]);
                }
                f.setFordulatAHeten(Integer.parseInt(adatok[2]));
                /*
                f.setDatum(format.parse(adatok[3]));
                LocalDate d = LocalDate.now();
                 String s = datum.format(formatter);
                */
                Date datum = new Date();
                naptar = Calendar.getInstance();
                if (adatok[3].equals("")) {
                    naptar.set(Calendar.YEAR, Integer.parseInt(adatok[0]));  
                    naptar.set(Calendar.WEEK_OF_YEAR, Integer.parseInt(adatok[1]));   
                    switch (adatok[2]) {
                        case "1":
                            naptar.set(Calendar.DAY_OF_WEEK, 1); // ha első fordulo, akkor hét 1 stb...
                            break;
                        case "2":
                            naptar.set(Calendar.DAY_OF_WEEK, 2);
                            break;
                        case "3":
                            naptar.set(Calendar.DAY_OF_WEEK, 3);
                            break;
                        case "4":
                            naptar.set(Calendar.DAY_OF_WEEK, 4);
                            break;
                        case "5":
                            naptar.set(Calendar.DAY_OF_WEEK, 5);
                            break;
                        case "6":
                            naptar.set(Calendar.DAY_OF_WEEK, 6);
                            break;
                        case "7":
                            naptar.set(Calendar.DAY_OF_WEEK, 7);
                            break;
                    }
                } else {
                    naptar.set(Calendar.YEAR, Integer.parseInt(adatok[3].split("\\.")[0])); //Stack Overflow
                    naptar.set(Calendar.MONTH, Integer.parseInt(adatok[3].split("\\.")[1]));
                    naptar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(adatok[3].split("\\.")[2]));
                }
                datum = naptar.getTime();
                f.setDatum(datum);
                for (int i = 4; i < 14; i += 2) { //egymást követő 2 adatot  adja a találat listához és kiszedi a Ft-ot és whitespace-eket
                    talalatok.add(new Talalat(Integer.parseInt(adatok[i]), Integer.parseInt(adatok[i + 1].replace("Ft", "").replaceAll("\\s+", ""))));
                }
                f.setTalalatok(talalatok);
                for (int i = 4; i < 14; i += 2) { // győztes csapat keresése
                    switch (adatok[i]) {
                        case "1":
                            eredmenyek.add(Eredmeny._1);
                            break;
                        case "2":
                            eredmenyek.add(Eredmeny._2);
                            break;
                        case "3":
                            eredmenyek.add(Eredmeny.x);
                            break;
                    }
                }
                if (adatok[adatok.length - 1].contains("+")) { // + értékek ellenőrzése
                    String pluszok = adatok[adatok.length - 1];
                    switch (pluszok) {
                        case "+1":
                            eredmenyek.add(Eredmeny._1);
                            break;
                        case "+2":
                            eredmenyek.add(Eredmeny._2);
                            break;
                        case "+x":
                            eredmenyek.add(Eredmeny.x);
                            break;
                    }
                }
                f.setEredmenyek(eredmenyek);
                //System.out.println(f); //Beolvasás ellenőrzés eredmény: megy!
                fordulok.add(f); //Adatok listába helyezése. végre VÉGE!
                /*i++; //hiba kereső
                System.out.println(f.getTalalatok().get(i));*/
                sor = br.readLine(); //ciklus léptető    
            }
            sr.close();
            br.close();
        } catch (Exception e) {
            System.out.println(e); //hiba kiiratás
        }           
    }
    public int LegmagasabbNyertOsszeg(){ //valami valahol a kódban nem oké, de nem tudom hol
        int max = 0;
        for (Fordulo f : fordulok) {
            List<Talalat> talalat = f.getTalalatok();
            for (Talalat t : talalat) {
                //System.out.println(t.getNyeremeny()+"sajt");
                if (t.getNyeremeny() > max) {
                    max = t.getNyeremeny();
                }
            }
        }
        return max;
        }
    
    
}
