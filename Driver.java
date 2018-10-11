public class Driver{
  public static void main(String[] args) {
    Point a = new Point(1.0,2.0);
    Point b = new Point(3.0,4.0);
    Point c = new Point(1.0,5.0);
    Point d = new Point(9.0,2.0);
    Triangle abc = new Triangle(a,b,c);
    System.out.println(a.distanceTo(b));
    //System.out.println(distance(a,b));
    System.out.println(b.distanceTo(c));
    //System.out.println(distance(b,c));
    System.out.println(a);
    System.out.println(abc);
    System.out.println(abc.getPerimeter());
    System.out.println(abc.getVertex(2));
    abc.setVertex(0,d);
    System.out.println(abc);
    System.out.println(a);
  }
}
