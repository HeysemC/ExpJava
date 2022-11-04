package alistirma;

import java.util.Scanner;

public class Exp_01 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Lutfen isminizi giriniz");

        String isim = scan.next() ;

        System.out.println("Lutfen soyisminizi giriniz");

        String soyisim = scan.next() ;

        System.out.println("Lutfen yasinizi girin");

        int yas = scan.nextInt() ;

        System.out.println("isim :" + isim + " \n soyisim : "+ soyisim + "\n yas : " + yas);




    }
}
