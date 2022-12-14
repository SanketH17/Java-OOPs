package M07_Abstraction;


abstract class Bank {
    abstract int getRateOfInterest();
}


class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

/* 
17. Can we create an instance of an abstract class? 
No, instance of an abstract class can't be created.
*/

public class P02_TestAbstraction {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of Interest is : " + b.getRateOfInterest() + " %");

        b = new PNB();
        System.out.println("Rate of Interest is : " + b.getRateOfInterest() + " %");
    }
}
