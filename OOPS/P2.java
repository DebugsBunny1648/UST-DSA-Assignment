package OOPS;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void displayType() {
        System.out.println("This is a geometric " + this.name + ".");
    }
}

class Circle extends Shape {
    private double radius;
    private final double PI = 3.14159;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class P2 {
    public static void main(String[] args) {
      
        Circle myCircle = new Circle(7.0);

    
        Rectangle myRectangle = new Rectangle(5.0, 8.0);


        // --- Circle Demonstration ---
        myCircle.displayType(); // Inherited non-abstract method
        double circleArea = myCircle.calculateArea(); // 
        System.out.println("Circle (Radius: 7.0) Area: " + String.format("%.2f", circleArea));
      

        myRectangle.displayType(); // Inherited non-abstract method
        double rectangleArea = myRectangle.calculateArea(); // Implemented abstract method
        System.out.println("Rectangle (5.0 x 8.0) Area: " + String.format("%.2f", rectangleArea));
    }
}

