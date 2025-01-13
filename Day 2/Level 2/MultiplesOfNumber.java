import java.util.Scanner;
public class MultiplesOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter a number
        int number = sc.nextInt();
        // Check and print multiples of the number below 100
        // Loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of the number
            if (i % number == 0) {
                System.out.println(i);  // Print the multiple
            }
        }
    }
}
