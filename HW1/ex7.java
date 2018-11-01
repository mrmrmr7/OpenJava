package CLASSES.HW1;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a + " to " + b);
        
        a += b;
        b = a - b;
        a = a - b;

        System.out.println(a + " to " + b);
        in.close();
    }
}