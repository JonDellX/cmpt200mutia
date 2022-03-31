import java.util.Scanner;

class QuadraticEquation { // Implementation for objects class

    private double a;
    private double b;
    private double c;

    // public constructor
    QuadraticEquation(double a, double b , double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    } 

    public double getA(double a) { // returns user object's a value
        return a;
    }

    public double getB(double b) {
        return b;
    }

    public double getC(double c) {
        return c;
    }

    public double getDiscriminant() { // b*b - 4 * a * c
        return (int) b * b - 4 * a * c;
    }

    public double getRoot1() {  // −b+√b2−4ac / 2a
        if (getDiscriminant() < 0) {
            return 0;
        }
        else {
            return (-1 * b + Math.pow(b*b-4*a*c,0.5) )/ (2 * a);
        }
    }
    
    public double getRoot2() { // −b-√b2−4ac / 2a
        if (getDiscriminant() < 0) {
            return 0;
        }
        else {
            return  (-1 * b - Math.pow(b*b-4*a*c,0.5) )/ (2 * a);
        }
    }

}

public class Problem1 { 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // User input
        System.out.print("Enter values for a,b,c : "); 
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation QuadraticEquation_Object = new QuadraticEquation(a,b,c);
        if (QuadraticEquation_Object.getDiscriminant() == 0) {
            System.out.println("The two roots both equate to " + QuadraticEquation_Object.getRoot1()); // if discriminant is 0, then both roots are equal.
        }
        else if (QuadraticEquation_Object.getDiscriminant() > 0) { // if discriminant is positive, above 0, then execute/ output both roots (differentiated).
            System.out.printf("The value for root 1 is %f and the value for root 2 is %f", QuadraticEquation_Object.getRoot1(),QuadraticEquation_Object.getRoot2());
        }
        else { // the discriminant is negative and no roots will be shown
            System.out.println("The equation has no roots.");
        }
        input.close();
    }
}