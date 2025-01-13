import java.util.Random;
import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateRandomScores(numStudents);
        int[][] results = calculateResults(scores);

        displayScorecard(scores, results);
    }

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(100); // Physics
            scores[i][1] = rand.nextInt(100); // Chemistry
            scores[i][2] = rand.nextInt(100); // Math
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static int[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        int[][] results = new int[numStudents][4];

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = (double) total / 300 * 100;

            results[i][0] = total;
            results[i][1] = (int) Math.round(average); // Round average to nearest integer
            results[i][2] = (int) Math.round(percentage); // Round percentage to nearest integer
        }

        return results;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, int[][] results) {
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Roll", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            char grade = getGrade(results[i][2]);
            System.out.printf("%-5d %-10d %-10d %-10d %-10d %-10d %-10d %-10c\n", i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grade);
        }

        System.out.println("-------------------------------------------------------------------------------------");
    }

    // Method to determine the grade based on percentage
    public static char getGrade(int percentage) {
        if (percentage >= 80) {
            return 'A';
        } else if (percentage >= 70) {
            return 'B';
        } else if (percentage >= 60) {
            return 'C';
        } else if (percentage >= 50) {
            return 'D';
        } else if (percentage >= 40) {
            return 'E';
        } else {
            return 'R';
        }
    }
}