import java.util.Scanner;
public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        //Enter the starting countdown value
        int counter = sc.nextInt();
        // Countdown using a while loop
        while (counter >= 1) {
            System.out.println(counter);  // Print the current counter value
            counter--;  // Decrement the counter
        }
    }
}
