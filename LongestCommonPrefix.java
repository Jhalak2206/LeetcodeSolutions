class LongestCommonPrefix {
    public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String firstStr = strs[0];
        for (int i = 0; i < firstStr.length(); i++) {
            char c = firstStr.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return firstStr.substring(0, i);
                }
            }
        }
        return firstStr;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest common prefix of strs1: " + findLongestCommonPrefix(strs1));
        System.out.println("Longest common prefix of strs2: " + findLongestCommonPrefix(strs2));
    }
}