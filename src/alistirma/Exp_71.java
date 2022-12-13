package alistirma;

import java.util.HashMap;
import java.util.Map;

public class Exp_71 {
    public static void main(String[] args) {
        /*
        MAP Soru 3 : Count the words in a String one by one
        Girilen bir String'deki kelimeleri
        tek tek saydiran java code create ediniz.
        For Example:

        Input :

        String is
        "Ali came to school and Ayse came to school"

        Output :

        Ali=1, came=2, to=2, school=2, and=1, Ayse=1
         */

        String str="Ali came to school and Ayse came to school";

        Map<String,Integer> myMap=new HashMap<>();

        for (String i:str.split(" ")){
            if (!myMap.containsKey(i)){

                myMap.put(i,1);
            }else {
                myMap.replace(i,myMap.get(i)+1);
            }

        }

        System.out.println(myMap);
        //{school=2, Ayse=1, and=1, came=2, to=2, Ali=1}


    }
}
/*
  int sayac=1;
        Map<String,Integer> strMap=new LinkedHashMap<>();
        String str1 ="Ali came to school and Ayse came to school";
        String[] strarr=str1.split(" ");
        for (int i = 0; i <strarr.length ; i++) {
            if (strMap.containsKey(strarr[i])) {
                continue;//sadece o donguyu bıtırır tum donguye karısmaz dongu devam eder break; yazılsa tum donguyu kapatıp sıstemı sonlandırır.
            }else {
                for (int j = i+1; j < strarr.length ; j++) {
                    if (strarr[j].equals(strarr[i])) {
                        sayac++;
                    }
                }
                strMap.put(strarr[i],sayac);
                sayac=1;
            }
        }
        System.out.println(strMap);
    }
 */
