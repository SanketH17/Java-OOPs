package M02_This_Keyword;

class A4 {
    
    A4() {
        this(55);
        System.out.println("Hello a");
    }

    A4(int x) {
        System.out.println(x);
    }

}


public class P04_TestThis {
    public static void main(String[] args) {
        A4 a = new A4();
    }
}
