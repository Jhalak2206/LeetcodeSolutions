class PalindromeInteger {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int reversedNum = 0;
        while (x > reversedNum) {
            reversedNum = reversedNum * 10 + x % 10;
            x /= 10;
        }
        return x == reversedNum || x == reversedNum / 10;
    }

    public static void main(String[] args) {
        System.out.println("Is 121 a palindrome? " + isPalindrome(121));
        System.out.println("Is 123 a palindrome? " + isPalindrome(123));
        System.out.println("Is 1221 a palindrome? " + isPalindrome(1221));
        System.out.println("Is -121 a palindrome? " + isPalindrome(-121));
    }
}


