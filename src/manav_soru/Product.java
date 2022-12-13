package manav_soru;

import java.util.HashMap;
import java.util.Map;

public class Product {

/*
Arkadaslar gunaydin Manav sorusunu
Map kullanarak dener misiniz ?
Mesela urun ve fiyatlari key value seklinde map'e atsaniz
hatta farkli classlarda calissaniz
urunler diye class olsa orda parametreli constructor
kullanarak urunleri elde etseniz
onlari list'e veya Map'e atasaniz gibi gibi...
Neler yapabiliyorsunuz gorelim...
Her mentor grubu kendi icinde calisip
bir temsilci secip cevabi paylasabilir..

***********************************

* Basit bir 5 ürünlü manav alisveris programi yaziniz.

   1. Adim : urun listesinden urun sectir ve
             kac kilo oldugunu sor.

   2. Adim : Baska bir urun almak isteyip istemedigini sor.
             istemiyorsa toplam miktari goster,
             istiyorsa tekrar urun sectir.
             Bu islemi alisverisi bitirmek isteyene kadar tekrarla.

   3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
             toplam fiyata ekle.

   4. Adim : Alisveris bitince toplam odemesi gereken tutari
             goster.
 */

    String urun;


    double fiyat;

    Product(String urun, double fiyat) {

        this.urun = urun;

        this.fiyat = fiyat;

        Map<String,Double> product_map=new HashMap<>();

        product_map.put(urun, fiyat);

        System.out.println(product_map);
    }
    public double getFiyat() {
        return fiyat;
    }
}
