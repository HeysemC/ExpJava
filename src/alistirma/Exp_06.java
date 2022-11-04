package alistirma;

import java.util.Scanner;

public class Exp_06 {
    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,  yoksa %15 indirim yapin
        //  Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen urun adedinizi giriniz");

        double urunsayisi= scan.nextDouble();

        System.out.println("Lutfen liste fiyatini giriniz");
        double listefiyat= scan.nextDouble();

        System.out.println("Musteri kartınız varsa E yoksa H giriniz");

        char Mk= scan.next().charAt(0);


        if ( urunsayisi>10 && (Mk== 'E'|| Mk=='e'))
        {
            System.out.println("odenecek fiyat: "+ (listefiyat- (listefiyat*0.2) ));


        } else if (urunsayisi>10 && (Mk== 'H'|| Mk=='h')) {
            System.out.println("odenecek fiyat: "+ (listefiyat- (listefiyat*0.15) ));

        } else if ( urunsayisi<=10 && (Mk== 'E'|| Mk=='e')) {
            System.out.println("odenecek fiyat: "+ (listefiyat- (listefiyat*0.15) ));

        } else if (urunsayisi<=10 && (Mk== 'H'|| Mk=='h')) {
            System.out.println("odenecek fiyat: " + (listefiyat - (listefiyat * 0.10)));
        }

    }
}






