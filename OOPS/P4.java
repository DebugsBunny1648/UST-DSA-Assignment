package OOPS;

public class P4 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original Array Elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\n");

        System.out.println("Array Elements in Reverse Order:");
        
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

