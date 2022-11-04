package alistirma;

import java.util.Scanner;

public class Exp_19 {
    public static void main(String[] args) {
/*
Soru 8 (Interview)- Kullanicidan iki sayi alip,
ucuncu bir degisken kullanmadan ikisinin
degerlerini degistirin(swap).
 */


        Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.println("Lutfen sayi giriniz.");

        double s1 = scan.nextDouble();
        System.out.println("A" + s1 );

        double s2 = scan.nextDouble();
        System.out.println("B" + s2);

        System.out.println("A : " + s2 + "B" + s1);



        //Soru : swap

        //Scanner scan = new Scanner(System.in) ;

        System.out.println("sayi1 i gir");
        int sayi1=scan.nextInt();
        System.out.println("sayi2 gir");
        int sayi2=scan.nextInt();
        System.out.println("sayi1: "+ sayi1 + "\nsayi2: "+sayi2);
        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;
        System.out.println("sayi1 : "+ sayi1 + "\nsayi2 : "+sayi2);
    }

}
