package CLASSES.HW2;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        double dist12, dist23, dist31;
        dist31 = p3.distanceTo(p1);
        dist12 = p1.distanceTo(p2);
        dist23 = p2.distanceTo(p3);
        if((dist12 + dist31 > dist23) || (dist12 + dist23 > dist31) || (dist31 + dist23 > dist12)){
            System.out.println("Треугольник невозможен");
        }
        if(Point.pifagor(dist12, dist23) == dist31 || Point.pifagor(dist12, dist31) == dist23 || Point.pifagor(dist31, dist23) == dist12){
            System.out.println("Прямоугольный");
        }
        else{
            System.out.println("Не прямоугольный");
        }
    }
}

class Point{
    public int x;
    public int y;
    Point(){
        x=0;
        y=0;
    }
    public double distanceTo(Point _a){
        double res = Math.pow(Math.pow(_a.x - this.x,2) + Math.pow(_a.y - this.y,2), 1./2.);
        return res;
    }
    public static double pifagor(double d1, double d2){
        return Math.sqrt(Math.pow(d1,2) + Math.pow(d2,2));
    }
}