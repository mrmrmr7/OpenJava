package CLASSES.HW3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class olymp1 {
    public static void main(String[] args) {
        int sizeOfArr = 0;

        Scanner in = new Scanner(System.in);
        try {
            sizeOfArr = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong type");
        }        

        int arr[] = new int[sizeOfArr];
        
        for (int i = 0; i < sizeOfArr; i++) {
            try {
                arr[i] = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong data, we'll fill it by zero");
                arr[i] = 0;
            }
        }

        int sum = 0;

        while (sizeOfArr>0 && arr[--sizeOfArr] != 0)
            sum += arr[sizeOfArr];

        System.out.println(sum);
    }    
}