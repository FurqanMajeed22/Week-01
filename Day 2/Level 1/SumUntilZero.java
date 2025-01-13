import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Initialize total to 0.0
        double total = 0.0;
        // Variable to store user input
        double number;
        // Loop to keep asking for input until the user enters 0
        while (true) {
            number = sc.nextDouble();
            if (number == 0) {
                break;  // Exit the loop if the user enters 0
            }
            total += number;  // Add the entered number to the total
        }
        // Display the total sum
        System.out.println("The total sum of the numbers entered is: " + total);
    }
}
