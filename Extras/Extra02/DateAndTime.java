import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTime {
        public static void main(String[] args) {
            ZonedDateTime zonedDateTimeGreen= ZonedDateTime.now(ZoneId.of("GMT"));
            ZonedDateTime zonedDateTimeIST= ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
            ZonedDateTime zonedDateTimePacific=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
            System.out.println(zonedDateTimeGreen);
            System.out.println(zonedDateTimeIST);
            System.out.println(zonedDateTimePacific);

        }


    }


