package sansliKisi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    /*
    2- Registration isminde bir class olusturun ve register isminde bir method ekleyerek
       kullanicidan user ismini alarak ArrayList'e ekleyin ve bu List'i return edin
   */
    ArrayList<User> kullanicilar = new ArrayList<>();

    public ArrayList<User> register() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi giriniz : ");
        String isim = scan.nextLine();
        User user = new User(isim, LocalDateTime.now());
        kullanicilar.add(user);
        return kullanicilar;
    }

    //3- Registration class'i ayni zamanda kendine verilen ArrayList'teki userlardan her dakikanin
    //   ilk 10 saniyesinde kaydolanlari yazdiran printHappyUser isminde bir method daha ekleyiniz
    public void printHappyUser(ArrayList<User> users) {
        for (User each : users) {
            if (each.registerDate.getSecond() < 10) {
                System.out.println(each.name + " Sanslisiniz");
            } else {
                System.out.println("Maalesef ki " + each.name + " Sansli Degilsiniz");
            }
        }

    }
}
