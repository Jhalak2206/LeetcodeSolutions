class TwoStacks {
    int[] arr;
    int top1, top2;
    int size;

    TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack 1 Overflow");
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack 2 Overflow");
        }
    }

    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack 1 Underflow");
            return -1;
        }
    }

    int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack 2 Underflow");
            return -1;
        }
    }

    boolean isEmpty1() {
        return top1 == -1;
    }

    boolean isEmpty2() {
        return top2 == size;
    }

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped from stack 1: " + ts.pop1());
        System.out.println("Popped from stack 2: " + ts.pop2());
        System.out.println("Popped from stack 2: " + ts.pop2());
        System.out.println("Is stack 1 empty? " + ts.isEmpty1());
        System.out.println("Is stack 2 empty? " + ts.isEmpty2());
    }
}
