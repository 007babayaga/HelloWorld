public class Animal {
    String animalName;
    String color;

    public Animal() {

    }

    public Animal(String animalName, String color) {
        this.animalName = animalName;
        this.color = color;
    }

    public void isWalking() {
        System.out.println(animalName + " Dog is now walking");
    }

    public static Animal getanimal(String name) {
        return switch (name.toUpperCase().charAt(0)){
            case 'D'-> new Dog();
            case 'B'-> new Bird();
            case 'F'-> new Fish();
            default -> new Animal();
        };
    }
    public void ff(){
        System.out.println("alll");
    }

}

class Dog extends Animal{
    boolean isBarking;
    public Dog(){

    }

    public Dog(String animalName, String color, boolean isBarking) {
        super(animalName, color);
        this.isBarking = isBarking;
    }
    public  void isagg(){
        System.out.println("Every Dog is a good boy");
    }
}
class Bird extends Animal{
    public Bird(){


    }
    int flyingspeed;

    public Bird(String animalName, String color, int flyingspeed) {
        super(animalName, color);
        this.flyingspeed = flyingspeed;
    }

    @Override
    public void isWalking() {
        System.out.println("birds cannot walk");
    }

}
class Fish extends Animal {
    public Fish(){

    }
    public Fish(String animalName, String color) {
        super(animalName, color);
    }

    @Override
    public void isWalking() {
        super.isWalking();
        System.out.println("Fish cannot walk");
    }
}