package fi.academy;

public class PalindromiTesti {
    public static void main(String[] args) {
        String[] sanat = {"abba", "saippuakauppias", "sana", "", "Abba", "sana sanas"};
        Palindromi p = new Palindromi();
        for(String sana : sanat) {
            System.out.println(String.format("'%s' %s palindromi", sana, p.onkoPalindromi1(sana) ? "on" : "ei ole"));
        }
    }
}
