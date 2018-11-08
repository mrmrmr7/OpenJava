package CLASSES.HW1;
import java.util.Scanner;

public class ex1{
    public static void main(String[] arg) {
        int a = 0;
        int b = 0;
        int c = 0;
        
        Scanner in = new Scanner(System.in);
        try {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
        } catch (inputmismatchexception e) {
            System.out.println("Wrong type")
        }
        in.close();
        
        System.out.println((a == b && b == c) ? "они одинаковые" : "они разные");

    }
}
