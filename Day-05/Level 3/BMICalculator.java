import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] data) {
        String[][] results = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 39.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }

            results[i][0] = String.valueOf(weight);
            results[i][1] = String.valueOf(data[i][1]);
            results[i][2] = String.valueOf(bmi);
            results[i][3] = status;
        }
        return results;
    }

    // Method to display the results
    public static void displayResults(String[][] data) {
        System.out.println("Results:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Person " + (i + 1) + ": Weight = " + data[i][0] + " kg, Height = " + data[i][1] + " cm, BMI = " + data[i][2] + ", Status = " + data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] heightWeightData = new double[10][2];

        // Take user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            heightWeightData[i][0] = sc.nextDouble();

            System.out.println("Enter height (cm) for person " + (i + 1) + ":");
            heightWeightData[i][1] = sc.nextDouble();
        }

        // Calculate BMI and Status
        String[][] bmiData = calculateBMI(heightWeightData);

        // Display the results
        displayResults(bmiData);
    }
}
