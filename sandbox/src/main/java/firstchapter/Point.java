package firstchapter;

import static java.lang.Math.pow;

public class Point {

        public double x;
        public double y;

    public Point(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public static double distance(Point p1, Point p2) {
        double a = p1.x - p2.x;
        double b = p1.y - p2.y;

        return Math.sqrt(pow(a,2) + pow(b,2));
    }
}