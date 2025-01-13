public class fee{
public static void main(String args[]){
int fee=125000;
int discountedPercent=10;
double discountamount=(fee/100)*discountedPercent;
double finalprice=fee-discountamount;
System.out.println(" The discount amount is INR "+ discountamount+" and final discounted fee is INR "+finalprice);
}
}