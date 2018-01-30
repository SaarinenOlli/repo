package fi.academy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tekstinlukija {

    public static void main(String[] args) {

        String tulos = null;
        try (FileReader fr = new FileReader("Teksti");
             BufferedReader in = new BufferedReader(fr)) {
            StringBuilder teksti = new StringBuilder();
            String rivi;
            while ((rivi = in.readLine()) != null) {
                teksti.append(rivi).append("\n");
            }
            tulos = teksti.toString();
            System.out.println(tulos);
        } catch (FileNotFoundException ex) {
            System.out.println("Virhe: tiedostoa ei löytynyt");
        } catch (IOException ex) {
            System.out.println("Virhe: muu virhe lukiessa");
        }



}

}

