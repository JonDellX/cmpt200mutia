import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input for points in a two dimensional array.
        
        double[][] matrix = new double[6][2];  // 6 columns and 2 rows 2x2 array.
    
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("Enter " + " x value of point " + (i+1) + ":  "); // Gives user opportunity to enter first element of [i] before entering second element.
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
                System.out.print("Enter " +  " y value of point " + (i+1) + " :  "); // allows user to enter second element before j loop ends and before i iterates.
            }
        }

        /*
         A method for finding the area of any polygon when the coordinates of its vertices are known.
        which includes Area of convex polygon 
        
        (x1y2 - y1x2) +	(x2y3 −y2x3) ..... + (xny1 − ynx1 )  /  2
        
        */
        
        double area = 0; // accumulator for area
        for (int i = 1 ; i < 6; i++) { // accumulating values six times
            area += (matrix[(i-1)][0] * matrix[i][1]) - (matrix[i][0] * matrix[(i-1)][1]) ;
        }

        // print results
        area = area / 2;
        System.out.println(" " );
        System.out.println("The area is " + area);
        input.close();
    }
}