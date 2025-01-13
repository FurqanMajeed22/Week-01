import java.util.Scanner;
public class DivisibilityBy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // enter a number  
        int number = scanner.nextInt(); 
        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }

    }
}
