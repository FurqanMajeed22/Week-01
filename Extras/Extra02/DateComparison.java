import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateComparison {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String Date1=sc.nextLine();
        String Date2=sc.nextLine();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1=LocalDate.parse(Date1,formatter);
        LocalDate date2=LocalDate.parse(Date2,formatter);
        if(date1.isBefore(date2)){
            System.out.println(date1 +" is before "+ date2);
        }else if(date1.isAfter(date2)){
            System.out.println(date1+" is after "+ date2);
        }else{
            System.out.println(date1+" and "+ date2 +" are equal");
        }

    }
}
