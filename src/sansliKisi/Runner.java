package sansliKisi;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        String islem;

        Registration kullaniciKayit=new Registration();

        ArrayList<User> kayit=null;

        boolean cikis=false;




        while (!cikis){

            System.out.println("Lutfen yapmak istediginiz islemi seciniz"+
                               "kisi eklemek icin: 1"+
                               "\nSanli kisiyi bulmak icin: 2"+
                               "\nCikis yapmak : 3");

            islem=scan.next();

            switch (islem){
                case "1":
                    kayit=(ArrayList<User>) kullaniciKayit.register();
                    break;
                case "2":
                    kullaniciKayit.printHappyUser(kayit);
                    break;
                case "3":
                    cikis=true;
                    break;
                default:
                    System.out.println("hatali giris");
                    break;
            }

        }

    }
}
