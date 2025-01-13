import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get user input for weight and height
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        // Convert height from cm to meters
        height = height / 100;
        // Calculate BMI
        double bmi = weight / (height * height);
        // Determine weight status based on BMI
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        System.out.println("BMI: " + bmi);
        System.out.println("Weight Status: " + status);
    }
}