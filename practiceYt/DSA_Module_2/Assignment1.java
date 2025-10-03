package practiceYt.DSA_Module_2;
import java.util.*;
public class Assignment1 {
   class Rectangle{
    int len;
    int breadth;
    Rectangle(int len,int breadth){
        this.len=len;
        this.breadth=breadth;
    }

    void area(){
        int area=len*breadth;
        System.out.println("Area of the rectangle: "+area);
    }
   }


   public static void main(String[] args) {
        Rectangle s1=new Rectangle(10,10);
        s1.Assignment1.area();

   }
}
