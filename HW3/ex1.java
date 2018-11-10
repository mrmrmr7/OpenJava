package CLASSES.HW3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int n = 0;
        double x = 0.0D;
        double sum = 0.0D;
        int minusOne = 1;

        Scanner in = new Scanner(System.in);
        try {
            x = in.nextDouble();
            n = in.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong type");
        }
        in.close();

        for (int i = 1; i < n; i++) {
            sum += (minusOne * Math.cos(i * x) / (i * i));
            minusOne *= -1;
        }
        
        System.out.println(sum);
    }
}