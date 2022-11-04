package alistirma;

import java.util.Arrays;

public class Exp_27 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
                olusturun. Eski array’i yeni haliyle kaydedin.
         */
        int[] arr={1,2,3,4};

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i]+2;

        }
        System.out.println(Arrays.toString(arr));
        arr = arrayinElemanlariniArtirma(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] arrayinElemanlariniArtirma (int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = arr[i] + 2;
        }
    return arr;
    }

}
