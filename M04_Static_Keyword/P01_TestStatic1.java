

/*
If you declare any variable as static, it is known as a static variable.

The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
The static variable gets memory only once in the class area at the time of class loading.

Java static property is shared to all objects.

*/

class Student {
    int rollno;
    String name;
    static String college = "ITS";

    //constructor
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // method to display the values 
    void display() {
        System.out.println(rollno + " " + name  + " " + college);
    }
}

public class P01_TestStatic1 {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan");

        s1.display();
        s2.display();
    }
}
