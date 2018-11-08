package CLASSES.HW1;

import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        double num = 0.0D;
        char ch = ' ';
        
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введи массу в киллограммах: ");
            num = in.nextDouble();
            System.out.println("А теперь во что переводить: mg, gm, tn");
            ch = in.next().charAt(0);
        } catch (InputMismatchException e) {
            System.out.println("Wrong type");
        }
        in.close();
        
        switch (Character.toUpperCase(ch)) {
            case 'M':
                System.out.println("В миллиграммах: " + num * 1_000_000);
                break;
            case 'G':
                System.out.println("В граммах: " + num * 1_000);
                break;
            case 'T':
                System.out.println("В тоннах: " + num / 1_000);
                break;
            default:
                System.out.println("Введены неверные данные");
                break;
        }
    }
}
