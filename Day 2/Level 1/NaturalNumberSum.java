import java.util.Scanner;
public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //enter a number
        int number = sc.nextInt();
        // Check if the number is a natural number (positive integer)
        if (number >= 0) {
            int sum = number * (number + 1) / 2;  // Calculate the sum of n natural numbers
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
