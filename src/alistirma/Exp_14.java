package alistirma;

import java.util.Scanner;

public class Exp_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("LÜTFEN BİR METİN GİRİN ");
        String isim=scan.nextLine();
        System.out.println("wht mot?");


        // kullnıcın verdiği sayının faktoryelini bulun
        int sayi=6; // olsun
        int sayi1=sayi;
        int faktoryel=1;
        System.out.print(sayi+"!"+"="+sayi);
        for (int i = sayi; i >=1 ; i--) {
            faktoryel=faktoryel*i;

            if (sayi1>1) { --sayi1;
                System.out.print("*"+sayi1);}}
        System.out.println("= "+ faktoryel);



            }
}
