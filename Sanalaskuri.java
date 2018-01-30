/*
package fi.academy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sanalaskuri {
    class Tiedot {
        int riveja;
        int sanoja;
        int merkkeja;

    }

    public static void main(String[] args) {
        Sanalaskuri laskuri = new Sanalaskuri();
        String tiedostonNimi = "Tiedosto";
        Tiedot tiedot = laskuri.kasitteleTiedosto(tiedostonNimi);
        System.out.println(String.format("Tiedosto: %s\n\t%d €d €d,",
                tiedostonNimi,
                tiedot.riveja,
                tiedot.sanoja,
                tiedot.merkkeja));
    }

    private Tiedot kasitteleTiedosto (String tiedosto) {
        int riveja, sanoja, merkkeja;
        riveja = sanoja = merkkeja = 0;
        try (FileReader fr = new FileReader(tiedosto);
                 BufferedReader lukija = new BufferedReader(fr)) {
                String rivi;
                for(rivi = lukija.readLine(); rivi != null ; rivi = lukija.readLine())
                    ++riveja;
                    merkkeja += rivi.lenght();
                    sanoja += rivi.split("\\s").length;
                }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return new Tiedot(riveja, sanoja, merkkeja);
    }



}
*/
