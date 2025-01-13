import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enter salary and years of service
        double salary = sc.nextDouble();
        //Enter Years of Services
        int yearsOfService = sc.nextInt();
        // Calculate bonus based on years of service
        double bonus = 0.0;
        // If years of service is more than 5, give a 5% bonus
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }
        System.out.println("The bonus amount is: " + bonus);
    }
}
