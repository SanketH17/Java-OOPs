package OOPs.Constructors;

/* 

Java Parameterized Constructor
A constructor which has a specific number of parameters is called a parameterized constructor.

Why use the parameterized constructor?
The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.

Example of parameterized constructor
In this example, we have created the constructor of Student class that have two parameters. We can have any number of parameters in the constructor.

*/

class Student4 {
    int id;
    String name;

    Student4() {
        System.out.println("This is default constructor");
    }
    
    Student4(int i, String n) {
        id = i;
        name = n;
    }

    //method to display the values
    void display() {
        System.out.println(id + " " + name);
    }
}


public class P03_TestStudent4 {
    public static void main(String[] args) {
        //Student4 s1 = new Student4();
        Student4 s2 = new Student4(101, "Sanket");
        s2.display();
    }
}
