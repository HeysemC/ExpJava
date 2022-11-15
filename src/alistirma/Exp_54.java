package alistirma;

public class Exp_54 {
   static int sayi=20;
    int yas=40;
    static String okul="ITU";

    public Exp_54 (int a,int b,String c){
        this.sayi=a;
        this.yas=b;
        this.okul=c;
    }
    public static void method1(Exp_54 dnm){
        System.out.println("sayi : "+ dnm.sayi+
                        ", yas : "+dnm.yas+
                        ", okul : "+dnm.okul
                            );
    }

    public static void main(String[] args) {
        Exp_54 obj1=new Exp_54(20,30,"ODTU");
        Exp_54 obj2=new Exp_54(15,25,"Marmara");
        method1(obj1);
        method1(obj2);
    }

}
