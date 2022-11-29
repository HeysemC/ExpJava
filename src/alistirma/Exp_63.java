package alistirma;

import java.util.Scanner;

public class Exp_63 {
    /*
    Kullanicidan doğum ayini
    ve doğum gününü alarak burç hesaplama sorusu
     */
    public static void main(String[] args) {
        int month, day ;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen dogdugunuz ayi sayısal deger olarak giriniz");
        month = input.nextInt();

        System.out.println("dogduguuz günü giriniz");
        day = input.nextInt();

        String burc = " ";
        boolean isError = false;

        if (!(month>=1 && month<=12)){
            System.out.println("Hatali giris");

        }

        switch (month) {
            case 1:
                if (day>=1 && day <=31){
                    if (day<20){
                        burc = "Oğlak";
                    }else{
                        burc="Kova";
                    }
                }else{
                    isError=true;
                }
                break;
            case 2:
                if (day>=1 && day <=28){
                    if (day<20){
                        burc = "Kova";
                    }else{
                        burc="Balık";
                    }
                }else{
                    isError=true;
                }
                break;
            case 3:
                if (day>=1 && day <=31){
                    if (day<21){
                        burc = "Balık";
                    }else{
                        burc="Koç";
                    }
                }else{
                    isError=true;
                }
                break;
            case 4:
                if (day>=1 && day <=30){
                    if (day<21){
                        burc = "Koç";
                    }else{
                        burc="Boğa";
                    }
                }else{
                    isError=true;
                }
                break;
            case 5:
                if (day>=1 && day <=31){
                    if (day<21){
                        burc = "Boğa";
                    }else{
                        burc="İkizler";
                    }
                }else{
                    isError=true;
                }
                break;
            case 6:
                if (day>=1 && day <=30){
                    if (day<22){
                        burc = "İkizler";
                    }else{
                        burc="Yengeç";
                    }
                }else{
                    isError=true;
                }
                break;
            case 7:
                if (day>=1 && day <=31){
                    if (day<23){
                        burc = "Yengeç";
                    }else{
                        burc="Aslan";
                    }
                }else{
                    isError=true;
                }
                break;
            case 8:
                if (day>=1 && day <=31){
                    if (day<24){
                        burc = "Aslan";
                    }else{
                        burc="Başak";
                    }
                }else{
                    isError=true;
                }
                break;
            case 9:
                if (day>=1 && day <=30){
                    if (day<24){
                        burc = "Başak";
                    }else{
                        burc="Terazi";
                    }
                }else{
                    isError=true;
                }
                break;
            case 10:
                if (day>=1 && day <=31){
                    if (day<24){
                        burc = "Terazi";
                    }else{
                        burc="Akrep";
                    }
                }else{
                    isError=true;
                }
                break;
            case 11:
                if (day>=1 && day <=30){
                    if (day<23){
                        burc = "Akrep";
                    }else{
                        burc="Yay";
                    }
                }else{
                    isError=true;
                }
                break;
            case 12:
                if (day>=1 && day <=31){
                    if (day<22){
                        burc = "Yay";
                    }else{
                        burc="Oğlak";
                    }
                }else{
                    isError=true;
                }
                break;
        }
        if (isError){
            System.out.println("Hatalı giris yaptiniz. lütfen tekrar deeyiniz");
        }

    }
}
