import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CombinationSum2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void combinationSum(int[] candidates, int target, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            currentCombination.add(candidates[i]);
            combinationSum(candidates, target - candidates[i], i + 1, currentCombination, result);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> combinations = combinationSum2(candidates, target);
        System.out.println("Combinations: " + combinations);
    }
}
