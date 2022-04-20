
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a binary string: ");
        String binaryString = input.next();
        binToDec(binaryString);
        input.close();
    }
    public static void binToDec (String binaryString) throws NumberFormatException{
        try {
        for(int i = binaryString.length() - 1; i >=0  ; i--){ // loop to throw exception if condition is true.
        if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') { // if the string enters characters other than 0 and 1, throw exception.
            throw new NumberFormatException();
            
        }
    }
    }
        catch (NumberFormatException ex) {
            System.out.println("Not a binary number. ");
            System.exit(1);
        }

        int decimalNumber = 0; // decimal accumulator
        int square = 0; // binary reads from right to left, the power(square)
 // increments and the base is always 2.        

        for (int i = binaryString.length() -1; i >= 0; i--) {
            
            if (binaryString.charAt(i) == '1') { //if the binary is value 1, execute 2 to the power of the square value.
                decimalNumber += Math.pow(2, square) ;
            }
            square++; //increments for every binary element.
            
            
        }  
        //print results.
        System.out.println("The decimal number is " + decimalNumber);

    }
}