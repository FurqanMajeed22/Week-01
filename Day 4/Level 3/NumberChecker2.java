public class NumberChecker2 {

    public static void main(String[] args) {
        int number = 153; // You can change this to test with other numbers

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));

        int[] digits = getDigits(number);
        System.out.println("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

        int[][] digitFrequency = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < digitFrequency.length; i++) {
            System.out.println("Digit: " + digitFrequency[i][0] + ", Frequency: " + digitFrequency[i][1]);
        }

        int[] largestTwo = findTwoLargest(digits);
        System.out.println("Largest: " + largestTwo[0]);
        System.out.println("Second Largest: " + largestTwo[1]);

        int[] smallestTwo = findTwoSmallest(digits);
        System.out.println("Smallest: " + smallestTwo[0]);
        System.out.println("Second Smallest: " + smallestTwo[1]);
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

    // Method to find the sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    // Method to find the sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return num % sum == 0;
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

    // Method to find the largest and second largest elements
    public static int[] findTwoLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements
    public static int[] findTwoSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}
