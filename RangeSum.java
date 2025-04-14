class RangeSum {
    public static int[] constructPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    public static int getRangeSum(int[] prefixSum, int L, int R) {
        if (L == 0) {
            return prefixSum[R];
        }
        return prefixSum[R] - prefixSum[L - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefixSum = constructPrefixSum(arr);
        int L = 1;
        int R = 3;
        int sum = getRangeSum(prefixSum, L, R);
        System.out.println("Sum of elements in range [" + L + ", " + R + "]: " + sum);
    }
}