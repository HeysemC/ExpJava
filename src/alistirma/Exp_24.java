package alistirma;

import java.util.Scanner;

public class Exp_24 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
Kullanici o veya O yazdiginda output Ocak olsun.
         */

        System.out.println("Lutfen bir harf giriniz");
        Scanner scan=new Scanner(System.in);

        char harf=scan.next().charAt(0);//ilk harf icin 0 degerini girdik



        if (harf=='a' ||harf=='A'){
            System.out.println("Aralık veya Agustos");
        }
        if (harf=='s'||harf=='S'||harf=='Ş'||harf=='ş'){
            System.out.println("Şubat veya subat");
        }
        if (harf=='o'||harf=='O'){
            System.out.println("Ocak");
        }
        if (harf=='m'||harf=='M'){
            System.out.println("mart veya mayis");
        }
        if (harf=='n'||harf=='N'){
            System.out.println("nisan");
        }
        if (harf=='h'||harf=='H'){
            System.out.println("haziran");
        }
        if (harf=='t'||harf=='T'){
            System.out.println("temmuz");
        }
        if (harf=='e'||harf=='E'){
            System.out.println("Eylul veya Ekim");
        }
        if (harf=='k'||harf=='K'){
            System.out.println("Kasim");
        }
        if (!(harf=='a'||harf=='A'||harf=='s'||harf=='S'||harf=='Ş'
                ||harf=='ş'||harf=='o'||harf=='O'||harf=='m'||harf=='M'
                ||harf=='n'||harf=='N'||harf=='h'||harf=='H'
                ||harf=='t'||harf=='T'||harf=='e'||harf=='E'
                ||harf=='k'||harf=='K')){
            System.out.println("hatali giris,lutfen ay ismi girin");
        }


    }
}
