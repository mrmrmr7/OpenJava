package CLASSES.HW2;
import java.util.InputMismatchException;
import java.util.*;

public class ex3v3 {
    public static void main(String[] args) {
        String vowels = new String("AEIOU");
        char ch = ' ';

        Scanner in = new Scanner(System.in);
        try { 
            ch = Character.toUpperCase(in.next().charAt(0));
        } catch (InputMismatchException e) {
            System.out.println("Wrong type");
        }
        in.close();
        
        System.out.println(vowels.indexOf(ch)==-1 ? "Character is not vowel" : "Character is vowel");
    }
}