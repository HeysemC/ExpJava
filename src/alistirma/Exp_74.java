package alistirma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exp_74 {
    /*
    LEETCODE Soru  : 1 . İki Toplam Sorusu
Bir tamsayı dizisi
nums ve bir tamsayı verildiğinde
target, iki sayının dizinlerini, toplamları şuna eşit olacak şekilde döndürüntarget .
Her girdinin tam olarak bir çözümü olacağını varsayabilir ve aynı öğeyi iki kez kullanamazsınız .
Cevabı istediğiniz sırayla geri gönderebilirsiniz.

Giriş: sayilar = [2,7,11,15], hedef = 9
 Çıkış: [0,1]
 Açıklama: sayilar[0] + sayilar[1] == 9 olduğu için [0, 1] döndürürüz.

     */
    public static void main(String[] args) {


        int[] arr = {2, 7, 11, 15};

        int hedef = 9;

        List<Integer> arananHedef=new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {

            if (arr[i]+arr[i-1]==hedef){

                arananHedef.add(i-1);

                arananHedef.add(i);

            }

        }
        System.out.println(arananHedef);





    }
}
/*
 public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        List<Integer> target = new ArrayList<>();
        int sayi = 9;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] + arr[i - 1] == sayi) {
                target.add(i - 1);
                target.add(i);
            }
        }
        System.out.println(target);
//========================Cozum2=========================
        int[] arr1 = {3, 2, 4};
        List<Integer> target1 = new ArrayList<>();
        int sayi1 = 6;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr1[i] + arr1[j] == sayi1) {
                    target1.add(j);
                    target1.add(i);
                }
            }
        }
        System.out.println(target1);
    }
 */