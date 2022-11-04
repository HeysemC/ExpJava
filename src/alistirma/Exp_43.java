package alistirma;

import java.util.Scanner;

public class Exp_43 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane Fibonacci
                sayisini bir list olarak donduren bir method olusturun.
         */
                 fibonacci();
    }
    public static int fibonacci(){
        Scanner scan=new Scanner(System.in);
        //int girilenSayiFibonacci=scan.nextInt();
        int n1=0,n2=1,n3,n;
        System.out.print("N Sayısını Girin:");
        n = scan.nextInt();
        System.out.print(n1+" "+n2);//0 ve 1 yazdır

        for (int i = 2; i <n ; i++)

        //Döngü 2 den başlıyor çünkü ilk 2 terim 0 ve 1 her zaman yazılacak
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
        return n;
    }

}



