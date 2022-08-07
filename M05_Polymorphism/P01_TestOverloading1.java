package OOPs.M05_Polymorphism;

/*
1) Method Overloading: changing no. of arguments
In this example, we have created two methods, first add() method performs addition of two numbers and second add method performs addition of three numbers.

In this example, we are creating static methods so that we don't need to create instance for calling methods.
 
*/

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}


public class P01_TestOverloading1 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11, 11));
        System.out.println(Adder.add(10, 20));
    }
}
