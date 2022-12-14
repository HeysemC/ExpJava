package kitapYonetimi;

public class Book {

    /*
    2.	Program, kitaplara 1001’den başlayarak sıralı ve otomatik numara vermeli.
		Bunun yanında, her bir kitap için Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilgiler girilebilmelidir.
     */
    public String bookName,authorName;
    public int publicationYear,price,refNo;

    public Book(){}

    public Book(String bookName, String authorName, int publicationYear, int price, int refNo) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        this.price = price;
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                ", refNo=" + refNo +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRefNo() {
        return refNo;
    }

    public void setRefNo(int refNo) {
        this.refNo = refNo;
    }
}
