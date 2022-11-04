package alistirma;

import java.util.Arrays;

public class Exp_33 {
    public static void main(String[] args) {
        /*
        Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
                eski array’e yeni degeri atayin.
         */
        int[] arr = {1, 2, 3, 4, 5, 66, 77, 88, 99, 10001, 1123213};
        int eklenecekSayi = 34;
        arr=elenecekSayi(arr,eklenecekSayi);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 66, 77, 88, 99, 10001, 1123213, 34]


    }
    public static int[] elenecekSayi(int[] eklenecekArray,int eklenecekDeger){
        int[] yeniArray=new int[eklenecekArray.length+1];
        for (int i = 0; i < eklenecekArray.length; i++) {
            yeniArray[i] = eklenecekArray[i];
        }
        yeniArray[yeniArray.length-1]=eklenecekDeger;
        return yeniArray;
    }
}
