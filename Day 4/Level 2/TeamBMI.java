import java.util.Scanner;
public class TeamBMI {
    // Method to calculate BMI for each person
    static void calculateBMI(double[][] membersData) {
        for (int i = 0; i < membersData.length; i++) {
            double weight = membersData[i][0];
            double heightMeters = membersData[i][1] / 100.0; // Convert cm to meters
            membersData[i][2] = weight / (heightMeters * heightMeters); // BMI formula
        }
    }
    // Method to determine BMI status
    static String[] getBMIStatus(double[][] membersData) {
        String[] status = new String[membersData.length];
        for (int i = 0; i < membersData.length; i++) {
            double bmi = membersData[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] teamData = new double[10][3]; // Weight, Height, BMI

        // Input: weight and height
        System.out.println("Provide weight (kg) and height (cm) for each team member:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Member " + (i + 1) + " weight (kg): ");
            teamData[i][0] = input.nextDouble();
            System.out.print("Member " + (i + 1) + " height (cm): ");
            teamData[i][1] = input.nextDouble();
        }

        // Process: Calculate BMI
        calculateBMI(teamData);

        // Process: Determine BMI status
        String[] statuses = getBMIStatus(teamData);

        // Output: Display results
        System.out.println("\nTeam BMI Results:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Member %d - Weight: %.2f kg, Height: %.2f cm, BMI: %.2f, Status: %s%n",
                              i + 1, teamData[i][0], teamData[i][1], teamData[i][2], statuses[i]);
        }

        input.close();
    }
}
