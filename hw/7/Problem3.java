import java.util.Scanner;
//import Point;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // centroid of a triangle given three points.((x1 + x2 + x3)/3, (y1 + y2 + y3)/3)
        System.out.print("Enter x1,y1,x2,y2,x3,y3: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        Point point1 = new Point(x1,y1);
        Point point2 = new Point(x2,y2);
        Point point3 = new Point(x3,y3);

        // Store Point object method into a variable and print results.
        Point centerPoint = getCenterPoint(point1,point2,point3); 
        System.out.println("The center point is at (" + centerPoint.getX() + ", " + centerPoint.getY() + ") " );
        input.close();

    }
    public static Point getCenterPoint(Point p1, Point p2, Point p3) {
        double centerX; // coordinates for the new (center) point.
        double centerY;

        centerX = (p1.getX() + p2.getX() + p3.getX()) / 3;
        centerY = (p1.getY() + p2.getY() + p3.getY()) / 3;

        // New point (center)
        Point centerPointObject = new Point(centerX,centerY);

        return centerPointObject;



    }
}