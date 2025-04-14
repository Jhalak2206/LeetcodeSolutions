import java.util.ArrayList;
import java.util.List;

class SubsetsRecursive {
    public static List<List<Integer>> getSubsets(int[] arr) {
        return generateSubsets(arr, 0);
    }

    private static List<List<Integer>> generateSubsets(int[] arr, int index) {
        List<List<Integer>> result = new ArrayList<>();
        if (index == arr.length) {
            result.add(new ArrayList<>());
            return result;
        }

        int first = arr[index];
        List<List<Integer>> subsets = generateSubsets(arr, index + 1);
        List<List<Integer>> newSubsets = new ArrayList<>();
        for (List<Integer> subset : subsets) {
            List<Integer> newSubset = new ArrayList<>(subset);
            newSubset.add(0, first);
            newSubsets.add(newSubset);
        }
        result.addAll(subsets);
        result.addAll(newSubsets);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> subsets = getSubsets(arr);
        System.out.println("Subsets: " + subsets);
    }
}
