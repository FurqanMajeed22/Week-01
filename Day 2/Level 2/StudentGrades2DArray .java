import java.util.Scanner;
public class StudentGrades2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        // Create a 2D array to store marks for all students and subjects
        int[][] marks = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        // Create arrays to store percentages and grades
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        // Get marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            // Get marks for each subject, ensuring positive values
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                int mark;
                do {
                    System.out.print("Enter " + subject + " marks: ");
                    mark = scanner.nextInt();
                    if (mark < 0) {
                        System.out.println("Invalid input. Marks cannot be negative.");
                    }
                } while (mark < 0);
                marks[i][j] = mark;
            }

            // Calculate percentage
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (double) totalMarks / 300 * 100;

            // Determine grade
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display results
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t\t%.2f%%\t\t%c\n", i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}