package M03_Inheritance;

class Employee {
    float salary = 40000f;
}

class Programmer extends Employee {
    int bonus = 10000;
}

public class P01_TestInheritance {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer's salary is : " + p.salary);
        System.out.println("Programmer's bonus is : " + p.bonus);
    }
}





