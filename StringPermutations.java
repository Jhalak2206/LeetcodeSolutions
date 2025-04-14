import java.util.ArrayList;
import java.util.List;

class StringPermutations {
    public static List<String> generatePermutations(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() == 0) {
            result.add("");
            return result;
        }
        if (s.length() == 1) {
            result.add(s);
            return result;
        }
        char firstChar = s.charAt(0);
        String remaining = s.substring(1);
        List<String> permutationsOfRemaining = generatePermutations(remaining);
        for (String str : permutationsOfRemaining) {
            for (int i = 0; i <= str.length(); i++) {
                String newPermutation = str.substring(0, i) + firstChar + str.substring(i);
                result.add(newPermutation);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> permutations = generatePermutations(s);
        System.out.println("Permutations of " + s + ": " + permutations);
    }
}
