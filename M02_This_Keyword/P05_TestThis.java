package OOPs.M02_This_Keyword;

/*
Real usage of this() constructor call
The this() constructor call should be used to reuse the constructor from the constructor. It maintains the chain between the constructors 
i.e. it is used for constructor chaining.

 */

class Student5 {
    int rollno;
    String name, course;
    float fee;

    Student5(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course =course;
    }

    Student5(int rollno, String name, String course, float fee) {
        this(rollno, name, course); // reusing the constructor
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }
}


public class P05_TestThis {
    public static void main(String[] args) {
        Student5 s1 = new Student5(111, "Ankit", "Java");
        Student5 s2 = new Student5(112, "Sumit", "Java", 6000f);
        s1.display();
        s2.display();
    }
}
