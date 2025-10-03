package practiceYt.DSA_Module_2;
import java.util.*;
public class Rectangle {
    int len;
    int breadth;
    Rectangle(){
        this.len=10;
        this.breadth=10;
}
    Rectangle(int len,int breadth){
        this.len=len;
        this.breadth=breadth;
    }
    void area(){
        int area=len*breadth;
        System.out.println("Area of the rectangle: "+area);
    }
   public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        System.out.println("Default Constructor ");
        r1.area();
        Rectangle r2=new Rectangle(15,20);
        System.out.println("Parameterized Constructor ");
        r2.area();
   }
}