package alistirma;

import java.util.Scanner;

public class Exp_50 {
    /*
    Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
            kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("bir cumle giriniz");
        String cumle=scan.next();

        System.out.println("bir harf giriniz");
        String harf=scan.next();
        char krk=harf.charAt(0);
        int sayac=0;




        for (int i = 0; i < cumle.length(); i++) {
            if (krk == cumle.charAt(i)) {
                sayac++;
            } else {
                System.out.println("kullanilmamistir");
            }
        }
        System.out.println(sayac+"kere kullanildi");
    }
}
