package CLASSES.HW2;
import java.util.*;

public class ex3v3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = Character.toUpperCase(in.next().charAt(0));

        String vowels = new String("AEIOU");
        
        if (vowels.indexOf(ch)==-1){
            System.out.println("Character is not vowel");
        }else{
            System.out.println("Character is vowel");
        }
        
        in.close();
    }
}