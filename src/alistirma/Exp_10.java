package alistirma;

import java.util.Scanner;

public class Exp_10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen asagidaki bilgileri giriniz,");
        System.out.print("\nAdiniz: ");
        String isim=scan.nextLine();
        System.out.print("Soyadiniz: ");
        String soyİsim=scan.nextLine();
        System.out.print("Yasiniz: ");
        double yas=scan.nextDouble();


        System.out.println(isim +" "+soyİsim+","+yas);
    }
}
