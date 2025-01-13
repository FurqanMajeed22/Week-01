import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input base and height in inches
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        // Calculate area in square inches
        double areaInInches = 0.5 * base * height;
        // Convert area to square centimeters (1 square inch = 6.4516 square cm)
        double areaInCm = areaInInches * 6.4516;
        // Convert area to square feet (1 square foot = 144 square inches)
        double areaInFeet = areaInInches / 144;
     
        System.out.printf("Your area in cm is %.2f, in feet is %.2f, and in inches is %.2f.%n",
                          areaInCm, areaInFeet, areaInInches);
    
    }
}
