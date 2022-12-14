package autoGallery;

public class Car {

     protected String make;

     protected String model;

     protected int year;



     Car(){}

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String getMake() {
        return make;
    }

    public String getModel(){
         return model;
    }

    public int getYear() {
        return year;
    }


}
