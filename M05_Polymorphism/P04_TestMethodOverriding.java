package M05_Polymorphism;

/*
In this example, we have defined the run method in the subclass as defined in the parent class but it has some specific implementation.

The name and parameter of the method are the same, and there is IS-A relationship between the classes, so there is method overriding.
*/


class Vehicle {
    //defining a method
    void run() {
        System.out.println("Vehicle is running");
    }
}

// creating a child class
class Bike2 extends Vehicle {
    //defining the same method as in the parent class
    void run() {
        System.out.println("Bike is running safely...");
    }
}




public class P04_TestMethodOverriding {
    public static void main(String[] args) {
        Bike2 b = new Bike2();
        b.run();
    }
}
