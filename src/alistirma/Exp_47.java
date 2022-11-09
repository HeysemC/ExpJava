package alistirma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exp_47 {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
                tamsayilari bir liste olarak bize donduren bir method olusturun.
         */

            bolenListe();

    }
    public static List<Integer> bolenListe (){
        List<Integer> tamBolenler=new ArrayList<>();

        Scanner scan=new Scanner(System.in);

        System.out.println("Pozitif bir tam sayi giriniz");

        int girilenSayi=scan.nextInt();

        for (int i = 1; i < girilenSayi; i++) {
          if (girilenSayi%i==0){
              tamBolenler.add(i);
          }
        }
        System.out.println(tamBolenler);

        return tamBolenler;
    }
}
