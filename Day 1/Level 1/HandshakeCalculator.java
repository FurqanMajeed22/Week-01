import java.util.Scanner;
public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes using the combination formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

      
             System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes); 
    }
}
