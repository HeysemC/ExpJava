package alistirma;

import java.util.Arrays;

public class Exp_44 {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5,6,7,8,9};

        int toplam=0;

        for (int each : arr1){

                toplam=toplam+each ;

        }


        System.out.println(Arrays.toString(arr1));
        System.out.println(toplam);



    }
}
