import java.util.ArrayList;
import java.util.List;

class ArrayPermutations {
    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        if (arr.length == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        permuteHelper(arr, new ArrayList<>(), result);
        return result;
    }

    private static void permuteHelper(int[] arr, List<Integer> currentPermutation, List<List<Integer>> result) {
        if (currentPermutation.size() == arr.length) {
            result.add(new ArrayList<>(currentPermutation));
            return;
        }

        for (int num : arr) {
            if (!currentPermutation.contains(num)) {
                currentPermutation.add(num);
                permuteHelper(arr, currentPermutation, result);
                currentPermutation.remove(currentPermutation.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> permutations = permute(arr);
        System.out.println("Permutations: " + permutations);
    }
}
