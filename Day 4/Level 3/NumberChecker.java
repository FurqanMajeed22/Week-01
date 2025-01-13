public class NumberChecker {

    public static void main(String[] args) {
        int number = 153; // You can change this to test with other numbers

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));

        int[] digits = getDigits(number);
        System.out.println("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }

        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digits));

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

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int num, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], power);
        }
        return sum == num;
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
