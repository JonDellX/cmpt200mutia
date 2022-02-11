import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Acceration for gravity is constant of 9.81 meters per second.
        final double ACCElERATION = 9.81;

        // User input for time in seconds.
        System.out.print("Enter the time in seconds: ");
        double time = input.nextDouble();

        // Initial velocity is 0 since it has not been released.
        int vel_initial = 0;

        /*  perform calculations for distance given time, 
        accerlation, and initial velocity
        */
        
        double distance = vel_initial * time + ACCElERATION * time * time / 2.0;

        // print results
        System.out.println("The height of the building is: " + distance);
        input.close();


    }
}