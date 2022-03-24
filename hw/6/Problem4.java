import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input for a,b,c,d
        System.out.print("Enter a, b, c, d: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        

        double[][] matrix = new double[2][2]; // 2x2 array creation
        matrix[0][0] = a;
        matrix[0][1] = b;   // Element assignment.
        matrix[1][0] = c;
        matrix[1][1] = d;
        // Matrix creation
        

        
        if (inverse(matrix) == null){ // if the method returns null, there is no inverse matrix
            System.out.println("No inverse matrix. "); 
        }
        else{
            
        for (int i = 0 ; i < matrix.length ; i++) {
            System.out.println(" ");
            for (int j = 0 ; j < matrix[0].length ; j++){
                System.out.print(matrix[i][j] + " " );
            }
        }
    }
       
        
    }
    public static double[][] inverse(double[][] A) {
        
       
        boolean eqNull = ((A[0][0] * A[1][1]) - (A[0][1] * A[1][0])) == 0;  // equvalent to AD - BC in denominator
        if (eqNull) { // if the denominator is 0, it returns null.
            return null;
        }
        double eq = 1 / ((A[0][0] * A[1][1]) - (A[0][1] * A[1][0])); // Equation used times the elements in the matrix.
        
        

        
        double temp = A[0][0];
        A[0][0] = temp;
        A[0][0] = A[1][1] * eq;   // Substitution to switch elements in an array.
        A[1][1] = temp * eq;
        A[0][1] *= -eq;            // element is negated -1.
        A[1][0] *= -eq;

        return A; // returns changed matrix.

    }
}