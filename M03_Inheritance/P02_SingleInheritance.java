package OOPs.M03_Inheritance;

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
