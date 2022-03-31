import java.util.Scanner;
import Point;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input for object parameters
        System.out.print("Enter x1,y1,x2,y2,x3,y3,x4,y4 : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

     
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

       
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Object creation as point objects
        Point point1 = new Point(x1,y1);
        Point point2 = new Point(x2,y2);
        Point point3 = new Point(x3,y3);
        Point point4 = new Point(x4,y4);

        Point intersectingPoint = getIntersectPoint(point1,point2,point3,point4); // reference point
        //print results
        if ( intersectingPoint == null) {
            System.out.println("The two lines are parallel. ");
        }
        else{
            System.out.printf("The center point is at (%f,%f)",intersectingPoint.getX(),intersectingPoint.getY());
        }

        input.close();
        

        

    }
    public static Point getIntersectPoint(Point p1, Point p2, Point p3, Point p4) {
        double a = p1.getY() - p2.getY(); // (y1 - y2)
        double b = p1.getX() - p2.getX(); // (x1 - x2)
        double c = p3.getY() - p4.getY(); // (y3 - y4)
        double d = p3.getX() - p4.getX(); // (x3 - x4)

        double e = a * p1.getX() - b * p1.getY(); // (a)*x1 - (b)*y1
        double f = c * p3.getX() - d * p3.getY(); // (c)*x3 - (d)*y3
        
        double parallel = a*d - b*c;
        double x = (e * d - b * f) / parallel;
        double y = (a * f - e * c) / parallel;

        // Point creation
        Point centerPoint = new Point(x,y);

        if ((int)parallel == 0) {
            return null;
        }
        else
            return centerPoint;

    }

 }