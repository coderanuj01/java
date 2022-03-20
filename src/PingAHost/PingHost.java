package PingAHost;


import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class PingHost {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the host you want to ping : ");
        String hostaddress = keyboard.nextLine();

        System.out.print("Enter the number of times you want to ping : ");
        int noOfTimes = keyboard.nextInt();

        try{
            ArrayList<Double> timeToReachHostList = new ArrayList<>();

            for(int i=0;i<noOfTimes;i++){
                double startTime = new GregorianCalendar().getTimeInMillis();
                InetAddress inet = InetAddress.getByName(hostaddress);

                double endTime = 0;

                boolean isConnectionSuccessful = inet.isReachable(5000);

                if(isConnectionSuccessful){
                    endTime = new GregorianCalendar().getTimeInMillis();
                    timeToReachHostList.add(endTime-startTime);
                    System.out.println(startTime);
                    System.out.println(endTime);
                    System.out.println(endTime-startTime);
                    System.out.println();
                }else{
                    System.out.println("connection not made");
                }
            }

            Collections.sort(timeToReachHostList);
            double median;

            if(noOfTimes % 2 == 0){
                double firstMiddle = timeToReachHostList.get((noOfTimes / 2) - 1);
                double secondMiddle = timeToReachHostList.get(noOfTimes/2);

                median = (firstMiddle + secondMiddle)/2;

            }else{
                median = timeToReachHostList.get(noOfTimes/2);
            }

            System.out.println("Median is : " + median + " ms");

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
