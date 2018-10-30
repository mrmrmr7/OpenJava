import java.util.*;

public class n1_5
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
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
        in.close();
    }
}