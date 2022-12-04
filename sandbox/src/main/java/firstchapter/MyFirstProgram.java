package firstchapter;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");

        Square s = new Square(5);
        System.out.println(s.area());

        Rectangle r = new Rectangle(5, 2);
        System.out.println(r.areaRectangle());

        Point p1 = new Point(5, -3);
        Point p2 = new Point(0, 0);
        System.out.println(Point.distance(p1,p2));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }
}