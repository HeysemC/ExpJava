package alistirma;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exp_68 {
    public static void main(String[] args) {
        /*
        SET Sorusu 2 : Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
           Örnek: ‘Mississippi’ ´ Misp
         */
        String str = "Mississippi";
        String YeniStr="";
        Set<Character> strSeti = new LinkedHashSet<>();// Misp  eklenen her elemanı sona ekler
        //Set<Character> strSeti=new TreeSet<>();//[M, i, p, s]//Dogal Sıralamaya gore ekleme yapar
        //Set<Character> strSeti=new HashSet<>();//[p, s, i, M]//en son eklenenı en basa yazdıgı ıcın
        for (int i = 0; i < str.length(); i++) {
            strSeti.add(str.charAt(i));
        }
        Iterator iterator=strSeti.iterator();
        while (iterator.hasNext()){
            YeniStr+=iterator.next();
        }
        System.out.println(YeniStr);
    }
}
