package CLASSES.HW1;
import java.util.InputMismatchException;
import java.util.*;

public class ex3
{
    public static void main(String[] args) {
        double r1 = 0.0D;
        double r2 = 0.0D;

        Scanner in = new Scanner(System.in);
        try {
            r1 = in.nextDouble();
            r2 = in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong type");
        }
        in.close();

        double ringField = Math.PI * (r2*r2 - r1*r1);

        System.out.println(ringField);
    }
}