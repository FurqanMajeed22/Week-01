import java.util.Scanner;
public class HandshakeCalculator2 {
    // Method to calculate the number of handshakes using the combination formula
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc= new Scanner(System.in);

        // Taking user input for the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Check if the number of students is greater than or equal to 2
        if (n >= 2) {
            // Calculate the maximum number of handshakes
            int handshakes = calculateHandshakes(n);

            // Display the result
            System.out.println("The maximum number of handshakes is: " + handshakes);
        } else {
            // If there are less than 2 students, no handshakes are possible
            System.out.println("No handshakes are possible with " + n + " students.");
        }
    }
}
