package OOPS;

import java.util.Arrays;

class MyData implements Comparable<MyData> {
    private int value;

    public MyData(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data[Value=" + value + "]";
    }

    @Override
    public int compareTo(MyData other) {
        if (this.value == other.value) {
            return 0;
        } else if (this.value < other.value) {
            return -1;
        } else {
            return 1;
        }
    }
}

public class P5 {

    public static void main(String[] args) {
        MyData[] dataArray = {
            new MyData(30),
            new MyData(10),
            new MyData(50),
            new MyData(20),
            new MyData(40)
        };

        System.out.println("--- Array Before Sorting (Demonstrating toString()) ---");
        for (MyData data : dataArray) {
            System.out.println(data);
        }
        System.out.println();
        
        Arrays.sort(dataArray);

        System.out.println("--- Array After Sorting (Comparison/Sorting) ---");
        for (MyData data : dataArray) {
            System.out.println(data);
        }
    }
}

