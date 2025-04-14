class LongestPalindrome {
    public static String findLongestPalindrome(String s) {
        int n = s.length();
        if (n < 2) {
            return s;
        }
        int start = 0;
        int maxLength = 1;
        for (int i = 0; i < n; i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, start + maxLength);
    }

    public static int expandAroundCenter(String s, int left, int right) {
        int n = s.length();
        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "cbbd";
        System.out.println("Longest palindromic substring of s1: " + findLongestPalindrome(s1));
        System.out.println("Longest palindromic substring of s2: " + findLongestPalindrome(s2));
    }
}