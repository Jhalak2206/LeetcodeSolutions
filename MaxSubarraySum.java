class MaxSubarraySum {
    public static int findMaxSubarraySum(int[] arr, int K) {
        int n = arr.length;
        if (n < K) {
            return -1;
        }
        int windowSum = 0;
        for (int i = 0; i < K; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;
        for (int i = K; i < n; i++) {
            windowSum = windowSum - arr[i - K] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int K = 4;
        int maxSum = findMaxSubarraySum(arr, K);
        System.out.println("Maximum subarray sum of size " + K + ": " + maxSum);
    }
}
