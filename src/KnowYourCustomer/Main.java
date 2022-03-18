package KnowYourCustomer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter No of Input : ");
        int numberOfInput = keyboard.nextInt();              // taking input of number of cases
        keyboard.nextLine();

        System.out.println("Enter dates : ");
        ArrayList<String> stringDatesList = new ArrayList<>();
        for(int i=0;i<numberOfInput;i++){
            String dates = keyboard.nextLine();              // taking string of dates
            stringDatesList.add(dates);
        }

        // making object of getDatesFromString Class
        GetDatesFromString getDatesFromString = new GetDatesFromString();

        for(int i=0;i< stringDatesList.size();i++){

            // calling getDates function of getDatesFromString class
            List<Date> listOfDates = getDatesFromString.getDates(stringDatesList.get(i));

            Date signupDate = listOfDates.get(0);       // first element is signup date
            Date currentDate = listOfDates.get(1);      // second element is current date

            if( signupDate.compareTo(currentDate) > 0){

                System.out.println("No range");

            }else{

                // making object of getRangeFromDates class
                GetRangeOfDates dateRange = new GetRangeOfDates();

                // calling getrangeofdate method of getrangefromdates class
                dateRange.getRangeOfDate(currentDate,signupDate);

            }

        }
    }
}
