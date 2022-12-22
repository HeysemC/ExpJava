package hizlitekrar;

import java.util.Arrays;
import java.util.Scanner;

public class Soru02 {

    public static void main(String[] args) {
/*
        Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        Eski array’i yeni haliyle kaydedin.


     */

        int [] arr={2,4,6,8};



        for (int i = 0; i < arr.length; i++) {

            arr[i]=arr[i]+2;

        }
        System.out.println(Arrays.toString(arr));
    }
}
