import java.util.Scanner;
public class ChocolateDivider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the number of chocolates from the user
        int numberOfChocolates = scanner.nextInt();
        // Get the number of children from the user
        int numberOfChildren = scanner.nextInt();
        // Check if the number of children is zero to prevent division by zero
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero!");
        } else {
            // Calculate chocolates each child gets and remaining chocolates
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            int remainingChocolates = numberOfChocolates % numberOfChildren;
            
            // Display the results
            System.out.println("The number of chocolates each child gets is " + chocolatesPerChild 
                               + " and the number of remaining chocolates are " + remainingChocolates + ".");
        }
    }
}
