import java.util.Scanner;
public class SimpleInterestCalculator {
    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        // Formula for Simple Interest
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking user input for Principal, Rate, and Time
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the Time period in years: ");
        double time = scanner.nextDouble();
        // Calculating Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        // Displaying the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal +
                ", Rate of Interest " + rate + " and Time " + time);

    }
}
