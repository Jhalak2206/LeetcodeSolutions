class MajorityElement {
    public static int findMajorityElement(int[] arr) {
        int n = arr.length;
        int candidate = -1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 3};
        int[] arr2 = {2, 2, 1, 1, 1, 2, 2};
        int majority1 = findMajorityElement(arr1);
        int majority2 = findMajorityElement(arr2);
        System.out.println("Majority element in arr1: " + majority1);
        System.out.println("Majority element in arr2: " + majority2);
    }
}
