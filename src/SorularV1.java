public class SorularV1 {
    /*
     static String kartNo = "1234567";
    static String sifre = "java123";
    static Scanner scan = new Scanner(System.in);
    static double bakiye = 50;
    static String islem1 = "BAKİYE SORGULAMA", islem2 = "PARA CEKME VE PARA YÜKLEME", islem3 = "PARA GONDERME", islem4 = "SİFRE DEGİŞTİRME", islem5 = "CIKIŞ";
    static List<String> islemler = new ArrayList<>();
    static int tutar = 0;
    static String iban = "TR";
    static String ibanShb = "JAVA HOSTUR";
    public static void main(String[] args) {
        GELISMISATM();
    }
    private static void GELISMISATM() {
        String kullanadi = "";
        String Sifre = "";
        do {
            System.out.println("lutfen kullanıcı adınızı giriniz");
            kullanadi = scan.nextLine();
            System.out.println("lutfen şifrenizi giriniz");
            Sifre = scan.nextLine();
            if (!(kullanadi.equals(kartNo) || Sifre.equals(sifre) || kullanadi.replace(" ", "").equals(kartNo))) {
                System.out.println("kullanıcı adı veya sıfre hatalı lutfen tekrar deneyin");
            }
        } while (!(kullanadi.equals(kartNo) && Sifre.equals(sifre) && kartNo.replace(" ", "").equals(kartNo)));
        System.out.println("=======ŞEYMUZ BANKA HOŞGELDİNİZ=========");
        islemlerlistesi();
    }
    private static void islemlerlistesi() {
        islemler.add(islem1);
        islemler.add(islem2);
        islemler.add(islem3);
        islemler.add(islem4);
        islemler.add(islem5);
        int count = 1;
        for (String s : islemler) {
            System.out.println(count + "." + s + "\n");
            count++;
        }
        islemSecme();
    }
    private static void islemSecme() {
        System.out.println("lutfen yapmak istediginiz işlemi seciniz");
        int islmNo = scan.nextInt();
        switch (islmNo) {
            case 1: {
                System.out.println("Hesabınız da " + bakiye + "Tl vardır");
                cikisveyaAnaMenuyeDonme();
            }
            case 2: {
                paracekmevegonderme();
            }
            case 3: {
                paragonder();
            }
            case 4: {
                sifredegistirme();
            }
            case 5: {
                cikis();
            }
        }
    }
    private static void cikis() {
        System.out.println("İYİ GUNLER TEKRARDAN BEKLERİZ");
        System.exit(0);
    }
    private static void sifredegistirme() {
        System.out.println("LUTFEN ESKI SIFRENIZI GIRINIZ");
        String Gsifre = "";
        Gsifre = scan.nextLine();
        do {
            Gsifre = scan.nextLine();
            if (!(Gsifre.equals(sifre))) {
                System.out.println("ESKI SIFRE HATALI" +
                        "\nTEKRARDAN GIRINIZ");
            }
        } while (!(Gsifre.equals(sifre)));
        do {
            System.out.println("LUTFEN YENI SIFRENIZI GIRINIZ");
            Gsifre = scan.nextLine();
            if (Gsifre.length() != 7) {
                System.out.println("LUTFEN 7 HANELİ BİR SİFRE GİRİN");
            } else {
                sifre = Gsifre;
                System.out.println("SİFRENİZ BASARI İLE KAYDEDİLMİŞTİR");
            }
            cikisveyaAnaMenuyeDonme();
        }while (Gsifre.length() != 7);
    }
    private static void paragonder() {
        System.out.println("LUTFEN PARA GONDERİLECEK İBANI GİRİNİZ(BASINDA TR OLACAK SEKİLDE,TR İLE İBAN ARASINDA BOSLUK KOYMAYINIZ)");
        do {
            iban = scan.nextLine();
            if (!(iban.replace("tr", "").equalsIgnoreCase(iban) && iban.length() == 26)) {
                System.out.println("IBAN TR ICERMEMELI VE 26 HANELİ OLMALI");
            }
        } while (!(iban.replace("tr", "").equalsIgnoreCase(iban) && iban.length() == 26));
        String adSoyad = "";
        do {
            System.out.println("LUTFEN İBAN SAHIBININ AD VE SOYADINI  GIRINIZ");
            adSoyad = scan.nextLine();
            if (!(adSoyad.equalsIgnoreCase(ibanShb))) {
                System.out.println("HATALI İSİM GİRİŞİ");
            }
        } while (!(adSoyad.equalsIgnoreCase(ibanShb)));
        do {
            System.out.println("Gondermek istedıgınız tutarı gırınız");
            tutar = scan.nextInt();
            if (bakiye < tutar) {
                System.out.println("YETERSIZ BAKIYE");
            }
        } while (!(bakiye > tutar));
        bakiye -= tutar;
        System.out.println("İSLEM BASARILI" +
                "\nBAKIYE  : " + bakiye);
        cikisveyaAnaMenuyeDonme();
    }
    private static void paracekmevegonderme() {
        System.out.println("1.PARA CEKME" +
                "\n2.PARA YATIRMA");
        int no = 0;
        System.out.println("lütfen yapacagınız işlemi giriniz");
        no = scan.nextInt();
        switch (no) {
            case 1: {
                do {
                    System.out.println("cekmek istedıgınız tutarı gırınız");
                    tutar = scan.nextInt();
                    if (bakiye < tutar) {
                        System.out.println("YETERSIZ BAKIYE");
                    }
                } while (!(bakiye > tutar));
                bakiye -= tutar;
                System.out.println("İSLEM BASARILI" +
                        "\nBAKIYE  : " + bakiye);
                cikisveyaAnaMenuyeDonme();
            }
            case 2: {
                do {
                    System.out.println("LÜTFEN YATIRMAK ISTEDIGINIZ TUTARI GIRINIZ");
                    tutar = scan.nextInt();
                    if (tutar < 0) System.out.println("LUTFEN SIFIRDAN BUYUK BIR TUTAR GIRINIZ");
                } while (!(tutar > 0));
                bakiye += tutar;
                System.out.println("İSLEM BASARILI" +
                        "\nBAKIYE  : " + bakiye);
                cikisveyaAnaMenuyeDonme();
            }
        }
    }
    private static void cikisveyaAnaMenuyeDonme() {
        String no1 = "";
        String no = scan.nextLine();
        System.out.println("Ana menuye donmek ıcın 0 a cıkış yapmak ıcın q ya basınız");
        no = scan.nextLine();
        no1 = no;
        switch (no1) {
            case "0": {
                int count = 1;
                for (String s : islemler) {
                    System.out.println(count + "." + s + "\n");
                    count++;
                }
                islemSecme();
            }
            case "q":
            case "Q": {
                System.out.println("*****IYI GUNLER DILERIZ*****");
                System.exit(0);
            }
        }
  === === === === === === === ===
     */

    String str;
    /*
    1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
 Örn:
Hangi Kahveyi İstersiniz?
1.Türk kahvesi
2.Filtre Kahve
3.Espresso

      String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
       (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
                                                                                   todo 1. Koşul bölümü
      Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.(Dümdüz Türk kahvesi yazmayın. String hangiKahve'yi çağırın!!)
      Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)
      Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
      Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın. (Hatalı tuslamadan sonra kod calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
                                                                                   todo ----------------------------------

      Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.

     String sut olusturun.
                                                                         todo 2.Koşul Bölümü
     eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.         -- (Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.

    eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
                                                                                  todo ----------------------------------



      Sistem bize "�?eker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun. (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
      String seker oluşturunuz.
                                                              todo 3.Koşul Bölümü
      todo if(){
      Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı. Sorunun altına int kacSeker  oluşturunuz.
      �?eker sayısını giriniz.
      Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
      todo }
      todo else{
  Eğer String şeker  hayır 'a eşitse, sistem bize "�?eker eklenmiyor" cevabını versin.


          ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine koymamız gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.

Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun. (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
String boyut oluşturun...

                                                 todo 4.Koşul Bölümü
      eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor. (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")

      Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)

      Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)




                  //todo  SONUÇ BÖLÜMÜ

                  Siparişlerimizi verdik. Son hali görmek istiyoruz.
                  konsola şunu yazdırın örnek :

      Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.     orta boy için de String boyut ' u kullanın.)
     */

    String str2;
    /*
     * Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1.Adım- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2.Adım- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * 2. oyuncu Eger kelimeyi kabul ederse  1.oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve hangi  oyuncunun
     *        kazandigini yazip oyunu bitirin.
     *
     * 3.Adım- 2. oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */

    String str3;
    /*
     Problem Tanımı :
    parametre olarak Integer Arraylist alan ve return type int olan hillNum isminde br method yazınız
    method ; kendinden önceki sayıdan küçük kendinden sonrakinden büyük olan sayıyı yazdırsın
    Test data:
    input : ArrayList 5,4,6,2,1
    output : 2
    2; 6 dan küçük 1 den büyük
     */

    String str4;
    /*
    Sayı tahmin etme oyunu....
Bilgisayardan rastgele(random class kullanılarak) 0-100 arasında bir sayı alıp kullanıcının
tahminini her defasından büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
     */

    String str5;
    /*
    A şehrinden uçmak isteyen bir kişi B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat %50 indirim 12 ve 24
yas arasindaysa 10% 65 yasindan buyukse 30% gidis donus alirsa20% bu
kosullara gore yolcudan gideceği mesafeyi isteyip ucak biletini hesaplayan program
     */

    String str6;
    /*
    * bir sifre olusturunuz ozellikleri sirasi ile soyle olmalidir;
 1_uzunlugu => en az 10 karakter(chars) olmalidir
 2_en az 1 sembol bulundurmali
 3_en az 1 numara bulundurmali
 4_en az buyuk harf olmalidir
 5_en az bir kucuk harf olmalidir
     */

    String  str7;
    /*

     */
}
