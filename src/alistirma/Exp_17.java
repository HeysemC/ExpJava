package alistirma;

public class Exp_17 {
    public static void main(String[] args) {
        /*
        Soru 4 : Kullanicidan bir sifre isteyip,
         asagidaki sartlari kontrol edin ve
        kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali
         */

        //bagimsiz if cumleleri
        String sifre="s* sifr9000";
        int bayrak=0;


        //ilk harf kucuk harf olmali
        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmali");


            // son karakter rakam olmali
        }if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmali");



            //"sifre bosluk icermemeli "
        }if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli ");


            //uzunlugu en az 10 karakter olmali
        }if (!(sifre.length()>=10)){
            System.out.println("uzunlugu en az 10 karakter olmali");



        }if (bayrak==0){
            System.out.println("sifre basariyla kaydedildi");
        }


    }
}
