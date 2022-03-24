
/* (Count single digits) Write a program that generates 100 random integers betweeen 0 and 9 and displays
the count for each number. (Hint: Use an array of 10 integers, say counts, to store the counts for the
numbers of 0s, 1s, ..., 9s.)
*/
public class Problem1 {
    public static void main(String[] args) {
        
        // Construct array of ten integers to get count
        int[] count = new int[10];

        
        // loop to generate 100 times
        
        int random_num = 0;
    
        for (int i = 0; i < 100; i++){
            
            random_num = (int)(Math.random() * 10) ; // numbers between 0-9
            count[random_num] += 1;
        }
        for (int j = 0 ; j < 10 ; j++) {
            System.out.println("there are " + count[j] + " " + j + "\s");
        }
    }
    
}
