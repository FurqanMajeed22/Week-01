public class NumberChecker3 {

    public static void main(String[] args) {
        int number = 153; // You can change this to test with other numbers

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));

        int[] digits = getDigits(number);
        System.out.println("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }

        System.out.println("Reversed Digits: ");
        int[] reversedDigits = reverseDigits(digits);
        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.println(reversedDigits[i]);
        }

        System.out.println("Arrays are equal: " + areArraysEqual(digits, reversedDigits));
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));

        int[][] digitFrequency = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < digitFrequency.length; i++) {
            System.out.println("Digit: " + digitFrequency[i][0] + ", Frequency: " + digitFrequency[i][1]);
        }
    }

    // Method to count the digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] getDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to find the frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Digit
            frequency[i][1] = 0; // Frequency
        }
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][1]++;
        }
        return frequency;
    }
}
