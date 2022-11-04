package alistirma;

import java.util.Scanner;

public class Exp_04 {
    public static void main(String[] args) {
       /* 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz(exp:25 or 25,5)");
        double yas = scan.nextDouble();

        System.out.println("isim:"+isim+"\nsoyisim:"+soyisim+"\nyas:"+yas+"\nKaydiniz basariyla tamamlanmistir");

    }
}
