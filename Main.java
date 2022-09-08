
class Animal {
    // constructor of Animal
    Animal() {
        System.out.println("animal is created");
    }
}

class Dog extends Animal {
    // constructor of Dog
    Dog() {
        super();
        System.out.println("dog is created\n");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Start\n");

        Dog d = new Dog();
        
        System.out.println("End");

    }
}
