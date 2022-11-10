package alistirma;

public class Exp_52 {
    String isim="john doe";
    int yas=40;
    public Exp_52(String isim,int yas){
        this.isim=isim;
        this.yas=30;
    }

    public static void main(String[] args) {
        Exp_52 obj=new Exp_52("fatih",35);
        System.out.println("isim : "+obj.isim+"\tyas : "+obj.yas);

    }
}
