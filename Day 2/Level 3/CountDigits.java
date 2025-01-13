import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // Initialize the count variable to 0
        int count = 0;
        // Handle the case for negative numbers
        number = Math.abs(number); // Make the number positive if it's negative
        // Use a loop to count digits until number becomes 0
        while (number != 0) {
            number = number / 10;  // Remove the last digit
            count++;  // Increment the count
        }
        // If the number is 0, count should be 1
        if (count == 0) {
            count = 1;
        }
        System.out.println("The number of digits is: " + count);
   
    }
}
