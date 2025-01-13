import java.util.Random;
public class ZaraBonus {
    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] employeeData = generateEmployeeData(numEmployees);
        int[][] updatedData = calculateBonus(employeeData);
        displayResults(employeeData, updatedData);
    }

    // Method to generate random 5-digit salary and years of service for each employee
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2];
        Random rand = new Random();
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = rand.nextInt(90000) + 10000; // Generate 5-digit salary
            data[i][1] = rand.nextInt(10) + 1; // Generate years of service between 1 and 10
        }

        return data;
    }

    // Method to calculate bonus and new salary based on years of service
    public static int[][] calculateBonus(int[][] data) {
        int[][] updatedData = new int[data.length][3];

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int yearsOfService = data[i][1];
            int bonus;

            if (yearsOfService > 5) {
                bonus = (int) (salary * 0.05);
            } else {
                bonus = (int) (salary * 0.02);
            }

            updatedData[i][0] = salary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = salary + bonus;
        }

        return updatedData;
    }

    // Method to display results in tabular format
    public static void displayResults(int[][] oldData, int[][] newData) {
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Employee", "Old Salary", "Years", "Bonus", "New Salary");
        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10d\n", i + 1, oldData[i][0], oldData[i][1], newData[i][1], newData[i][2]);
        }

        System.out.println("-----------------------------------------------------------------");
    }
}