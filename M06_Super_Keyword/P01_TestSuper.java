package OOPs.M06_Super_Keyword;

/*
1) super is used to refer immediate parent class instance variable.
We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.

*/

class Animal {
    String color = "White";
}

class Dog extends Animal {
    String color = "black";

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class P01_TestSuper {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
