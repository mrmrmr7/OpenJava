package CLASSES.HW1;

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        int num = 0;
        boolean isIncremental = true;
        
        Scanner in = new Scanner(System.in);
        try {
            num = in.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong type");
        }
        in.close();

        while (num > 9){
            if (num % 10 < ((num / 10) % 10)){
                isIncremental = false;
                num = -1;
            }
            num /= 10;
        }
        
        System.out.println(isIncremental ? "Возрастающая" : "Не возрастающая");
    }
}