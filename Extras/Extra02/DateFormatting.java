import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate currdate=LocalDate.now();
        DateTimeFormatter formater1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formater2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formater3=DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        String formatdate1=currdate.format(formater1);
        String formatdate2=currdate.format(formater2);
        String formatdate3=currdate.format(formater3);
        System.out.println(formatdate1);
        System.out.println(formatdate2);
        System.out.println(formatdate3);

    }
}
