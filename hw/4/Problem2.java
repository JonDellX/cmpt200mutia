import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = Math.PI;
        //User input for number of sides and radius.
        // S = r * Arc length in radians.

        System.out.print("Enter the number of sides: ");
        int sides = input.nextInt();
        System.out.print("Enter the radius (positive) of the bounding circle: ");
        int radius = input.nextInt();

        System.out.printf("( %d , %c ) \n", radius, '0');

        // loop to display coordinates.
        double x;
        double y;
        for (int i = 1; i < sides; i++) {
            x =  radius * Math.cos(2*PI / sides * i);
            y = radius * Math.sin(2*PI / sides * i);
            System.out.printf("( %.1f , %.1f ) \n", x , y);
        }
    }
}