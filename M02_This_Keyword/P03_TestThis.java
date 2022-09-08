package M02_This_Keyword;

/*

3) this() : to invoke current class constructor

The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. 
In other words, it is used for constructor chaining.

*/


class A3 {

    A3() {
        
        System.out.println("Hello a");
    }

    // one more parameterized constructor 
    A3(int x) {
        this();
        System.out.println("hello A " + x);
    }

    // A(int x, int y) {
    //     this(x);
    //     System.out.println("hello A - " + x + " " + y);
    // }
}


public class P03_TestThis {
    public static void main(String[] args) {
        A3 a=new A3(10); 
        
    }
}
