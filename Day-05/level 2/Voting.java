import java.util.Scanner;

public class Voting {

    // Method to generate random ages for n students
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 100); // Generate random 2-digit age
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                results[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }
        return results;
    }

    // Method to display results in a tabular format
    public static void displayResults(String[][] data) {
        System.out.println("\nAge Eligibility");
        for (String[] row : data) {
            System.out.println(row[0] + " " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] ages = generateRandomAges(n);

        System.out.println("\nGenerated ages for students:");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        String[][] eligibilityResults = checkVotingEligibility(ages);

        System.out.println("\n\nVoting Eligibility Results:");
        displayResults(eligibilityResults);

        sc.close();
    }
}
