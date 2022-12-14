package kitapYonetimi;

import java.util.List;
import java.util.Scanner;

public class BookMain {
    /*
    3.	Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır.
		Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir.

		========= KİTAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: Tüm kitapları listele
			4: Bitir
     */
    static int refNo1=1000;

    static Scanner scan=new Scanner(System.in);


    public static void menu (List<Book> bookList){





        System.out.println("========= KİTAP PROGRAMI ============="+
                        "\n1: Kitap ekle" +
                        "\n2: Numara ile kitap sil" +
                        "\n3: Tüm kitapları listele" +
                        "\n4: Bitir"
                );

        System.out.println();

        System.out.println("Yapmak istediginiz islemi seciniz");

        int secim=scan.nextInt();

        switch (secim){

            case 1:
                kitapEkle(bookList);
                break;

            case 2:
                numara_ile_kitap_sil(bookList);
                break;

            case 3:
                tum_kitaplari_listele(bookList);
                break;

            case 4:
                bitir();
                break;
            default:
                System.out.println("hatali giris");
                break;



        }


    }

    private static void bitir() {
        System.out.println("bizi tercih ettiginiz icin danke");
    }

    private static void tum_kitaplari_listele(List<Book> bookList) {
    }

    private static void numara_ile_kitap_sil(List<Book> bookList) {
    }

    private static void kitapEkle(List<Book> bookList) {


        System.out.println("kitap ismi giriniz");
        String bookName= scan.nextLine();

        System.out.println("yazar adi giriniz :");
        String authorName=scan.nextLine();

        System.out.println("yayin yili giriniz :");
        int publicationYear= scan.nextInt();

        System.out.println("fiyat giriniz :");
        int price= scan.nextInt();

        Book book=new Book(bookName,authorName,publicationYear,price,++refNo1);
        bookList.add(book);

        System.out.println("kitap ekleme islemi basarili");

        menu(bookList);

    }
    private static void kitapciKitaplari(List<Book> bookList){
        Book book1=new Book("book1","yazar1",1901,101,++refNo1);
        Book book2=new Book("book2","yazar2",1902,102,++refNo1);
        Book book3=new Book("book3","yazar3",1903,103,++refNo1);
        Book book4=new Book("book4","yazar4",1904,104,++refNo1);
        Book book5=new Book("book5","yazar5",1905,105,++refNo1);
        Book book6=new Book("book6","yazar6",1906,106,++refNo1);
        Book book7=new Book();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
    }

}
