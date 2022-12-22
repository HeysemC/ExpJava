package hizlitekrar;

import java.util.Scanner;



public class Soru01 {


    public static void main(String[] args) {
        //Bir string’i ters çeviren uygulama yaz.

        Scanner scan=new Scanner(System.in);
        System.out.println("ters cevirmek istediginiz stringi girin");

        String str=scan.next();

        String tersStr="";

        System.out.println(tersStr.length());


        for (int i = str.length()-1; i >=0 ; i--) {

            tersStr=tersStr+str.charAt(i);


        }

        System.out.println("tersi :" + tersStr);

        StringBuffer a=new StringBuffer("java");
        System.out.println(a.reverse());



    }


}
