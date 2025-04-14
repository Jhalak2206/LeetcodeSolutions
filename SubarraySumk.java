import java.util.HashMap;
import java.util.Map;

class SubarraySumK {
    public static int findSubarraySum(int[] arr, int k) {
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : arr) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int k = 2;
        int result = findSubarraySum(arr, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}
