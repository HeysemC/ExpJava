package alistirma;

public class Exp_37 {
    public static void main(String[] args) {

        /*
        Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpimini bize donduren bir
               method olusturun.
         */
        int[][] arr={{1,2},{2,99},{4,5}};
        ciftKatliArrayCarpimi(arr);

    }
    public static int ciftKatliArrayCarpimi(int[][] arr){
        int carpim=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                carpim*=arr[i][j];
            }

        }
        System.out.println(carpim);
        return carpim;
    }


}
