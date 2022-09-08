package M06_Super_Keyword;


class Animal10 {
    void eat() {
        System.out.println("eating...");
    }
    void live() {
        System.out.println("Live in house...");
    }
}


class Dog extends Animal10 {
    void eat() {
        System.out.println("eating bread....");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        super.eat();
        super.live();
        bark();
    }
}



public class P02_TestSuper {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
    }
}







