import java.util.Scanner;
public class WeightConverter {
    // Function to convert pounds to kilograms
    public static double convertPoundsToKg(double weightPounds) {
        return weightPounds * 2.2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //enter weight in pounds
        double weightPounds = scanner.nextDouble();
        // Convert weight to kilograms
        double weightKg = convertPoundsToKg(weightPounds);
        System.out.printf("The weight of the person in pounds is %.2f and in kg is %.2f\n", weightPounds, weightKg);
    }
}