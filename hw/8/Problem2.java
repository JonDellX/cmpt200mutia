import java.util.Scanner;
import java.util.ArrayList;

// JA: It misses some of the elements
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input for the number of objects
        System.out.print("Enter the amount of objects: ");
        int objectsNum = input.nextInt();
        
        ArrayList<Integer> weights = new ArrayList<>();
        // User input for weights of objects using a loop.
        System.out.println("Enter the weights of the objects: ");  // 7 5 2 3 5 8
        for(int i = 0; i < objectsNum; i++) { 
            int objectWeight = input.nextInt();
            weights.add(objectWeight);
        }
        java.util.Collections.sort(weights); // sort the weights from low to high
        
        int containerNumber = 0;
        int beginIndex = 0; // beginning of weight array
        int endIndex = weights.size() - 1; // end of weight array
       
        while (true) {  
            if (weights.get(beginIndex) + weights.get(endIndex) == 10) { 
                System.out.println("Container " + ++containerNumber + " has weights " + weights.get(beginIndex) + " " + weights.get(endIndex));
                endIndex--;
                if (endIndex <= beginIndex || endIndex == 0 || beginIndex == weights.size()- 1) {
                    break;
                }
            }
            beginIndex++;


        }  
        input.close();
    }
}