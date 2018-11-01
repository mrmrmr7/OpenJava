package CLASSES.HW1;

import java.util.*;

public class n1_3
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double r1 = in.nextDouble();
        double r2 = in.nextDouble();
        double ringField = Math.PI * (r2*r2 - r1*r1);

        System.out.println(ringField);

        in.close();
    }
}