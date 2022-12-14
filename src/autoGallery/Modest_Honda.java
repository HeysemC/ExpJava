package autoGallery;

public class Modest_Honda extends Car implements InteriorParts,ExteriorParts{

    protected String make;
    protected String model;
    protected int year;


    public void setPrice(double price) {
        Price = price;
    }

    protected double Price=InteriorParts.priceIc+ExteriorParts.priceDis;

    public Modest_Honda(){}

    public double getPrice() {

        return getPrice();
    }

    @Override
    public String toString() {
        return "Modest_Honda{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public Modest_Honda(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String getMake() {
        return super.getMake();
    }



    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getYear() {
        return super.getYear();
    }


    @Override
    public void klima() {
        System.out.println("cift bolge klima");

    }

    @Override
    public void wheel() {
        System.out.println("22' krom hafifletilmis jantli lastik");

    }

    @Override
    public void bodyKit() {
        System.out.println("super tasarim bodykit");


    }

    @Override
    public void far() {
        System.out.println("led far");

    }
}
