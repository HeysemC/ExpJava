package alistirma;

import java.util.Scanner;

public class Exp_03 {
    public static void main(String[] args) {
       // 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
        //yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("bir double, bir de int sayi yaziniz");
        double scan1 = scan.nextDouble();
        int scan2 = scan.nextInt();
        System.out.println("yazdiginiz sayilarin carpimi ve toplami");

        System.out.println(scan1*scan2+" "+(scan1+scan2));
    }
}
