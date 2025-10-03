package OOPS;

import java.util.Arrays;

public class P11 {
    public static class Swapper {
        public static <T> void doSwap(T[] arr) {
            if (arr == null || arr.length != 2) {
                System.out.println("Error: Array must contain exactly two elements for swap demonstration.");
                return;
            }
            System.out.println("Before Swap: Element 1: " + arr[0] + ", Element 2: " + arr[1]);
            T temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
            System.out.println("After Swap: Element 1: " + arr[0] + ", Element 2: " + arr[1]);
        }
    }
       public static void main(String[] args) {
        Integer[] intPair = {10, 20};
        Swapper.doSwap(intPair);
        System.out.println("Array after swap: " + Arrays.toString(intPair) + "\n");
        String[] stringPair = {"Hello", "World"};
        Swapper.doSwap(stringPair);
        System.out.println("Array after swap: " + Arrays.toString(stringPair) + "\n");
        Double[] doublePair = {3.14, 2.71};
        Swapper.doSwap(doublePair);
        System.out.println("Array after swap: " + Arrays.toString(doublePair));
    }
}

