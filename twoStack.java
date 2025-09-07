public class twoStack {
    int size;
    int top1, top2;
    int arr[];

    twoStack(int n) {
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
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    int pop2() {
        if (top2 < size) {
            return arr[top2++];
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public static void main(String[] args) {
        twoStack ts = new twoStack(10);
        ts.push1(5);
        ts.push1(10);
        ts.push2(15);
        ts.push2(20);

        System.out.println("Popped from Stack1: " + ts.pop1());
        System.out.println("Popped from Stack2: " + ts.pop2());
    }
}

