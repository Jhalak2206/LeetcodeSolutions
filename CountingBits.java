class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println("Is 16 a power of two? " + isPowerOfTwo(16));
        System.out.println("Is 17 a power of two? " + isPowerOfTwo(17));
        System.out.println("Is 0 a power of two? " + isPowerOfTwo(0));
        System.out.println("Is -4 a power of two? " + isPowerOfTwo(-4));
    }
}
