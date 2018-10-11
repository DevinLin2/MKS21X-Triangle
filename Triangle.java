public class Triangle{
  private Point a;
  private Point b;
  private Point c;
  public Triangle(Point x, Point y, Point z){
    a = x;
    b = y;
    c = z;
  }
  public Triangle(double x1,double y1,double x2,double y2,double x3,double y3){
    a = new Point(x1 , y1);
    b = new Point(x2 , y2);
    c = new Point(x3 , y3);
  }
  public double getPerimeter(){
    return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
  }
  public Point getVertex(int index){
    if (index == 0){
      return a;
    }
    if (index == 1){
      return b;
    }
    return c;
  }
  public String toString(){
    return "Triangle: " + "a: " + a + "b: " + b + "c: " + c;
  }
  public void setVertex(int index, Point p){
    if (index == 0){
      a = p;
    }
    if (index == 1){
      b = p;
    }
    c = p;
  }
}
