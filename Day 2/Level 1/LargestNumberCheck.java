import java.util.Scanner;
public class LargestNumberCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // enter three numbers
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        // Check if the first number is the largest
        boolean isFirstLargest = (number1 >= number2) && (number1 >= number3);
        System.out.println("Is the first number the largest? " + (isFirstLargest ? "Yes" : "No"));
        // Check if the second number is the largest
        boolean isSecondLargest = (number2 >= number1) && (number2 >= number3);
        System.out.println("Is the second number the largest? " + (isSecondLargest ? "Yes" : "No"));
        // Check if the third number is the largest
        boolean isThirdLargest = (number3 >= number1) && (number3 >= number2);
        System.out.println("Is the third number the largest? " + (isThirdLargest ? "Yes" : "No"));
     
    }
}
