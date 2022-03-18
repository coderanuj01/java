package KnowYourCustomer;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class GetRangeOfDates {
    public static void getRangeOfDate(Date current_Date, Date signup_Date){

        // covert date to local date
        LocalDate currentDate = current_Date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate signUpDate = signup_Date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        int currentYear = currentDate.getYear();   // to get the year of the date
        LocalDate thisYearAnniversary = signUpDate.withYear(currentYear); // change year of signup date to current year
        LocalDate thirtyDaysAfterCurrentDate = currentDate.plusDays(30);

        LocalDate startingDate;
        LocalDate endingDate;

        if( thisYearAnniversary.isAfter(thirtyDaysAfterCurrentDate) ){

            LocalDate oneYearPreviousAnniversary = thisYearAnniversary.minusYears(1);
            startingDate = oneYearPreviousAnniversary.minusDays(30);
            endingDate = oneYearPreviousAnniversary.plusDays(30);

        }else{

            if(thisYearAnniversary.isAfter(currentDate)){

                startingDate = thisYearAnniversary.minusDays(30);
                endingDate = currentDate;

            }else{

                LocalDate thirtyDaysAfterAnniversary = thisYearAnniversary.plusDays(30);

                if(thirtyDaysAfterAnniversary.isAfter(currentDate)){

                    startingDate = thisYearAnniversary.minusDays(30);
                    endingDate = currentDate;

                }else{

                    startingDate = thisYearAnniversary.minusDays(30);
                    endingDate = thisYearAnniversary.plusDays(30);

                }

            }
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String startingDateString = formatter.format(startingDate);
        String endingDateString = formatter.format(endingDate);
        System.out.println(startingDateString + " " +  endingDateString);


    }
}
