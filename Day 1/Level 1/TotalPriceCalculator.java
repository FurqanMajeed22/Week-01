import java.util.Scanner;
public class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create a scanner object 
        Scanner scanner = new Scanner(System.in);
		//input unitprice
        double unitPrice = scanner.nextDouble();
		//input quantity
        int quantity = scanner.nextInt();
        double totalPrice = unitPrice * quantity;  
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f.%n", totalPrice, quantity, unitPrice);
	}
}

        
