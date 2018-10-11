public class Point{
  private double x,y;
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public double distanceTo(Point p){
    return Math.sqrt(Math.pow(p.x - this.x,2) + Math.pow(p.y - this.y,2));
  }
  public double distance(Point a, Point b){
    return Math.sqrt(Math.pow(a.x - b.x,2) + Math.pow(a.y - b.y,2));
  }
  public String toString(){
    return "(" + x + "," + y + ")";
  }
}
