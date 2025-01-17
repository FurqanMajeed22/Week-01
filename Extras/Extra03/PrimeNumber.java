import java.util.Scanner;

public class PrimeNumber {
    public static  boolean checkprime(int number){
        if(number==0 || number==1)return  false;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0)return false;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        boolean prime=checkprime(number);
        if(prime){
            System.out.println(number + " is prime");
        }else{
            System.out.println(number +" is not prime");
        }
    }
}
