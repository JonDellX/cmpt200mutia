import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input for digit as a long
        System.out.print("Enter a digit: "); // 234
        long digit = input.nextLong();
        System.out.printf("The product of the digit is %d\n",  multiplyDigits(digit));

    }
    public static int multiplyDigits(long n) {
        // loop through the digit to access individual numbers.
        double  product = 1; // The accumulation of the product.
        double operand; // represents digit at end of number

        // conversion to string and string length
        String num_string = "";
        num_string += n;

        for (int i =0 ; i < num_string.length() ; i++) {
            operand = n % 10;
            product *= operand;
            n = n/10; // Loses last digit of number each iteration.
        }
        return (int)product;
        
    }
}





