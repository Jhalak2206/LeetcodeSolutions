import java.util.Deque;
import java.util.LinkedList;

class MaxSlidingWindow {
    public static int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k == 0) {
            return new int[0];
        }
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        result[0] = arr[deque.peekFirst()];
        for (int i = k; i < n; i++) {
            result[i - k + 1] = arr[deque.peekFirst()];
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow(arr, k);
        System.out.print("Maximums of sliding windows of size " + k + ": ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
