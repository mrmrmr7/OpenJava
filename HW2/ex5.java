package CLASSES.HW2;
import java.util.*;

public class ex5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int months[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();

        day += 1;

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            months[1]++;

        if(day > months[month-1]){
            day = 1;
            month += 1;
            if(month > 12){
                month = 1;
                year++;
            }
        }

        System.out.println("Next date is: " + day + "/" + month + "/" + year);
        in.close();
    }
}