import java.util.Scanner;
public class LeapYearOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enter a year
        int year = sc.nextInt();
        // Check if the year is greater than or equal to 1582
        // and if it satisfies the leap year condition
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        } else {
            System.out.println("Year must be 1582 or greater.");
        }
    }
}
