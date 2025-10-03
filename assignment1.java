import java.util.*;

class assignment1 {

    // ---------- Task 1: Arrays, LinkedList, Doubly LL, Circular LL ----------
    static void task1_CollectionsDemo() {
        System.out.println("---- Task 1: Collections Demo ----");

        // Array
        int arr[] = {10, 20, 30};
        System.out.println("Array: " + Arrays.toString(arr));

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("LinkedList: " + linkedList);

        // Doubly LinkedList (Java LinkedList is doubly linked by default)
        linkedList.addFirst(0);
        linkedList.addLast(4);
        System.out.println("Doubly LinkedList: " + linkedList);

        // Circular Linked List (Manual Implementation)
        class Node {
            int data;
            Node next;
            Node(int d) { data = d; }
        }
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.next = third;
        third.next = head; // circular link
        System.out.println("Circular LinkedList: 1 -> 2 -> 3 -> back to 1");
    }

    // ---------- Task 2: Two Stacks in One Array ----------
    static class TwoStacks {
        int arr[];
        int top1, top2, size;

        TwoStacks(int n) {
            size = n;
            arr = new int[n];
            top1 = -1;
            top2 = n;
        }

        void push1(int x) {
            if (top1 < top2 - 1) {
                arr[++top1] = x;
            } else {
                System.out.println("Stack Overflow");
            }
        }

        void push2(int x) {
            if (top1 < top2 - 1) {
                arr[--top2] = x;
            } else {
                System.out.println("Stack Overflow");
            }
        }

        int pop1() {
            if (top1 >= 0) return arr[top1--];
            else {
                System.out.println("Stack Underflow");
                return -1;
            }
        }

        int pop2() {
            if (top2 < size) return arr[top2++];
            else {
                System.out.println("Stack Underflow");
                return -1;
            }
        }
    }

    // ---------- Task 3: Binary Search using Recursion ----------
    static int binarySearch(int arr[], int l, int r, int key) {
        if (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] > key) return binarySearch(arr, l, mid - 1, key);
            return binarySearch(arr, mid + 1, r, key);
        }
        return -1;
    }

    // ---------- MAIN OVERALL ----------
    static void mainCollectionsDemo() {
        System.out.println("\n---- Main Overall Assignment ----");

        // Queue
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30);
        System.out.println("Queue: " + q);

        // Stack
        Stack<Integer> st = new Stack<>();
        st.push(100); st.push(200); st.push(300);
        System.out.println("Stack: " + st);

        // LinkedList
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A"); ll.add("B"); ll.add("C");
        System.out.println("LinkedList: " + ll);

        // Doubly LinkedList (already in LinkedList)
        ll.addFirst("Start");
        ll.addLast("End");
        System.out.println("Doubly LinkedList: " + ll);

        // ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        al.add(11); al.add(22); al.add(33);
        System.out.println("ArrayList: " + al);

        // HashSet
        HashSet<String> hs = new HashSet<>();
        hs.add("Apple"); hs.add("Banana"); hs.add("Orange");
        System.out.println("HashSet: " + hs);
    }

    // ---------- MAIN FUNCTION ----------
    public static void main(String[] args) {
        // Task 1
        task1_CollectionsDemo();

        // Task 2
        System.out.println("\n---- Task 2: Two Stacks in One Array ----");
        TwoStacks ts = new TwoStacks(5);
        ts.push1(10);
        ts.push2(20);
        ts.push1(30);
        System.out.println("Popped from stack1: " + ts.pop1());
        System.out.println("Popped from stack2: " + ts.pop2());

        // Task 3
        System.out.println("\n---- Task 3: Binary Search Recursion ----");
        int arr[] = {10, 20, 30, 40, 50};
        int key = 30;
        int result = binarySearch(arr, 0, arr.length - 1, key);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + result);

        // Main Overall Assignment
        mainCollectionsDemo();
    }
}
