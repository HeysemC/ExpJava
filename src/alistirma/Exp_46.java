package alistirma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exp_46 {
    public static void main(String[] args) {

        /*
        Soru 5- Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
                bir liste olarak bize donduren bir method olusturun.
         */
        fibonacciKucukSayi();
    }
    public static int fibonacciKucukSayi (){
        Scanner scan=new Scanner(System.in);
        //int girilenSayiFibonacci=scan.nextInt();
        int n1=0,n2=1,n3,n;
        System.out.print("N Sayısını Girin:");
        n = scan.nextInt();
        System.out.print(n1+" "+n2);//0 ve 1 yazdır

        for (int i = 2; i <n ; i++)
        //Döngü 2 den başlıyor çünkü ilk 2 terim 0 ve 1 her zaman yazılacak
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (n3<n)System.out.print(" " + n3);
        }
        System.out.println();
        return n;
    }


}
