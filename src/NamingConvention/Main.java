package NamingConvention;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // localDateTime class

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd : MM : YYYY");
        String formatDateTime = date.format(formatter);
        System.out.println("today is : " + formatDateTime);

    }
}
