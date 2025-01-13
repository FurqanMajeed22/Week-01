import java.util.Scanner;
public class CustomNumberCheck {
    // Check if the number is positive
    static boolean checkPositive(int num) {
        return num >= 0;
    }

    // Check if the number is even
    static boolean checkEven(int num) {
        return num % 2 == 0;
    }

    // Compare two numbers
    static int compareNumbers(int first, int last) {
        if (first > last) return 1;
        else if (first == last) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] userNums = new int[5];

        System.out.println("Enter 5 integers");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            userNums[i] = sc.nextInt();
        }

        System.out.println("\nResults:");
        for (int i = 0; i < userNums.length; i++) {
            if (checkPositive(userNums[i])) {
                System.out.print(userNums[i] + " is positive and ");
                System.out.println(checkEven(userNums[i]) ? "even." : "odd.");
            } else {
                System.out.println(userNums[i] + " is negative.");
            }
        }

        int result = compareNumbers(userNums[0], userNums[4]);
        System.out.print("\nFirst vs Last: ");
        if (result == 1) System.out.println("First is greater.");
        else if (result == 0) System.out.println("First equals Last.");
        else System.out.println("First is smaller.");

    }
}
