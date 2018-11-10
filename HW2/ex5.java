package CLASSES.HW2;
import java.util.InputMismatchException;
import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        int months[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int day = 0; 
        int month = 0;
        int year = 0; 
        
        Scanner in = new Scanner(System.in);
        try {
            day = in.nextInt();
            month = in.nextInt();
            year = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong type");
        }
        in.close();

        day++;

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            months[1]++;

        if(day > months[month-1]){
            day -= months[month-1];
            month++;
            if(month > 12){
                month = 1;
                year++;
            }
        }

        System.out.println("Next date is: " + day + "/" + month + "/" + year);
    }
}