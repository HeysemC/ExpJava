package alistirma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exp_40 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan istedigi kadar isim alip,
                Q’ya bastiginda girdigi isimleri bize
                liste olarak dondurecek bir method olusturun.
         */
        System.out.println(listeleme());

    }

    public static List<String> listeleme() {

        List<String> isimler = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println(" : Lutfen isim giriniz ve cikmak icin Q'ya basiniz : ");

        String girilenIsimler = "";

        while (!girilenIsimler.equalsIgnoreCase("q")) {

            girilenIsimler = scan.nextLine();

            if (!girilenIsimler.equalsIgnoreCase("q")) {
                isimler.add(girilenIsimler);
            }
        }
        return isimler;
    }
}
