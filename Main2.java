// runtime polymorphism 


class Bike {
    void run() {
        System.out.println("running");
    }
}

class Splendor extends Bike {
    void run() {
        System.out.println("running safely with 60km");
    }
}

public class Main2
{
	public static void main(String[] args) {
		Bike b = new Splendor();
		b.run();
	}
}










