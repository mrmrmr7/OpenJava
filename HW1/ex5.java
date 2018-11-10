package CLASSES.HW1;
import java.util.InputMismatchException;
import java.util.*;

public class ex5
{
    public static void main(String[] args) {
        int a = 0;
        
        Scanner in = new Scanner(System.in);
        try {
            a = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong type");
        }
        in.close();

        int proizv = 1;
        double sum = 0;
        double res;

        while(a > 0){
            proizv *= a % 10;
            sum += a % 10;
            a /= 10;
        }

        sum /= 6.;
        res = Math.pow(proizv, 1. / 6.);

        System.out.println("res: " + res);
        System.out.println("sum: " + sum);
    }
}