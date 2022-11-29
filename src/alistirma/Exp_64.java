package alistirma;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exp_64 {


    public static void main(String[] args) {


    /*  MAP Soru -1 - Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
       bulunmaktadır. Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu
       yazınız.*/

    Map<String, Integer> product = new HashMap<>();

        product.put("Laptop", 12);

        product.put("TV", 53);

        product.put("Refrigerator", 12);

        product.put("Music System", 87);






        Map<String,Integer> treeMap=new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        treeMap.putAll(product);

        System.out.println(product.containsKey("Laptop"));





}
}
