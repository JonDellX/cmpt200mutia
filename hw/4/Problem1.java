import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Area of polygon =  (n * s * s) / 4 * tan (pi/2)  --- n is number of sides ; s is the length size
        final double pi = Math.PI;
        
        // User input for number of sides and length of a specific side.
        System.out.print("Enter the number of sides:  ");
        double side_num = input.nextDouble();

        System.out.print("Enter the side length:  ");
        double side_length = input.nextDouble();

        // Calculate area of polygon given n sides and length of side from user input.
        double poly_area = (side_num *  side_length * side_length) / (4 * Math.tan(pi/side_num) );

        // Print results.
        System.out.println("The area of the polygon is: "  +  poly_area);
        input.close();




    }
}