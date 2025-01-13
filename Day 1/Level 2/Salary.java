import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take salary input from the user
        double salary = scanner.nextDouble();
        // Take bonus input from the user
        double bonus = scanner.nextDouble();
        // Calculate total income
        double totalIncome = salary + bonus;
        // Output the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + totalIncome + ".");
    }
}
