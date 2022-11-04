package alistirma;

public class Exp_38 {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
                toplaminini yazdiran bir method olusturun.
         */
        int[][] arr={{3,6},{1,89}};
        sonElementlerinToplami(arr);
    }
    public static void sonElementlerinToplami (int[][] arr){
        int sonElemanToplami=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sonElemanToplami+=arr[i][j]-1;
            }
        }
        System.out.println(sonElemanToplami);
    }
}
