package CLASSES.HW1;

import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        int a = 0;
        
        Scanner in = new Scanner(System.in);
        try {
            a = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong type");
        }
        in.close();

        int res = 0;

        while(a > 0){
            res *= 10;
            res += a % 10;
            a /= 10;
        }

        System.out.println(res);
    }
}