import java.util.HashSet;
import java.util.Set;

class MaxXORPair {
    public static int findMaximumXOR(int[] nums) {
        int maxXor = 0;
        int mask = 0;
        for (int i = 31; i >= 0; i--) {
            mask = mask | (1 << i);
            Set<Integer> seen = new HashSet<>();
            for (int num : nums) {
                seen.add(num & mask);
            }
            int candidateXor = maxXor | (1 << i);
            for (int prefix : seen) {
                if (seen.contains(prefix ^ candidateXor)) {
                    maxXor = candidateXor;
                    break;
                }
            }
        }
        return maxXor;
    }

    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};
        int maxXor = findMaximumXOR(nums);
        System.out.println("Maximum XOR: " + maxXor);
    }
}
