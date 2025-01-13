import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote
    public static  boolean canStudentVote(int age) {
        // If the age is negative, return false
        if (age < 0) {
            return false;
        }
        // If age is 18 or above, return true, else return false
        return age >= 18;
    }

    public static void main(String[] args) {
        // Create an instance of StudentVoteChecker to use the method
        
        // Array to store the ages of 10 students
        int[] studentAges = new int[10];

        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Loop through the array to take user input for the student's age
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt(); // Store the inputted age in the array
        }

        // Loop through the ages array, check voting eligibility, and display the result
        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        // Close the scanner after use
        scanner.close();
    }
}
