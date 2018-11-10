package CLASSES.HW1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        Scanner in = new Scanner(System.in);
        try {
            a = in.nextInt();
            b = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong type");
        }
        in.close();

        System.out.println(a + " to " + b);
        
        a += b;
        b = a - b;
        a = a - b;

        System.out.println(a + " to " + b);
    }
}