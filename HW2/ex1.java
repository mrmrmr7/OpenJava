package CLASSES.HW2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Point p1 = new Point(in.nextInt(), in.nextInt());
        Point p2 = new Point(in.nextInt(), in.nextInt());
        Point p3 = new Point(in.nextInt(), in.nextInt());
        in.close();
        
        if (((p1.disTo(p2) + p3.disTo(p1) - p2.disTo(p3)) > 1e-4) || 
            ((p1.disTo(p2) + p2.disTo(p3) - p3.disTo(p1)) > 1e-4) ||
            ((p3.disTo(p1) + p2.disTo(p3) - p1.disTo(p2)) > 1e-4)) {
            System.out.println("Треугольник невозможен");
        } else if (Point.pifagor(p1.disTo(p2), p2.disTo(p3)) == p3.disTo(p1) || 
                   Point.pifagor(p1.disTo(p2), p3.disTo(p1)) == p2.disTo(p3) || 
                   Point.pifagor(p3.disTo(p1), p2.disTo(p3)) == p1.disTo(p2)) {
            System.out.println("Прямоугольный");
        } else {
            System.out.println("Не прямоугольный");
        }
    }
}

class Point {
    public int x;
    public int y;

    Point() {
        this(0,0);
    }

    Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public double disTo(Point _a) {
        double res = Math.pow(Math.pow(_a.x - this.x,2) + Math.pow(_a.y - this.y,2), 1./2.);
        return res;
    }
    
    public static double pifagor(double d1, double d2) {
        return Math.sqrt(Math.pow(d1,2) + Math.pow(d2,2));
    }
}
