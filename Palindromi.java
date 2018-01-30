package fi.academy;

import java.util.Scanner;

public class Palindromi {
    private Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        Palindromi palindromi = new Palindromi();
        System.out.println("Syötä palindromiehdokas");
        String teksti = palindromi.lueTeksti();
        boolean onko = palindromi.onkoPalindromi1(teksti);
        if (onko) {
            System.out.println(teksti + " on palindromi");
        } else {
            System.out.println(teksti + " ei ole palindromi");
        }
    }
    public String lueTeksti() {
        String luettu = lukija.nextLine();
        return luettu;
    }


    public boolean onkoPalindromi1(String ehdokas) {
        ehdokas = ehdokas.toLowerCase();
        StringBuilder kopio = new StringBuilder(ehdokas);
        if (ehdokas.equals(kopio.reverse().toString()))
            return true;
        return false;
    }
    public boolean onkoPalindromi2 (String ehdokas) {
        for (int i = 0; i < ehdokas.length() / 2; i++) {
            char alku = ehdokas.charAt(i);
            char loppu = ehdokas.charAt(ehdokas.length() - (i + 1));
            if (alku != loppu) {
                return false;
            }
        }
        return true;
    }
}
