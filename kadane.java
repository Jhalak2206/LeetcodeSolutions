class Kadane {
    public static int maxSubarraySum(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int currentMax = 0;
        for (int num : arr) {
            currentMax = Math.max(num, currentMax + num);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = maxSubarraySum(arr);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}
