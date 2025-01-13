import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take input values for a, b, and c (double values)
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        // Perform the double operations 
        double result1 = a + b * c;  // Multiplication first, then addition
        double result2 = a * b + c;  // Multiplication first, then addition
        double result3 = c + a / b;  // Division first, then addition
        double result4 = a % b + c;  // Modulus first, then addition
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", and " + result3 + ".");
    }
}
