package alistirma;

public class Exp_67 {

/*

SET Sorusu 2 : Bir String’ de kullanılan farklı karakterleri yazdırmak için
 kod yazınız.
Örnek: ‘Mississippi’ ´ Misp

 */
public static void main(String[] args) {


    String str = "Mississippi";

    String strTekOlanlar = "";

    for (String i:str.split("")){

        if (!strTekOlanlar.contains(i)){

            strTekOlanlar += i;
        }
    }
    System.out.println(strTekOlanlar);// Misp

}
}
