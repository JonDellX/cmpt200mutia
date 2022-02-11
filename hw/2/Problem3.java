import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Acceration for gravity is constant at 9.81 meters per second.
        final double ACCElERATION_GRAVITY = 9.81;

        // User input for force, mass, and accerlation of object
        System.out.print("Enter the friction force in Newtons: ");
        double newtons = input.nextDouble();

        System.out.print("Enter the object's mass in kg: ");
        double mass = input.nextDouble();

        System.out.print("Enter the objects acceleration in m/s*s: ");
        double obj_acc = input.nextDouble();

        // Print results
        double friction_coefficient = (newtons - mass * obj_acc) / (mass * ACCElERATION_GRAVITY);
        System.out.println("The coefficient for friction is: " + friction_coefficient);
        input.close();

    }
}