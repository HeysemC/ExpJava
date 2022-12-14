package mayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {

    /*
    Kullanicidan oynamak istedigi oyun alaninin buyuklugunu girmesin istensin.

    Kullanici tarafindan girilen buyuklukte bir matris rastgele olusturulsun. Olusturulan matriste sadece 0 ve 1 degerleri vardir.

    0 degerleri temiz; 1 degerleri mayinli bolgeleri gostersin.

    Oyunun baslangicinda kullanicinin puan degeri 0'dir. Kullanicidan secmek istedigi lokasyonun satir ve sutun sayisi girmesi istensin.

    Eger kullanicinin girdigi pozisyonda mayin yoksa oyuncunun puani 10 artirilir ve "Hala hayattasin....Devam" mesaji verilir

    ve yeni satir ve sutun degerleri girmesi istenir. eger kullanici mayinli bir bolge secmis ise "Oyun bitti! Puaniniz:
    "
    mesaji ile program sonlandirilir.

     */




    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("mayin tarlasi icin satir sayisi giriniz");
        int satirSayisi= scan.nextInt();

        System.out.println("mayin tarlasi icin sutun sayisi giriniz");
        int sutunSayisi=scan.nextInt();

        int[][] olusacakMatris=mayinTarlasi(satirSayisi,sutunSayisi);



        int kazanilanPuan=0;

        boolean giris=true;

        while (giris){

            System.out.println("x degerini girin");
            int apsis=scan.nextInt();

            System.out.println("y degerini girin");
            int ordinat=scan.nextInt();



            if (olusacakMatris[apsis][ordinat]==1){
                giris=false;
            }else {

                kazanilanPuan=kazanilanPuan+10;
                System.out.println("Hala hayattasin....Devam");
            }

        }
        System.out.println("Game OVER!"+"\nPuanınız = "+kazanilanPuan);


    }

    public static int [] [] mayinTarlasi(int satir,int sutun){


        Random random=new Random();


        int [][] matris=new int[satir+1][sutun+1];

        int x=0;
        int y=0;



        while (x<satir){


            while (y<sutun){

                matris [x] [y]=random.nextInt(2);
                y=y+1;

            }
            x=x+1;


        }
        int i=0;
        int j=0;

        for ( i = 0; i < satir; i++) {
            for (j = 0; j < sutun; j++) {
                System.out.print(matris[i][j]);




            }

        }


        return matris;
    }
}
