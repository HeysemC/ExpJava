package manav_soru;

import java.util.*;

public class Customer {

    /*
     * Basit bir manav alisveris programi yaziniz.
     *
     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
     *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
     *
     */

    public static List<Product> product_mapping() {

        List<Product> products_list=new ArrayList<>();

        products_list.add(new Product("patates",10));

        products_list.add(new Product("domates",12));

        products_list.add(new Product("sogan",13));

        products_list.add(new Product("ejder meyvesi",30));

        return products_list;

    }
    public static void main(String[] args) {

        product_mapping();

        boolean value=true;

        double total=0;

        while (value)
        {
            System.out.println("ne satın almak istersin : ");

            Scanner scan=new Scanner(System.in);

            String selection=scan.nextLine();

            System.out.println("Kac kilo "+selection+" almak istersiniz");

            double kilo=scan.nextDouble();

            double sum=the_total_cost(selection,kilo);

            System.out.println("Alisverise devam etmek istiyormusunuz? Evet / Hayir");

            String cevap=scan.next();

            if (cevap.equals("Hayir")) {

                total+=sum;

                value=false;
            }
            else if (cevap.equals("Evet"))

                total+=sum;

            else

                System.out.println("Affedersiniz! hatali giris");

        }

        System.out.println("Toplam fiyat: "+total);
    }

    private static double the_total_cost(String selection, double kilo) {

        List<Product>products_list=product_mapping();

        double sum=0;


        switch (selection)
        {
            case "patates":

                sum+=kilo*products_list.get(0).getFiyat();

                break;


            case "domates":

                sum+=kilo*products_list.get(1).getFiyat();

                break;

            case "sogan":

                sum+=kilo*products_list.get(2).getFiyat();

                break;

            case "ejder meyvesi":

                sum+=kilo*products_list.get(3).getFiyat();

                break;

            default:

                System.out.println("uzgunum hatali giris");
        }

        return sum;
    }


}
