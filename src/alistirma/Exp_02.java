package alistirma;

import java.util.Scanner;

public class Exp_02 {
    public static void main(String[] args) {

        //1- Kullanicidan uc farkli data deger
        // alip,girilen degerleri aciklamalari ile yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("int deger yaziniz");
        int a = scan.nextInt();

        System.out.println("double 2 deger yaziniz");
        double c = scan.nextDouble();

        double c1 = scan.nextDouble();
        System.out.println((c/c1)+" "+(c*c1));
        System.out.println("float deger yaziniz");
        float d = scan.nextInt();

        float d1 = scan.nextInt();
        System.out.println((d/d1)+" "+(d*d1));
        System.out.println("string deger yaziniz");
        String e = scan.next();
        System.out.println("char deger yaziniz");
        char f = 'F';
        System.out.println(f);



    }
}
