import java.util.Scanner;
import java.util.ArrayList;

public class Problem1 {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0 ; i < 100; i++) {
            intArray.add((int)(100 * Math.random())); // generates random integer from 100.
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter index of array: "); // user input for element.
        int index = input.nextInt();

        try {
            // User enters index for element value less than 100.
        System.out.println("The element content of the specified index is " + intArray.get(index)); 
        }

        catch (IndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds!");
        }
        input.close();
     }
}
