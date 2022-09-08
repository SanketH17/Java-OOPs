package M07_Abstraction;


abstract class Bike {
    // Constructor for Bike class
    Bike() {
        System.out.println("Bike is created");
    }

    abstract void run(); // abstract method which does not have any implementaion

    void changeGear() {
        System.out.println("Gear changes");
    }
}


//Creating a Child class which inherits Abstract class  
class Honda extends Bike {
    void run() {
        System.out.println("runnig safely");
    }
}

//Creating a Test class which calls abstract and non-abstract methods 
public class P03_TestAbstraction {
    public static void main(String[] args) {
        Honda h = new Honda();
        h.run();
        b.changeGear();
    }
}
