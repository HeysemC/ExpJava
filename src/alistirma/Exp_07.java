package alistirma;

import java.util.Scanner;

public class Exp_07 {
    public static void main(String[] args) {
        //- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scan = new Scanner(System.in);
        System.out.println("müşteri kartınız var mı?");
        char kart = scan.next().charAt(0);
        System.out.println("lütfen ürün adedini giriniz");
        int urunAdedi = scan.nextInt();
        System.out.println("liste fiyatını giriniz");
        double fiyat = scan.nextDouble();

        //karta göre
        if (kart=='e'|| kart=='E'||kart=='v'||kart=='V'){
            if (urunAdedi>=10){
                System.out.println("%20 indirimli fiyat :"+(fiyat=fiyat*urunAdedi*0.80));
            }else {
                System.out.println("%15 indirimli fiyat :"+(fiyat=fiyat*urunAdedi*0.85));
            }
        } else if (kart=='y'||kart=='Y'||kart=='h'||kart=='H') {
            if (urunAdedi>=10){
                System.out.println("%15 indirimli fiyat :"+(fiyat=urunAdedi*fiyat*0.85));
            }else {
                System.out.println("%10 indirimli fiyat :"+(fiyat=urunAdedi*fiyat*0.90));
            }
        }else {
            System.out.println("hatali giris");
        }

    }
}
