import java.util.Scanner;

/* The method counts how many times a digit appears in the string. The return value is an array of
ten elements, each of which holds the count for a digit. For example, after executing int[] counts
= count("12203AB3"), counts[0] is 1, counts[1] is 1, counts[2] is 2, and counts[3] is 2. Write a
test program that prompts the user to enter a string and displays the number of occurrences of each
digit in the string.
Enter a string: 23231adbc1234
Digit 1 occurs 2 times
Digit 2 occurs 3 times
Digit 3 occurs 3 times
Digit 4 occurs 1 time
*/

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // User input.
        System.out.print("Enter a string: "); //23231adbc1234
        String str = input.nextLine();

        
        count(str); // changes contents in array
        
        // Print results
        for (int i = 0 ; i < count(str).length ; i++) {
            System.out.println("Digit " + i + " occurs " + count(str)[i] + " times.");
        }

    }
    public static int[] count(String s) {
        int[] occurances = new int[10]; // int array to accumulate digit values

        // loop to accumulate values, given digit in a string.
        for (int i = 0; i < s.length(); i++) {
            
            if (Character.isDigit(s.charAt(i))) {// Determines whether the character in the string is a digit -- static method from character class.
            
                int digit = (int)s.charAt(i) - '0'; // Returns the digit representation of the int of the digit minus the int of the '0'.
                
                occurances[digit] += 1;
            }

        }

        return occurances;


    }
}