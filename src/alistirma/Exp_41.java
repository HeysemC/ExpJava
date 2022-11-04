package alistirma;

import java.util.ArrayList;
import java.util.List;

public class Exp_41 {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
        kalan kismini list olarak bize donduren bir method olusturun
         */
        silmeArrayden();

        }
        public static List<String> silmeArrayden (){
            List<String> harfler=new ArrayList<>();
            harfler.add("abi");
            harfler.add("baci");
            harfler.add("cari");
            List<String> silinecekler=new ArrayList<>();
            silinecekler.add("abi");
            harfler.removeAll(silinecekler);
            System.out.println(harfler);
            return harfler;
        }
    }





