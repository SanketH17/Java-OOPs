package M07_Abstraction;
// Example of Abstract class

abstract class Shape {
    abstract void draw();
}


class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing Rectangle");
    }
}


class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}



public class Main3 {
	public static void main(String[] args) {
	    
	    Shape s = new Rectangle();
	    Shape s1 = new Circle();
	    s1.draw();
	    s.draw();

	}
}
