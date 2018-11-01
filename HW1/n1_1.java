package CLASSES.HW1;

public class n1_1{
    public static void main(String[] arg) {
        for(int i = 0; i < 10; i++)
            System.out.println("\n");

        int i = 3;
        int i2 = i;
        Integer a = i2;
        Integer b = i;
        Integer c = i;

        if (a == b && b == c){
            System.out.println("они одинаковые");
        }
        else{
            System.out.println("они разные");
        }
    }
}