import java.util.Scanner;
public class MaximumOfThreeNumbers {
    public  static void getinput(int []numbers){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number");
        numbers[0]=sc.nextInt();
        System.out.println("Enter the Second Number");
        numbers[1]= sc.nextInt();
        System.out.println("Enter the third Number");
        numbers[2]= sc.nextInt();
    }
    public  static  int getmax(int []number){
        return Math.max(number[0],Math.max(number[1],number[2]));
    }
    public static void main(String[] args) {
        int numbers[]=new int[3];
        getinput(numbers);
        int maximumnumber=getmax(numbers);
        System.out.println("Maximum Number is:"+ maximumnumber);
    }
}
