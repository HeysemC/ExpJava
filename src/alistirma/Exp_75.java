package alistirma;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exp_75 {
    /*
        // Kullanicidan istedigi buyuklukte bir diziyi 0-100 arasinda rastgele
        // olusturulmus sayilarla ( random class'indan faydalandik) doldurup
        // bu sayilarin standart sapmasini hesaplayin

     */

    public static void main(String[] args) {
        int arrayBoyutu;

        int indexI;

        int standartSapmaToplami = 0;



        Scanner scan=new Scanner(System.in);

        System.out.print("Olusturmak istediginiz array'in boyutunu yaziniz :");

        arrayBoyutu=scan.nextInt();

        Random random=new Random();


        int [] kullanicininOlusturduguArr=new int[arrayBoyutu];

        for (indexI=0;indexI<arrayBoyutu;indexI++){

            kullanicininOlusturduguArr [indexI]=random.nextInt(100);

            System.out.println(Arrays.toString(kullanicininOlusturduguArr));


            standartSapmaToplami+=kullanicininOlusturduguArr[indexI];

            System.out.println("Toplam :"+standartSapmaToplami);

        }
         float ortalama=(float) standartSapmaToplami/arrayBoyutu;

        System.out.println("Ortalama :"+ortalama);

        float varyans=0;

        for (indexI=0;indexI<arrayBoyutu;indexI++){
            varyans+=Math.pow(kullanicininOlusturduguArr[indexI]-arrayBoyutu,2);
            System.out.println(varyans);
        }

        double stndtSapma=0;

        stndtSapma=Math.sqrt(varyans/(arrayBoyutu-1));

        System.out.println("stndsp"+stndtSapma);















    }
}
