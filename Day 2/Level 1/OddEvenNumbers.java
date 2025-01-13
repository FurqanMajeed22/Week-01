import java.util.Scanner;
public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Enter a number
        int number = sc.nextInt();
        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Iterate from 1 to the entered number using a for loop
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    // Print even number
                    System.out.println(i + " is an even number.");
                } else {
                    // Print odd number
                    System.out.println(i + " is an odd number.");
                }
            }
        }
    }
}
