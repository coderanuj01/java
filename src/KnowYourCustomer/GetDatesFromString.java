package KnowYourCustomer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GetDatesFromString {
    public static ArrayList<Date> getDates(String datesInString){
        ArrayList<Date> dateList = new ArrayList<>();

        try{

            String signupDateString = datesInString.substring(0,10);
            String currentDateString = datesInString.substring(11);

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            Date signupDate = dateFormat.parse(signupDateString);
            Date currentDate = dateFormat.parse(currentDateString);

            dateList.add(signupDate);
            dateList.add(currentDate);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        return dateList;
    }
}
