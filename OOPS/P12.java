package OOPS;
import java.util.LinkedList;
public class P12 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Original List: " + colors);
        String newColor = "Yellow";
        colors.add(newColor);      
        System.out.println("Element to append: " + newColor);
        System.out.println("List after appending: " + colors);
    }
}

