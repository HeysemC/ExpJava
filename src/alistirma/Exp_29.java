package alistirma;

import java.util.Arrays;

public class Exp_29 {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
                basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
                Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
                         */
        int [] input={4,5,6,7};
        input=elemanBasaTasima(input);

        System.out.println(Arrays.toString(input));

    }
    public static int[] elemanBasaTasima(int[] arr){
        int tasima=arr[arr.length-1];//bize array'in son elemanini kaybetmemek icin

        for (int i =arr.length-2; i>=0; i--){
            arr[i+1]=arr[i];
        }
        arr[0]=tasima;
        return arr;
    }
}
