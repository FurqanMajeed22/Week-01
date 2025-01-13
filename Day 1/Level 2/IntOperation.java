import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take input values for a, b, and c
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        // Perform the integer operations
        int result1 = a + b * c;  // Multiplication first, then addition
        int result2 = a * b + c;  // Multiplication first, then addition
        int result3 = c + a / b;  // Division first, then addition
        int result4 = a % b + c;  // Modulus first, then addition
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3 + ".");
    }
}
