package CLASSES.HW3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int sizeOfMass = 0;

        Scanner in = new Scanner(System.in);
        try {
            sizeOfMass = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong type");
        }

        int arrOfNum[] = new int[sizeOfMass];

        try{
            for (int i = 0; i < sizeOfMass; i++) 
                arrOfNum[i] = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong type, we'll make array of zeros");
            for (int i = 0; i < sizeOfMass; i++) 
                arrOfNum[i] = 0;
        }

        int numOfFirstPositive = 0;

        while (arrOfNum[numOfFirstPositive] < 1) 
            numOfFirstPositive++;
        
        int sum = 0;

        for (int i = numOfFirstPositive; i < sizeOfMass; i++) 
            sum += arrOfNum[i];
        
        System.out.println(sum);
    }
}