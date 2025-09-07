import java.util.*;

class assignment1 {
    public static void main(String[] args) {
        // Arrays 
        int[] arr = {10, 20, 30, 40};
        System.out.println("Array Elements:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        // LinkedList 
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("LinkedList Elements: " + list);

        // Doubly Linked List
        LinkedList<String> dll = new LinkedList<>();
        dll.add("A");
        dll.add("B");
        dll.add("C");
        dll.addFirst("Start");
        dll.addLast("End");
        System.out.println("Doubly Linked List: " + dll);

        // Circular Linked List
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(100);
        cll.add(200);
        cll.add(300);
        System.out.print("Circular Linked List: ");
        cll.display();
    }
}

// Circular Linked List Logic
class CircularLinkedList {
    Node head = null, tail = null;

    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println();
    }
}
