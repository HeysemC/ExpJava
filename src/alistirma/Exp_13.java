package alistirma;

import java.util.Locale;

public class Exp_13 {
    public static void main(String[] args) {
      String str="Java Mutluluktur";
        System.out.println(str.toUpperCase());
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);

        str="ince mehmet";
        str=str.toUpperCase();
        System.out.println(str);

        System.out.println(str.toLowerCase(Locale.CHINA));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));


    }
}
