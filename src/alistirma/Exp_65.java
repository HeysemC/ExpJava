package alistirma;
import java.util.HashMap;
import java.util.Map;

public class Exp_65 {
    public static void main(String[] args) {
        /*
        MAP Soru -1 - Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
        bulunmaktadır. Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu
         */
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        String istenenKelime="Laptop";
        for (Map.Entry<String,Integer> each: product.entrySet()
        ) {
            if (each.getKey().equals(istenenKelime)) {
                System.out.println("Mapta "+istenenKelime+" bulunuyor");

            }
        }
    }
}
