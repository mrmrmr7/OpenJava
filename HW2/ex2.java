package CLASSES.HW2;
import java.util.InputMismatchException;
import java.util.*;

public class ex2 {
   public static void main(String[] args) {
       int headsCount = 3;

       System.out.print("Please, enter the age:");

       Scanner in = new Scanner(System.in);
       int age = 0;
       try {
           age = in.nextInt();
       } catch (InputMismatchException e) {
           System.out.println("Wrong type");
       }
       in.close();

       if (age > 200) {
           age -= 200;
           headsCount += 600;
           if (age > 100) {
               age -= 100;
               headsCount += 400 + age;
           } else {
               headsCount += age * 2;
           }
       } else {
           headsCount += age*3;
       }

       System.out.println("Count of heads is: " + headsCount);
       System.out.println("Count of eyes is: " + (headsCount*2));
   } 
}
