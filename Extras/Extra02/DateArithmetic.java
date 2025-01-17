import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.format.DateTimeParseException;
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate dateoriginal = LocalDate.parse(input, formatter);
            LocalDate datemodified=dateoriginal.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
            System.out.println("original Date "+dateoriginal);
            System.out.println("Modified date "+datemodified);

        }catch(DateTimeParseException e){
            // Handle invalid date format
            System.out.println("Invalid date format. Please use the format yyyy-MM-dd.");

        }catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

    }
}
