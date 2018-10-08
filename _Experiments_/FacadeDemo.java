package _Experiments_;
import static java.lang.Double.*;
import static java.lang.Math.*;
import static java.lang.Math.sin;
import static java.lang.System.out;
// 1. Subsystem
class PointCartesian
{
    private double x, y;
    public PointCartesian(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    public void move(int x,int y)
    {
        this.x+=x;
        this.y+=y;
    }
    public String toString()
    {
        return "("+x+","+y+")";
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
}
// 1. Subsystem
class PointPolar
{
    private double radius, angle;
    public PointPolar(double radius,double angle)
    {
        this.radius=radius;
        this.angle=angle;
    }
    public void rotate(int angle)
    {
        this.angle+=angle%360;
    }
    public String toString()
    {
        return "["+radius+"@"+angle+"]";
    }
}
// 1. Desired interface: move(), rotate()
class Point
{
    // 2. Design a "wrapper" class
    private PointCartesian pointCartesian;
    public Point(double x,double y)
    {
        pointCartesian=new PointCartesian(x,y);
    }
    public String toString()
    {
        return pointCartesian.toString();
    }
    // 4. Wrapper maps
    public void move(int x,int y)
    {
        pointCartesian.move(x,y);
    }
    public void rotate(int ϴ,Point p)
    {
        double x=pointCartesian.getX()-p.pointCartesian.getX();
        double y=pointCartesian.getY()-p.pointCartesian.getY();
        PointPolar pointPolar=new PointPolar(sqrt(x*x+y*y),atan2(y,x)*180/PI);
        // 4. Wrapper maps
        pointPolar.rotate(ϴ);
        out.println("  PointPolar is "+pointPolar);
        String str=pointPolar.toString();
        int i=str.indexOf('@');
        double r=parseDouble(str.substring(1,i));
        double a=parseDouble(str.substring(i+1,str.length()-1));
        pointCartesian=new PointCartesian(r*cos(a*PI/180)+p.pointCartesian.getX(),
                                          r*sin(a*PI/180)+p.pointCartesian.getY());
    }
}
class Line
{
    private Point o, e;
    public Line(Point ori,Point end)
    {
        o=ori;
        e=end;
    }
    public void move(int x,int y)
    {
        o.move(x,y);
        e.move(x,y);
    }
    public void rotate(int angle)
    {
        e.rotate(angle,o);
    }
    public String toString()
    {
        return "origin is "+o+", end is "+e;
    }
}
public class FacadeDemo
{
    public static void main(String[] args)
    {
        // 3. Client uses the Facade
        Line lineA=new Line(new Point(2,4),new Point(5,7));
        lineA.move(-2,-4);
        out.println("after move:  "+lineA);
        lineA.rotate(45);
        out.println("after rotate: "+lineA);
        Line lineB=new Line(new Point(2,1),new Point(2.866,1.5));
        lineB.rotate(30);
        out.println("30 degrees to 60 degrees: "+lineB);
    }
}