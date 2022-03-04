import java.util.Scanner;

/* Problem description:
in order to convert decimal to binary, 
you must take each digit of the number and find the remainder of 0 or 1. */

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        // User input for positive integer.
        System.out.print("Enter an integer: "); // 1451
        int pos_num = input.nextInt();
        
        
        // Print results
        System.out.println("The binary value is: " + decimalToBinary(pos_num));
        
        input.close();
    }
    public static String decimalToBinary(int value) {
        String binary_str = ""; // Accumulate binary values here
        
         do {
            if (value % 2 == 0) {
                binary_str += 0; // if divisble by 2 then binary value is 0, otherwise 1 ; then accumulates values.
            }
            else {
                binary_str += 1;
            }
            value = value / 2; //  Integer division to shorten number and gather all possible binary values.

         } while (value != 0);

         // for loop to reverse string since since binary is read from right to left.
         String binary_str_reversed = "";
         for (int i = binary_str.length() - 1; i >= 0; i--) {
             binary_str_reversed += binary_str.charAt(i); // reverse iteration/ decrement from string length.
         }
         return binary_str_reversed;
        
        
    }

}