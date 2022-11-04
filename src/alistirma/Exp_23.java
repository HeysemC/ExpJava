package alistirma;

import java.util.Scanner;

public class Exp_23 {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan bir sayi isteyin,
        sayiyi kontrol edip 5 ile bolunebiliyorsa
        “Sayi 5’in tam kati” yazdirin.
         */
        System.out.println("*********************************");
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen, 5 ile bolunebilmesini test"+
                "\netmek istediginiz sayiyi giriniz");
        double girilenSayi=scan.nextDouble();
        if (girilenSayi%5==0){
            System.out.println("Sayi 5’in tam kati");
        }else {
            System.out.println("Syi 5'in tam kati degil");
        }
        System.out.println("**********************************");
    }
}
