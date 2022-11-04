package alistirma;

import java.util.Scanner;

public class Exp_26 {
    public static void main(String[] args) {
        //Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

        char karakter;

        for(karakter= 'K'; karakter <= 'T'; ++karakter){
            System.out.print(karakter+"");//K L M N O P Q R S T
}
        //Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

        char harf = 'k';

        do {
            System.out.print(harf + " ");
            harf++;

        } while (harf < 't');


    }
}
