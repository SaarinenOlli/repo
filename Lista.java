package fi.academy;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Keijo");
        lista.add("Timo");
        lista.add("Mauno");

        System.out.println(lista);
    }
}

/*
Lisää 5 henkilöluokan oliota listaan, tulosta koko lista henkilö kerrallaan

Katso löytyykö tietty henkilö listasta, käytä contains() metodia

Laske listan henkilöiden ikien summa
 */