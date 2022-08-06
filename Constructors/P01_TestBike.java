package OOPs.Constructors;

/* 
Example of default constructor
In this example, we are creating the no-arg constructor in the Bike class. It will be invoked at the time of object creation.
*/
class Bike1 {

    Bike1() {
        System.out.println("Bike is created");
    }

}
public class P01_TestBike {
    public static void main(String[] args) {
        Bike1 b = new Bike1();
    }
}
