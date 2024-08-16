public class Car {
    static int noofcars = 0;
    String color;
    String brand;
    int wheels;
    boolean isFast;

    public Car(){
        noofcars++;
    }

    public Car(String color, String brand, int wheels, boolean isFast) {
        this.color = color;
        this.brand = brand;
        this.wheels = wheels;
        this.isFast = isFast;


    }
    public void isSold(){
        System.out.println(brand+" Just sold !");
    }
    public void iisSold(){
        System.out.println(" Just sold !");
    }
}
