import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take input for the first number
        int number1 = scanner.nextInt();
        // Take input for the second number
        int number2 = scanner.nextInt();
        // Swap the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;
        // Display swapped numbers
        System.out.println("After swapping: number1 = " + number1 + ", number2 = " + number2);
    }
}
