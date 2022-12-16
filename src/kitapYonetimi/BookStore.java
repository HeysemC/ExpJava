package kitapYonetimi;


import java.util.ArrayList;
import java.util.List;

public class BookStore {
    /*
    1.	Kullanıcının Kitap ekleme, silme ve listeleme gibi
		işlemleri yapmasına imkan tanıyan bir uygulama yazınız.
     */

   static List<Book> bookList=new ArrayList<>();

    public static void main(String[] args) {

        BookMain.kitapciKitaplari(bookList);

        BookMain.kitapEkle(bookList);

        Book sBook = new Book();

        sBook.setBookName("Ahmet Hoca ile JAVA");
        sBook.setAuthorName("Ahmet BULUTLUOZ");
        sBook.setPublicationYear(2022);
        sBook.setPrice(2000);
        sBook.setRefNo(++sBook.refNo);

        bookList.add(sBook);
        BookMain.menu(bookList);
    }





}
