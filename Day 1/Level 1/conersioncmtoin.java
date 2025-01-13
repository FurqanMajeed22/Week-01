import java.util.Scanner;
public class conersioncmtoin {
    public static void main(String[] args) {
        //Taking height in cm from user
		double cm;
		Scanner sc=new Scanner(System.in);
		cm=sc.nextDouble();
		//calulating inches
		double inches=cm/2.54;
		double foot=inches/(double)12;
		System.out.println("Your Height in cm is "+cm+ " while in feet is "+ foot + "and inches is "+inches);
    }
}