package alistirma;

public class Exp_73 {public static void main(String[] args) {
    int[] arr = {1,2,3,9,7,6,5};



    boolean sonuc=mountainArrayiBulmaMethod2(arr);
    System.out.println(sonuc);

}

    private static boolean mountainArrayiBulmaMethod2(int[] arr) {
        if (arr.length < 3){// ilk basta lengti kontrol etmelıyız cunku mountaın array ıcın en az  3 elemanlı array lazım
            return false;//Eleman sayısı 3 ten azssa false donecek
        }
        int  i = 0;//i yi daha sonrasında tekrardan kullancagımız ıcın dısarıdan baslatıyoruz
        for (i = 1; i < arr.length; i++){
            //Arrayin lengtihne kadar gidiryoruz cunku kontrol edecegız ve
            // 1. indexteki sayıdan baslıyoruz cunku tum sayilari kendinden bir onceki sayiyla kontrol edecegız
            if (arr[i] <= arr[i - 1]){
                //Eger ki bizim i.ci indexteki sayımız kendinden bi oncekinden demekki buyuk sayılardan bırını bulmusuz
                // ornegin {1,2,3,9,7,6,5} Arrayinde  7 ye kadar butun sayılar kendıden bi onceki sayidan buyuk yanı bız anlıyoruz kı bır azalma var
                // ve mountaın olma ıhtımalı var ama daha kontrol etme ıslemımız bıtmedi cunki bize duzenli bir azalma lazım
                break;//donguyu burada bitiryoruz ve i nereye kadar gelmişse orda kalıyor cunki oradan sonra kontrol ıslemı devam edecek
            }

        }
        if (i == arr.length || i == 1){
            //burda ki ifin amaci eger ki sayi her seferinde kendinden onceki sayıdan buyukse
            // demekki ilk if'e takılammıs ve sona kadar devam etmiş duzenli bir artıs var ve azalma yok o yuzden mountaın array olması soz konusu olmaz cunku bıze azalma lazım
            return false;//azalma yoksa ıcınde bulundugumuz ıf calıssmıssa false dondermesı lazım yanı mountaın soz konusu degıl ve sıstem kapanır
        }
        for (; i < arr.length; i++){
            //Burada i ye deger atamıyoruz cunku i yi kaldıgı yerden devam ettirecegiz
            // orngın bu array {1,2,3,9,7,6,5} ıcın konusursak i suan 7nin bulundugu indexte
            // cunku i kendınden once kı sayıdan kucuk
            if (arr[i] >= arr[i - 1])
                //Burada da kendınden oncekı sayıdan buyuk mu degıl
                //Eger kendınden once kı sayıdan buyukse demekkı artıs var ama mountaın Array ıcın azalması lazım
                break;//Kendınden oncekı sayıdan buyukse donguyu kapatsın cunku mountaın soz konusu degıl
        }
        return i == arr.length;
        //burada eger i eger sona kadar ulasmıssa demekkı duzenlı bır azalma var
        // ve Arrayımız mountaın Arraydır eger ki lengthe esıt degılse demekkı sona ulasamamıs ve mountaın Array degıldır.
    }
}
