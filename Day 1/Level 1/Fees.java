import java.util.Scanner;
public class fees{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
//Taking input fee from the user
int fee=sc.nextInt();
//Taking discountedPercent from the user
int discountedPercent=sc.nextInt();
//Calculating discountedamount
double discountamount=(fee/100)*discountedPercent;
double finalprice=fee-discountamount;
System.out.println("The discount amount is INR "+ discountamount+" and final discounted fee is INR "+finalprice);
}
}