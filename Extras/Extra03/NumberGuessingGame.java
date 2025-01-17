import java.util.Scanner;
public class NumberGuessingGame {
    public static  int RandomNumber(int min,int max){
        int randomInt = (int) (Math.random() * ((max - min) + 1)) + min;
        return randomInt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int upperlimit=100;
        int lowerlimit=0;
        boolean flag=false;
        while(!flag){
            int guess=RandomNumber(lowerlimit,upperlimit);
            System.out.println("Is you number :"+guess +" ?");
            System.out.println("Enter high if it is greater than your number and low if it is smaller and Yes for equal");
            String x=sc.nextLine().trim().toLowerCase();
            switch (x){
                case "high":
                    upperlimit=guess-1;
                    break;
                case "low":
                    lowerlimit=guess+1;
                    break;
                case "yes":
                    System.out.println("!Yay i Guessed it");
                    flag=true;
                    break;
                    default:
                    System.out.println("Invalid input. Please enter 'high', 'low', or 'equal'.");
                    break;
            }
            if (lowerlimit > upperlimit) {
                System.out.println("something went wrong.");
                break;
            }


        }






    }
}
