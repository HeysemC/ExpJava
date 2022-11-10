package alistirma;

public class Exp_53 {
    String isim="John Doe";
    int yas=40;

    public Exp_53(){
        isim="Seher";
        yas=38;
    }
    public Exp_53(String isim,int yas){
        this.isim=isim;
        this.yas=30;
    }

    public static void main(String[] args) {
        Exp_53 obj1=new Exp_53();
        Exp_53 obj2=new Exp_53("Fatih",35);
        System.out.println("isim : "+obj1.isim+""+"yas : "+obj2.yas);
    }
}
