package alistirma;

import java.util.Arrays;

public class Exp_48 {
    /*
  Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
          yazdiran bir method olusturun.
     */
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        karelerToplamiArray(arr);

    }
    public static void karelerToplamiArray(int[] arr){
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i]*arr[i];
        }
        System.out.println("Verilen array'in kareler toplami : "+toplam);
    }

}
