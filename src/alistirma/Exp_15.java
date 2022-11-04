package alistirma;

import java.util.Scanner;

public class Exp_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük tam sayı giriniz.");
        int sayi=scan.nextInt();

        int faktoriyel = 1;

        System.out.print(sayi+"!"+ " ="); // girilen sayı Örnek : " 5! = " ifadesini yazdırdık.

        for (int i=1;i<=sayi;i++) //Döngümüzü başlattık. i=1 'Den sayıya kadar çarpıcaz.
        {
            faktoriyel=faktoriyel*i; // i her arttığında sayıya kadar kendisiyle çarpıyoruz ve faktoriyele yazdırıyoruz.
            if(i!=sayi) //Buradaki if en son sayının kendisine geldiğinde tekrar * koymaması için koyuldu. Örn bu ifi koymasak
            //Sadece sout(i+" * ") ile devam etmiş olsaydık yani i'yi her arttığında yazdırsaydık örn : 5!= 1*2*3*4*5*= 120 yazacaktı.
            //Yani sondaki 5'in yanındaki çarpı işareti fazladan olacaktı. O yüzdne bu if ile sayının kendisine gelindiğinde sadece i'yi yazdırıyoruz.
            {
                System.out.print(i+ " * ");
            }
            else {
                System.out.print(i);
            }

        }
        System.out.print(" = "+faktoriyel); //Son olarak değeri yazdırıyoruz. TEk satırda gözükmesi için 'ln' kullanmıyoruz.
    }


}
