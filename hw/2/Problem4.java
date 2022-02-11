
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //User input for minutes as double.
        System.out.print("Enter the number of minutes: ");
        double min = input.nextDouble();

        // Conversion from minutes to hours and hours to days
        double hour = min / 60.0;
        double day = hour / 24.0;

        // Conversion from days to years and remaining days.
        int year = (int)day / 365;
        int day_remaining = (int)day % 365;
        System.out.println(min + " minutes is approximately " + year + " years and " + day_remaining + " days.");
        input.close();


        
    }
}
