package CLASSES.HW2;

import java.util.*;

public class ex3v2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = false;

        char ch = Character.toUpperCase(in.next().charAt(0));

        char arrayOfChar[] = {'A','E','I','O','U'};

        for(byte i = 0; i < 5; i++)
            if(ch == arrayOfChar[i])
                flag = true;
        
        if(flag){
            System.out.println("Character is vowel");
        }else{
            System.out.println("Character is not vowel");
        }

        in.close();
    }
}