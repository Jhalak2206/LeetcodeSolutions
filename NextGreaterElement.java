import java.util.Stack;

class NextGreaterElement {
    public static int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;
            while (!stack.isEmpty() && arr[stack.peek()] < arr[index]) {
                result[stack.pop()] = arr[index];
            }
            stack.push(index);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int[] nextGreater = nextGreaterElements(arr);
        System.out.print("Next greater elements: ");
        for (int num : nextGreater) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}