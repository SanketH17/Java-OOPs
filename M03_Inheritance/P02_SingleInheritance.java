package M03_Inheritance;

/*
Single Inheritance Example
When a class inherits another class, it is known as a single inheritance. In the example given below, Dog class inherits the Animal class, so there is the single inheritance.

*/

class Animal {
    
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

public class P02_SingleInheritance {
    public static void main(String[] args) {
        System.out.println("for dog class - ");
        Dog d = new Dog();
        d.bark();
        d.eat();
        System.out.println("for animal class - ");
        Animal a = new Animal();
        a.eat();
    }    
}
