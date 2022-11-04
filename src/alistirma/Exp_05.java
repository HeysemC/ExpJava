package alistirma;

import java.util.Scanner;

public class Exp_05 {
    public static void main(String[] args) {
        int num = 11;

        num = num + 2;

        num--;

        num--;

        System.out.println(num);

        /*
        Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        dikdortgenin alanini
        yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("*********************************************************\n"+
                "\tDikdortgenin alanin icin iki kenar uzunlugu giriniz\n" );
        System.out.print("kenar1: ");
        double kenar1=scan.nextDouble();
        System.out.print("kenar2: ");
        double kenar2=scan.nextDouble();
        System.out.println("Diktörgeninizin alani: "+(kenar1*kenar2)+
                "\n\n*********************************************************");











    }
}
