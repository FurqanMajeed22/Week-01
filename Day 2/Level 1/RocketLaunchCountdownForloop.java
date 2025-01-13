import java.util.Scanner;
public class RocketLaunchCountdownForloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        //Enter the starting countdown value
        int counter = sc.nextInt();
        // Countdown using a while loop
             for (int i = counter; i >= 1; i--) {
            System.out.println(i);  // Print the current countdown value
        }
    }
}
