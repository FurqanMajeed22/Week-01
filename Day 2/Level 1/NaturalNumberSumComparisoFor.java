import java.util.Scanner;
public class NaturalNumberSumComparisoFor{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Enter a number
        int n = sc.nextInt();
        // Check if the number is a natural number
        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Calculate sum using formula
            int formulaSum = n * (n + 1) / 2;
            // Calculate sum using while loop
            int loopSum = 0;
			for(int i=1;i<=n;i++)
			loopSum+=i;
            // Display both sums 
            System.out.println("Sum using the formula (n * (n + 1) / 2): " + formulaSum);
            System.out.println("Sum using the For loop: " + loopSum);
            
            // Compare the two results
            if (formulaSum == loopSum) {
                System.out.println("Both results are correct");
            } else {
                System.out.println("There is a difference between the two results.");
            }
        }
    }
}
