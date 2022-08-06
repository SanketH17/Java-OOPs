package OOPs.Constructors;

/*
Q) What is the purpose of a default constructor?
The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.

Example of default constructor that displays the default values
*/

class Student3 {
    int id;
    String name;
    
    //  method to display the value of id and name
    void display() {
        System.out.println(id + " " + name);
    }
}


public class TestStudent {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();
        s1.display();
        s2.display();
    }
}
