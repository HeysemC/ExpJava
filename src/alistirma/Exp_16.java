package alistirma;

import java.util.Scanner;

public class Exp_16 {
    public static void main(String[] args) {
        //kullanicidan iki sayi alin ve dort islemden istedigini yaptirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz: ");
        double sayi1=scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("Lutfen yapmak istediginiz islemi yaziniz");
        String islem=scan.next();
        switch (islem){
            case "toplama":
                System.out.println("islem sonucu "+sayi1+sayi2);
                break;
            case "cikarma":
                System.out.println("islem sonucu "+ (sayi1-sayi2));
                break;
            case "carpma":
                System.out.println("islem sonucu "+sayi1*sayi2);
                break;
            case "bolme":
                System.out.println("islem sonucu "+sayi1/sayi2);
                break;
            default:
                System.out.println("Hatali islem");
        }
    }

    }

