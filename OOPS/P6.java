package OOPS;

public class P6 {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("WORLD");
        String s5 = "hello";

        System.out.println("--- A. Comparison using '==' Operator ---");

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        
        System.out.println("\n--- B. Comparison using equals() Method ---");

        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1.equals(s5): " + s1.equals(s5));
        System.out.println("s1.equalsIgnoreCase(s5): " + s1.equalsIgnoreCase(s5));

        System.out.println("\n--- C. Comparison using compareTo() Method ---");

        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2)); 

        System.out.println("s1.compareTo(s5): " + s1.compareTo(s5));

        System.out.println("s1.compareTo(s4): " + s1.compareTo(s4));
        
        System.out.println("s1.compareToIgnoreCase(s5): " + s1.compareToIgnoreCase(s5));
    }
}

