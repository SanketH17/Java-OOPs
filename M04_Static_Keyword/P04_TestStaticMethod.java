



/*
Java static method
If you apply static keyword with any method, it is known as static method.

A static method belongs to the class rather than the object of a class.
A static method can be invoked without the need for creating an instance of a class.
A static method can access static data member and can change the value of it.


*/

class Student {
    int rollno;
    String name;
    static String college = "ITS";

    //static method to change the value of the static variable 
    static void change() {
        college = "BBDIT"; //A static method can access static data member and can change the value of it.
    }

    // constructor to initialize the variable
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    // method to display values 
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

public class P04_TestStaticMethod {
    public static void main(String[] args) {

        // calling change method
        Student.change();
        
        // creating objects
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan");
        Student s3 = new Student(333, "Sonoo");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
