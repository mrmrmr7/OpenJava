import java.util.Scanner;

public class n1_2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи массу в киллограммах: ");
        double num = in.nextDouble();
        System.out.println("А теперь во что переводить: mg, gm, tn");
        char ch = in.next().charAt(0);
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
        in.close();
    }
}