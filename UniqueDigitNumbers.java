class UniqueDigitNumbers {
    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 10;
        }
        int count = 10;
        int uniqueDigits = 9;
        int availableNumbers = 9;
        for (int i = 2; i <= n; i++) {
            uniqueDigits = uniqueDigits * availableNumbers;
            count += uniqueDigits;
            availableNumbers--;
            if (availableNumbers == 0) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Count for n = 0: " + countNumbersWithUniqueDigits(0));
        System.out.println("Count for n = 1: " + countNumbersWithUniqueDigits(1));
        System.out.println("Count for n = 2: " + countNumbersWithUniqueDigits(2));
        System.out.println("Count for n = 3: " + countNumbersWithUniqueDigits(3));
    }
}
