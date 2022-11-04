package alistirma;

import java.util.Scanner;

public class Exp_22 {
    public static void main(String[] args) {
        /*
Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim
^^ Ipucu 1: Sayi % 10 => Bize son basamagi verir
1469 % 10 = 9
Ipucu 2: Int Sayi /10 => Bize son basamak haric sayiyi verir
int sayi=1469;
sayi = sayi / 10 =>
sayi’ya 46 degerini atar^^
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dort basamakli pozitif bir sayi giriniz");
        int sayi=scan.nextInt();
        int birlerBas=sayi%10;
        int onlarBas=(sayi/10)%10;
        int yuzlerBas=(sayi/100)%10;
        int binlerBas=(sayi/1000)%10;
        int rakamlarToplami=birlerBas+onlarBas+yuzlerBas+binlerBas;
        System.out.println(rakamlarToplami);

    }
}
