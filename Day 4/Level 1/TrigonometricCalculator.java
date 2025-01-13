import java.util.Scanner;
public class TrigonometricCalculator {
    // Method to calculate trigonometric functions (sine, cosine, and tangent)
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        // Return the results as an array: [sine, cosine, tangent]
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
         //Calculate trigonometric functions         
        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("Sine of " + angle + " "+ results[0]);
        System.out.println("Cosine of " + angle + " "+results[1]);
        System.out.println("Tangent of " + angle +" "+results[2]);
    }
}
