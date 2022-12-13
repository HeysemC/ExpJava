package LucyPerson;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    /*

    2- Registration isminde bir class olusturun ve register isminde bir method ekleyerek
       kullanicidan user ismini alarak ArrayList'e ekleyin ve bu List'i return edin

     */



    public ArrayList<User> register () {


        ArrayList<User> users=new ArrayList<>();


        Scanner scan=new Scanner(System.in);


        System.out.println("adinizi giriniz");


        String isim=scan.nextLine();


        User user =new User(isim, LocalDateTime.now());


        users.add(user);



        return users;

    }

    /*

    3- Registration class'i ayni zamanda kendine verilen ArrayList'teki userlardam her dakikanin
     ilk 10 saniyesinde kaydolanlari yazdiran printHappyUser isminde bir method daha ekleyiniz

     */

    public void printHappyUser (ArrayList<User> users){

        for (User each:users
             ) {

            if (each.registerDate.getSecond()<10){

                System.out.println(each.name+" :Lucy's brooo");


            }else {
                System.out.println("unfortunately you didn't win");

            }

        }











    }

}
