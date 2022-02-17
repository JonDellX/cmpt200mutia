import java.util.Scanner;


public class Problem1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // User input for a,b,c
        System.out.print("Enter a,b,c:  ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();


        // Discriminant formula and root equations
        double discriminant = b * b - 4 * a * c;
        double discriminant_squared = Math.pow(discriminant, 0.5);
        double r1 = ((-1 * b + discriminant_squared) / 2 * a);
        double r2 = ((-1 * b - discriminant_squared) / 2 * a);

        // Selections
        if (discriminant < 0){
            System.out.println("The equation has no roots.");
        }
        else if (discriminant > 0){
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }
        else{
            System.out.println("The equation has one root." + r1);
           }

        input.close();

        
    }
}