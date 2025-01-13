import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enter a number
        int number = sc.nextInt();
        // Use a for loop to generate the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int result = number * i;  // Calculate the product
            System.out.println(number + " * " + i + " = " + result);  // Print the multiplication table
        }
    }
}
