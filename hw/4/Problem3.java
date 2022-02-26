import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Substring indicators
        final String ATG = "ATG";
        final String TAG = "TAG";
       
      
        // Invalid substrings
        final String CASE1 = "ATG";
        final String CASE2 = "TAG";
        final String CASE3 = "TAA";
        final String CASE4 = "TGA";
        
        //User input for genome string.
        System.out.print("Enter a genome string: ");
        String genome = input.nextLine();

       
        int start = -1;
         // Selections to see if a gene is present.
        if (!genome.contains(ATG) && !genome.contains(TAG)){
            System.out.println("No gene is found.");
        }
        // Computes Results
        for (int i = 0; i < genome.length() - 2; i++) {
            // Checks triplets throughout the genome for a gene
            String triplet = genome.substring(i, i + 3);
            // Identifies starting point
            if (triplet.equals("ATG")) {
                start = i + 3;
            } else if (((triplet.equals(CASE1)) || (triplet.equals(CASE2)) || (triplet.equals(CASE3) || (triplet.equals(CASE4))))) {
                // Checks if gene length is a multiple of 3 & ends before any of the above
                String gene = genome.substring(start, i);
                if (gene.length() % 3 == 0) {
                    
                    System.out.println(gene);
                    start = -1;
                }
            }
        }
        
        input.close();
    }
}