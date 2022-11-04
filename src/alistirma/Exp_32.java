package alistirma;

public class Exp_32 {
    public static void main(String[] args) {
        /*
        Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
                olusturun.
         */
        String[] str={"uzun","kisa","çokkisa","kisanin kisasi","big tools"};
        uzunKisaKelime(str);
    }
    public static void uzunKisaKelime (String [] arr){
        String kisaKelime=arr[0];
        String uzunKelime=arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i].length() > uzunKelime.length()) uzunKelime = arr[i];
            if (arr[i].length() < kisaKelime.length()) kisaKelime = arr[i];
        }
        System.out.println("En uzun kelime : " +uzunKelime);
        System.out.println("En kisa kelime : " +kisaKelime);
    }
}
