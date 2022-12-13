package LucyPerson;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int islem;

        Registration kullaniciKayit=new Registration();

        boolean cikis=false;

        ArrayList<User> kayitEdilenler =new ArrayList<>();


        while (!cikis){
            System.out.println("Yapmak istediginizi islemi secin" +
                               "\nKisi kayitEdilenler icin : 1" +
                               "\nSansli kullanici icin : 2" +
                               "\nCikis yapmak icin : 3");

            islem=scan.nextInt();

            switch (islem){

                case 1:
                    kayitEdilenler =kullaniciKayit.register();

                    break;
                case 2:
                    kullaniciKayit.printHappyUser(kayitEdilenler);
                    break;

                case 3:
                    cikis=true;
                    break;

                default:
                    System.out.println("Hatali tuslama");
                    break;

            }
        }
    }

}
