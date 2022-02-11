import java.util.Scanner;

public class Problem1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // pi as a constant
        final double pi = 3.1415926;

        // User input for radius
        System.out.print("Enter the radius of a circle: ");
        double radius = input.nextDouble();

        // Calculate diameter given radius -- 2 * radius
        double diameter = 2 * radius;
        System.out.println("The diameter is " + diameter);

        //calculate area within two decimal places
        double area  = pi * radius * radius;
        double area_initial = area * 100.00;
        double area_final= (int)area_initial / 100.00;

        //Area result based on radius and pi.
        System.out.println("The area is " + area_final);
        input.close();

        


    }
}