package alistirma;

import java.util.Scanner;

public class Exp_12 {
    public static void main(String[] args) {
        /*Soru 8 (Interview)- Kullanicidan iki sayi alip,
        ucuncu bir degisken kullanmadan ikisinin,
        degerlerini degistirin(swap).

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir harf giriniz");

        char harf = scan.next().charAt(0);



        if (harf >= 'a' && harf <= 'z') {

            System.out.println("Kucuk harf");

        } else if (harf >= 'A' && harf <= 'Z') {

            System.out.println("Buyuk harf");

        } else {

            System.out.println("Giris hatali,lutfen harf giriniz!");

        }


        }

    }
