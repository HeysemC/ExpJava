package alistirma;

import java.util.Scanner;

public class Exp_08 {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi yaziniz");
        double sayi=scan.nextDouble();

        // sayiyi kontrol edelim 5'e bolunur mu
        if (sayi>=0 && sayi<5){
            System.out.println("tam kati değil");
        } else if (sayi>=5) {
            System.out.println("sayi 5'in: "+(sayi=sayi%5)+" tam kati");
        }else {
            System.out.println("hatali giris");

        }
    }
}
