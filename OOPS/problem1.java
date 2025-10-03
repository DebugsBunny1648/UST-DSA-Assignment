package OOPS;
abstract class Shape{
    protected String name;

    public Shape(String name){
        this.name=name;
}

    public abstract double calculateArea();
    public void displayType(){
        System.out.println("This is a geometric "+this.name);
    }
}

class Circle extends Shape{
    double radius;
    final double PI=3.14;

    Circle(double radius){
        super("Circle");
        this.radius=radius;
    }
    @Override
    public double calculateArea(){
        return PI*radius*radius;
    }
}
public class problem1 {
    public static void main(String[] args) {
        Circle c1=new Circle(10.0);
        c1.displayType();
        double area=c1.calculateArea();
        System.out.println("Area is : "+area);
    }
}
