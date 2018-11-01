package CLASSES.HW1;

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        while (num > 9){
            if (num % 10 < ((num / 10) % 10)){
                System.out.println("Не возрастающая");
                System.exit(0);
            }
            num /= 10;
        }
        
        System.out.println("Возрастающая");

        in.close();
    }
}