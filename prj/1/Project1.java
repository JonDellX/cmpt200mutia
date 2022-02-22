import java.util.Scanner;
/* Problem description: For the equation of T, which is the mean of two numbers, 
solve for one of the integers given T and the other integer */

public class Project1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Equation T = (s1 + s2) / 2
        // User input for s1 and T
        System.out.print("Enter values for s1 and T separated by a space.: ");
        int s1_value = input.nextInt();
        int t_value = input.nextInt();
        

        // Solve for s2
        // T * 2 = s1 + s2 ------> (T * 2) - s1
        int s2 = 2 * t_value - s1_value;

        // output s2 result
        System.out.println(s2);
        input.close();

    }
}