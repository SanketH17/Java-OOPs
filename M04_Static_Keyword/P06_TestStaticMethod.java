
class Student {

    int rollno;
    String name;
    static String college = "ITS";

    // static method to change the value of static variable
    static void change() {
        college = "BBIT";
    }

    // constructor to initialize the variable
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // method to display the values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

}

public class P06_TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); // A static method can be invoked without the need for creating an instance of a class.

        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan");
        Student s3 = new Student(333, "Sonoo");

        // calling display method
        s1.display();
        s2.display();
        s3.display();

    }
}