package alistirma;

import java.util.Scanner;

public class Exp_11 {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan bir cemberin yaricapini alip,
        cevresini ve alanini yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Cemberin yaricapini yaziniz: ");
        double yariCap=scan.nextDouble();
        System.out.print("Cemberin cevresi: "+(yariCap*2*3.14)+"\nCemberin alani: "+(yariCap*yariCap*3.14));
    }
}
