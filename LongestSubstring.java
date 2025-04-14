import java.util.HashMap;
import java.util.Map;

class LongestSubstring {
    public static int findLongestSubstringLength(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }
            charIndexMap.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        System.out.println("Length of longest substring without repeating characters in s1: " + findLongestSubstringLength(s1));
        System.out.println("Length of longest substring without repeating characters in s2: " + findLongestSubstringLength(s2));
        System.out.println("Length of longest substring without repeating characters in s3: " + findLongestSubstringLength(s3));
    }
}
