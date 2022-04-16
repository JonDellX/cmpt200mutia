import java.util.Scanner;
import java.util.ArrayList;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // User input for String and delimiters.

        System.out.print("Enter string: ");
        String s = input.nextLine();


        System.out.print("Enter delimeters: ");
        String delim = input.nextLine();

        for (int i = 0; i < split(s,delim).size(); i++) { // Prints substrings of removed delimeters and separated with a space.
            System.out.print(split(s,delim).get(i));
        }
        input.close();
    }
    public static ArrayList<String> split(String s, String delimiters) {
        
        
        // Array list class -- loop and array add method to add s characters.
        ArrayList<String> mutableString = new ArrayList<>();

        for (int i = 0 ;i< s.length(); i++) { // loop to add characters into  a "mutable" array.
            mutableString.add(s.charAt(i) + "");
        }

        //delimiter array
        ArrayList<String> delimiterArray = new ArrayList<>();
        
        for (int i = 0 ;i< delimiters.length(); i++) { // loop to add characters into  a "mutable" array.
            delimiterArray.add(delimiters.charAt(i) + "");
        }

        // Nested for loop to remove delimeters
        for (int i = 0; i < delimiters.length(); i++) {
            for (int j = 0 ; j < s.length(); j++) {
                if (mutableString.get(j).equals(delimiterArray.get(i))) {
                    mutableString.set(j, " ");
                }
            }
        }

        
        return mutableString; // returns the array with delimeters removed.
    }
}