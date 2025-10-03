package OOPS;

public class P9 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 65};
        
        int sum = 0;
        
        for (int number : numbers) {
            sum += number;
        }
        
        double average = (double) sum / numbers.length;
        
        System.out.println("The array elements are: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("The sum of the array elements is: " + sum);
        System.out.println("The average value is: " + average);
    }
}

