package M05_Polymorphism;

/*
Let's understand the problem that we may face in the program if we don't use method overriding.

*/

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {

}


public class P03_TestMethodOverriding {
    public static void main(String[] args) {
        // creating an instance of a child class
        Bike obj = new Bike();
        obj.run();
    }
}


/*
Problem is that I have to provide a specific implementation of run() method in subclass that is why we use method overriding.

*/