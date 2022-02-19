public class Problem4 {
    public static void main(String[] args) {
        /* Point must be within the circle 
         Angle of interest 45 degrees
         Find x and y and given angle and radius 5
         x = radius(cos 45)  y = radius(cos 45)*/

        

         double cos_sin_45 = (Math.pow(2,0.5)) / 2;
         double x,y;
         x = y =  Math.random() * 5 * cos_sin_45;


        // Indicator of negation of x and y values.
        double negator_indicator = Math.random();
       
        // First quadrant both x and y are positive.
        if (negator_indicator >= 0.25 || negator_indicator < 0.5){
            //Random point in second quadrant; where x is negated but y is positive
            x = x * -1.0;

        }
        else if (negator_indicator >= 0.5 || negator_indicator < 0.75){
            // Random point in third quadrant; x and y are negated 
            x = x * -1.0;
            y = y * -1.0;
        }
        else if (negator_indicator >= 0.75 || negator_indicator < 1) {
            // Random point in fourth quadrant; y is negated but x is positive
            y = y * -1.0;
        }
        else{
            // Both x and y are unchanged/positive.
        }
        

        // Apply distance formula to calculate distance of the random points and to the center (0,0).
        // Distance = sqroot of (x2 - x1)**2  + (y2 - y1)**2 where x1 and y1 = 0
        double distance = x - 0 * x - 0  + y - 0 + y - 0;
        distance = Math.pow(distance, 0.5);

        // Print results 
        System.out.println("The point is (" + x + ", " + y + ") and its distance to the center is " + distance);

        
    }
}