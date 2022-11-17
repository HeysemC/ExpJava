package alistirma;

import java.util.ArrayList;

public class Exp_59_Listing {
    /*

    Bu uygulama kulanıcıların bir ArrayListe kayıt tarihini random alarak ekleyen
    ve sonrasında her ayın ilk 10 gününde kaydolanları şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.

         Yil degiskeni icin 2013 ila 2022 arasinda random sayi uretin
         ay degiskeni icin 1 ila 12 arasinda random sayi uretin
         gun degiskeni icin 1 ila 28 arasinda random sayi uretin
         LocalDate clasini kullanarak bu uc degiskeni bir method icine gonderin ve random tarih uretin

          Bunun için;
          1- Bir user class oluşturun fields: name , registerDate (LocalDate cinsinden)

          2- Registration isminde bir class oluşturun ve register isminde bir metod
          ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin

          3-Listing isminde bir class oluşturun ve printHappyUsers isminde bir metod ekleyerek
          ArrayListteki userlardan her ayın ilk 10 gününde kaydolanları yazdıran metodu oluşturun.

*/
    void listele(ArrayList<Exp_59_User> pakize){
        if (!pakize.isEmpty()){
            for (Exp_59_User abuziddin: pakize){
                if(abuziddin.registerDate.getDayOfMonth()<=10){
                    System.out.println(abuziddin.name+" Sansli kullanicisiniz."+abuziddin.registerDate+" tarihinde kaydoldu.");
                }else {
                    System.out.println(abuziddin.name+" Sansli kullanici degilsinz."+abuziddin.registerDate+" tarihinde kaydoldunuz.");
                }
            }
        }else {
            System.out.println("Liste bos");
        }



    }
}
