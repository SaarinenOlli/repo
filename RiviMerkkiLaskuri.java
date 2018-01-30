package fi.academy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RiviMerkkiLaskuri {

    public static void main(String[] args) {

        String tulos = null;
        try (FileReader fr = new FileReader("Teksti");
             BufferedReader in = new BufferedReader(fr))
        {
            StringBuilder teksti = new StringBuilder();
            String rivi;
            int rivit = 0;
            while ((rivi = in.readLine()) != null) {
                teksti.append(rivi).append("\n");
                rivit++;
            }

            tulos = teksti.toString();

            int merkit = tulos.length();

            System.out.println("Merkkien määrä on: " + merkit);
            System.out.println("Rivien määrä on: " + rivit);



        } catch (FileNotFoundException ex) {
            System.out.println("Virhe: tiedostoa ei löytynyt");
        } catch (IOException ex) {
            System.out.println("Virhe: muu virhe lukiessa");
        }



    }

}
