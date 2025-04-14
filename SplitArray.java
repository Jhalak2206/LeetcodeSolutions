class SplitArray {
    public static boolean canSplitArray(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < n - 1; i++) {
            leftSum += arr[i];
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Can split arr1? " + canSplitArray(arr1));
        System.out.println("Can split arr2? " + canSplitArray(arr2));
    }
}
