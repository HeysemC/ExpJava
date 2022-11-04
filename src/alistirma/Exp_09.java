package alistirma;

import java.util.Scanner;

public class Exp_09 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf isteyin,
         girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
         yoksa girilen harfi yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf girin");
        String harf=scan.next().toUpperCase();
        System.out.println(harf);
    }
}
