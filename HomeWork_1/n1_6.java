import java.util.*;

public class n1_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int res = 0;

        while(a > 0){
            res *= 10;
            res += a % 10;
            a /= 10;
        }

        System.out.println(res);

        in.close();
    }
}