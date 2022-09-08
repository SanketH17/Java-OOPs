package M06_Super_Keyword;

class Player {

    //creating constructor
    Player() {
        System.out.println("Player is playing");
    }

}


// creating child class 
class Virat extends Player {
    Virat() {
        super(); // super keyword to invoke the parent class constructor
        System.err.println("Virat is playing");
    }
}

public class P03_TestSuper {
    public static void main(String[] args) {
        //Virat v = new Virat();
    }
}
