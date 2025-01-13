import java.util.Scanner;
public class kmtomiles{
public static void main(String args[]){
 double km;
 Scanner sc=new Scanner(System.in);
 km=sc.nextInt();
 double ans=km*0.621371;
 System.out.println("The total miles is " +ans+" mile for the given "+ km+" km");
}
}