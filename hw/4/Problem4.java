import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input for a positive intger.
        System.out.print("Enter a positive integer: ");
        int pos_num = input.nextInt();

        int i = 1;
        int k; // Determines power of 2 for all numbers untril the user input
        int gcd = 1; // Initialize greatest common square root of a number
         
        while ( i < pos_num) {   
            k = (int)Math.pow(i,2);
            if (pos_num % k == 0) { // If the user's number is divisible by the square number
                gcd = k;
            }   
            i++;
        }

        // Selections based on the gcd -- greatest common divisor that is a sqr.
        if (gcd == 1) {
            System.out.printf("Sqrt(%d) is Sqrt(%d)\n",pos_num,pos_num);
        }
        else if( gcd == pos_num) {
            System.out.printf("Sqrt(%d) is %d\n", pos_num , (int)Math.sqrt(pos_num));
        }
        else{
            System.out.printf("Sqrt(%d) is %d*sqrt(%d)\n",pos_num,(int)Math.sqrt(gcd),(int)(pos_num / gcd));    
        }
        input.close();
    }
}