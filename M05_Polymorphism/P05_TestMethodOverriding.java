package OOPs.M05_Polymorphism;


//creating a parent class
class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

// creating child classes
class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}


class AXIS extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}


 // Test class to create objects and call methods
public class P05_TestMethodOverriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        System.out.println("SBI rate of interset : " + s.getRateOfInterest());
        System.out.println("ICICI rate of interset : " + i.getRateOfInterest());
        System.out.println("AXIS rate of interset : " + a.getRateOfInterest());
    }
}
