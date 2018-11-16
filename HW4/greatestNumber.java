package CLASSES.HW4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class greatestNumber {

    public static void main(String[] args) {
        int s;
        int countOfNumeral = 0;
        int Numeral = 2;
        int step = -1;

        Scanner in = new Scanner(System.in);
        try {
            s = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong type, we'll fill it 1");
            s = 1;
        }
        in.close();
        
        countOfNumeral = s / 3 * 2;

        if (s % 3 != 0) {
            countOfNumeral++;
            if (s % 3 == 1) {
                Numeral = 1;
                step = 1;
            } else {
                Numeral = 2;
                step = -1;
            }
        }

        int arr[] = new int[countOfNumeral];

        for (int i = 0; i < countOfNumeral; i++) {
            arr[i] = Numeral;
            Numeral += step;
            step *= -1;
            System.out.print(arr[i]);
        }

        System.out.println();
    }
}