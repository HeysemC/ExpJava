package alistirma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exp_49 {
    /*
    Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
            - Kelimenin uzunlugu cift sayi ise ilk yarisini
            - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
            yeni bir listeye ekleyip yazdirin.
     */
    public static void main(String[] args) {
        String[] arr={"Ali","Veli","Heysem","Mehmet","Enkisakelime"};

        String ciftSayiliKelime=arr[0];
        String tekSayiliKelime=arr[0];
        List<String> yeniArr =new ArrayList<String>();

        for (String each:arr) {
            if (each.length()%2==0){
                yeniArr.add(each.substring(0,each.length()/2));
            }else{
                yeniArr.add(each.substring((each.length()-1)/2));
            }
        }
        System.out.println(yeniArr);
    }
}
