import java.util.Scanner;

/* Given two integers I and J, I modulo J is the remainder when dividing I by J. For example, the numbers
7, 14, 27 and 38 become 1, 2, 0 and 2, modulo 3. Write a program that accepts 10 numbers as input and
outputs the number of distinct numbers in the input, if the numbers are considered modulo 42
*/


public class Project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
    
        // User input for int values as an array

        int[] arrDistinct = new int[10]; // User array creation.
        System.out.print("Enter 10 non-negative integers: "); 
        
        for (int i = 0 ; i < arrDistinct.length; i++) {
            arrDistinct[i] = input.nextInt();  // User input elements accumulate onto arr.
        }
        
        // print results
        System.out.println("There are " + arrDistinctCount(arrDistinct) + " distinct numbers"); // Method returns count as int.
        input.close();

    }

    // Method to find distinct numbers; var 'arrDistinct' is passed onto formal parameter 'arr'.
    public static int arrDistinctCount (int[] arr) {
        
        int modulo;
        for (int i = 0 ; i < arr.length ; i++) {
            modulo = arr[i] % 42; // After modulo declaration, each element is modulus 42.
            arr[i] = modulo; // modulo result appended to array
        }
         
        
        java.util.Arrays.sort(arr); // Use of java's sort method from least to greatest; used to find distinct numbers.
        
        int count = 1; // Distinct values always start at 1, increments using loop and selections
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] != arr[i-1]) { // If the current element is not equal to last element, they are distinct.
                count++; // Count increments 1.
            }
        }
        return count;
    }
    
}