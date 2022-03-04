import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        // User input for the amount of seconds
        System.out.print("Enter the amount of seconds: ");  // 342324
        long sec = input.nextLong();

        // print result
        System.out.println(format(sec));
        input.close();

        
    }
    public static String format(long seconds) {
       
        long min = seconds / 60;
        long hr = min / 60;

        // Strings
        String hr_str = "";
        String min_str = "";
        String sec_str = "";
        String time = ""; // Final result
    
        
        while (hr >= 24) { // Hour format
            hr = hr - 24; // subtract hour total to satisfy 24 hour format.
        }
        
        if (hr < 10) {
            hr_str += "0" + hr; // zero paded if needed
        }
        else {
            hr_str += hr;
        }
        
        while (min >= 60) { // minute format
            min = min - 60;
        }
        
        if (min < 10) {
            min_str += "0" + min;
        }
        else {
            min_str += min;
        }

    
        while (seconds >= 60) { // second format
            seconds = seconds - 60;
        }
        
        if (seconds < 10) {
            sec_str += "0" + seconds;
        }
        else {
            sec_str += seconds;
        }
       
        time += hr_str + ":" + min_str + ":" + sec_str; // appending time format result
        return time;

       

    }
}