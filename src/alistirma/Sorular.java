package alistirma;

import java.util.Arrays;

public class Sorular {
    public static void main(String[] args) {
        /*
        Java practise siteleri / soru cozumu
https://www.w3resource.com/java-exercises/
https://practiceit.cs.washington.edu/
https://www.techiedelight.com/list-of-problems/
https://www.java67.com/2013/01/10-programming-questions-and-exercises.html
https://codingbat.com/java
https://code-exercises.com/
https://www.codesdope.com/practice/practice_java/
https://www.freecodecamp.org/learn/
https://java.meritcampus.com/java-quiz
https://edabit.com/challenges/java
http://www.beginwithjava.com/java/
         */

       // 163.sayfaya kadar olan sorular


/* SORULAR;
==> (Variables ve Scanner):
Soru 1- Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla
yazdirin.+

Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
yazdirin.+

Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
Isminiz : John
Soyisminiz : Doe
Yasiniz : 44
Kaydiniz basariyla tamamlanmistir.+

Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
yazdirin.+

Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
girilen bilgiler : J Doe, 44+

Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.+

Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).+

Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
degerlerini degistirin(swap).+

==> (Data Casting):
Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
yazin+

Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.+

Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
ile 127 arasindaki bir sayiya donusturup yazdirin.+

Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
isleminin sonucununun tamsayi kismini yazdirin.+

Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
ve bolum isleminin sonucununun tamsayi kismini yazdirin.+

==>(Modulus Soru):
Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim
^^ Ipucu 1: Sayi % 10 => Bize son basamagi verir
1469 % 10 = 9
Ipucu 2: Int Sayi /10 => Bize son basamak haric sayiyi verir
int sayi=1469;
sayi = sayi / 10 =>
sayi’ya 46 degerini atar^^+

==>(If Statements):
Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
“Sayi 5’in tam kati” yazdirin.+

Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
Kullanici o veya O yazdiginda output Ocak olsun.+

Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
“Eskenar ucgen” yazdirin.

Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
kucukse “Maalesef kaldin” yazdirin.

Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

Soru 2- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
kucukse “Maalesef kaldin” yazdirin.

Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
olup olmadigini yazdirin.

Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
olarak yazdirin, yoksa girilen harfi yazdirin

Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
zayif yazdirin.

Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
alirsa %15, yoksa %10 indirim yapin

Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
“istediginiz birim sisteme kayitli degil” yazdirin.

==>(Nested If Statements):
Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
alirsa %15, yoksa %10 indirim yapin

Soru 3- Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
yazdirin.

Soru 4- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
zamani” yazdirin.

==>(Ternary Operator):
Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
“Sayi 5’in tam kati” yazdirin.

Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
harf olarak yazdirin, yoksa girilen harfi yazdirin

Soru 4- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
kucukse “Maalesef kaldin” yazdirin.

Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

==>(Switch Statements):
Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

Soru 2- Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

Soru 3- Kullanicidan ay numarasini alip ay ismini yazdirin

Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
ve girilen harfin karsiligini yazdirin.
I : International S : Software T : Testing Q : Qualifications B: Board

Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.

==>(String Manipulations):
Soru 1 : Kullanicidan bir cumle alin
- cumlede ev geciyorsa, "home home sweet home" yazdirin
- cumlede is geciyorsa, "calismak guzeldir"
- ikisini de iceriyorsa "Hem ev lazim hem is"
- hicbirini icermiyorsa "cok calisman lazim" yazdirin

Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
input1 : “15.30 €” , input2 : “11.40 €”
output : 36.70 €

Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
input : java1 ogRe2@nMek3 #ne +Gu=zel
output : Java ogrenmek ne guzel.

Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
basariyla kaydedildi" yazdirin
- ilk harf kucuk harf olmali
- son karakter rakam olmali
- sifre bosluk icermemeli
- uzunlugu en az 10 karakter olmali

Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
yazdirin
- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
harflerle yazdirin.

Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
yazdirin.

==>(For Loops):
Soru 1- 1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak
yazdirin.

Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
dahil) 7 ila bolunebilen sayilari yazdirin.

Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucuk olsa da program calissin

Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
hesaplayin.

Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
tamsayilari yazdirin, sira
- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
yazdirin

Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
kaydedin.

Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
kontrol edin ve sonucu yazdirin.

==>(Method Olusturma ve Kullanma):
Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
bir method olusturun.
- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
mesaji verin
- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
yazdirin.

Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
isim bosluk soyisim seklinde bize donduren bir method olusturun
input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz

Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
sonuclarini donduren bir method olusturun.

Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
bolenleri sayisini bulup bize donduren bir method olusturun.

==>(While Loop):
Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
yazdirin.

Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
donduren bir method olusturun.

Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
istediginde 0'a basmasini soyleyin
Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
bunlarin toplaminin kac oldugunu yazdirin
Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
negatif sayiyi sayi adedine ve toplama eklemeyin

Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
olusturun.

==>(Do While Loop):
Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.

Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
kontrol edin ve sifredeki hatalari yazdirin.
Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
- Sifre kucuk harf icermelidir
- Sifre buyuk harf icermelidir
- Sifre ozel karakter icermelidir
- Sifre en az 8 karakter olmalidir.

Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
bulunuz, tamkare ise true değilse false yazdırınız.
Ornek : input : 16, output: 4

163.sayfaya kadar olan sorular


 */

    }
}
