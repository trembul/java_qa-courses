package firstchapter;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");

    double len = 3.5;
    System.out.println(area(len));

    double x = 12;
    double y = 4.9;
    System.out.println(areaRectangle(x,y));
  }

  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double l){
    return l * l;
  }

  public static double areaRectangle(double x, double y){
    return x * y;
  }
}