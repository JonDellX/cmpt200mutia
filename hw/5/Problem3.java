import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // User input for string
        System.out.print("Enter a string: "); // london england 2015
        String user_str = input.nextLine();
        user_str = user_str.trim(); // Remove whitespace
    
        String str_upp =  " "; // append string to empty whitespace for decision/selection checks.
        str_upp += user_str;

        // Print results 
        System.out.println("The new string is " + title(str_upp));
    }
    public static String title(String s) {
        String title = ""; // append final string here
        String uppercase = ""; // append char and use upper function here.

        for (int i = 1 ; i < s.length() ; i++) {
            if (s.charAt(i-1) == ' ') {
                uppercase += s.charAt(i); // If char is after empty char; convert to upper string
                title += uppercase.toUpperCase(); //use uppercase string method and append that to the result var.
                uppercase = ""; // reset upper case value
            }
            else {
                title += s.charAt(i); // Otherwise, append that char to the result var.
            }
        }
        return title;
    }
}