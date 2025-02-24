package TCS_NQT.practice;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class prog3 {
    /*
       Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends.
So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.
Count the number of Sunday jack will get within n number of days.
 Example 1:
Input
mon-> input String denoting the start of the month.
13  -> input integer denoting the number of days from the start of the month.
Output :
2    -> number of days within 13 days.
Explanation:
The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days. And then next Sunday in next 7 days and so on.
Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up in another sunday. Total 2 sundays may fall within 13 days.
    */
    public static void main(String[] args) {

        Map<String,Integer> daysMap=new HashMap<>();
        daysMap.put("Sunday",0);
        daysMap.put("Monday",1);
        daysMap.put("Tuesday",2);
        daysMap.put("Wednesday",3);
        daysMap.put("Thursday",4);
        daysMap.put("Friday",5);
        daysMap.put("Saturday",6);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter tye day: ");
        String day=sc.next();
        System.out.println("Enter the number of days: ");
        int noOfDays=sc.nextInt();

        prog3 ob3=new prog3();
        int res=ob3.countSundays(daysMap,day,noOfDays);
        System.out.println("Result "+res);
    }

    private int countSundays(Map<String,Integer> daysMap,String day,int noOfDays)
    {
        int startDayVal=daysMap.get(day);
        int firstSunday=(7-startDayVal) % 7;
         if(firstSunday == 0)
             firstSunday=7;
         if(firstSunday >  noOfDays)
             return 0;
         return 1 + (noOfDays - firstSunday)/7;
    }
}
