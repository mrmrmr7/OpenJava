package CLASSES.HW3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class olymp2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        Scanner in = new Scanner(System.in);
        try {
            a = in.nextInt();
            b = in.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong type");
        }
        in.close();

        if (b == 0) {
            System.out.println(1);
        } else {
            Vector<Integer> vec = new Vector<Integer>();
    
            a %= 10;
            int base = a;
    
            vec.add(a);
            do {
                a *= base;
                a %= 10;
                vec.add(a);
            } while (a != vec.get(0));
    
            System.out.println(vec.get((b - 1) % vec.size()));
        }
    }
}