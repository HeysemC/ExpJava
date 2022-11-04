package alistirma;

import java.util.Arrays;
import java.util.Scanner;

public class Exp_31 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan array’in boyutunu ve
         elementlerini alip array’i olusturan ve bize
                donduren bir method olusturun.
         */
        int[] kullanicininArrayi=kullaniciArrayi();
        System.out.println(Arrays.toString(kullanicininArrayi));
    }
    public static int[] kullaniciArrayi (){
        Scanner scan=new Scanner(System.in);

        System.out.println("Array'in boyutu icin sayisi giriniz");
        int boyut=scan.nextInt();
        int[] girilenSayiArrayi=new int[boyut];

        for (int i = 0; i < girilenSayiArrayi.length; i++) {
            System.out.println("olusturacaginiz array'i icin sayi giriniz");
            girilenSayiArrayi[i]=scan.nextInt();
            
        }
        return girilenSayiArrayi;

    }

}
