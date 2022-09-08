package M02_This_Keyword;

/*
1) this: to refer current class instance variable
The this keyword can be used to refer current class instance variable. If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.

*/

class Student {
    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}



public class P01_TestThis {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Pritam", 55000f);
        Student s2 = new Student(112, "Sumit", 6000f);
        s1.display();;
        s2.display();
    }
}


/*
Note : If local variables(formal arguments) and instance variables are different, there is no need to use this keyword like in the following program:

*/
