package alistirma;


public class Exp_34 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
method olusturun.
         */
        int[][] arr={{1},{1,2},{4,6,9}};
        ciftSayilariToplamaArray(arr);

    }
    public static void ciftSayilariToplamaArray(int[][] girecekArray ){
        int toplam=0;
        for (int i = 0; i < girecekArray.length; i++) {
            for (int j = 0; j < girecekArray[i].length; j++) {
               if (girecekArray[i][j] %2 == 0){
                   toplam+=girecekArray[i][j];
               }
            }
        }
        System.out.println(toplam);
    }
}
