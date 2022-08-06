package OOPs.M02_This_Keyword;

/*
2) this: to invoke current class method
You may invoke the method of the current class by using the this keyword. If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.

*/

class A {

    void m() {
        System.out.println("Hello m");
    }

    void n() {
        System.out.println("Hello n");
        this.m();
    }

}

public class P02_TestThis {
    public static void main(String[] args) {
        A a = new A();
        a.m();
        a.n();
    }
}
