package firstchapter;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");

    Square s = new Square(5);
    System.out.println(s.area());

    Rectangle r = new Rectangle(5, 2);
    System.out.println(r.areaRectangle());
  }

  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }


}