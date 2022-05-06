import java.util.Scanner;
import Complex;

public class Project5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double complex1real = input.nextDouble();
        double complex1Imageinary = input.nextDouble();

        Complex complexNumberObj1 = new Complex(complex1real,complex1Imageinary);

        System.out.print("Enter the second complex number: ");
        double complex2real = input.nextDouble();
        double complex2Imageinary = input.nextDouble();

        Complex complexNumberObj2 = new Complex(complex2real,complex2Imageinary);

        // print results 

        // addition of complex numbers
        System.out.println(complexNumberObj1.toString() + " + " + complexNumberObj2.toString() + " = " + (complexNumberObj1.add(complexNumberObj2).toString()));
        
        //subtraction of complex numbers
        System.out.println(complexNumberObj1.toString() + " - " + complexNumberObj2.toString() + " = " + (complexNumberObj1.subtract(complexNumberObj2).toString()));
        
        // multiplication of complex numbers
        System.out.println(complexNumberObj1.toString() + " * " + complexNumberObj2.toString() + " = " + (complexNumberObj1.multiply(complexNumberObj2).toString()));
        
        // division of complex numbers
        System.out.println(complexNumberObj1.toString() + " / " + complexNumberObj2.toString() + " = " + (complexNumberObj1.divide(complexNumberObj2).toString()));
 
        // absolute value of complex numbers of first complex number
        System.out.println("|" + complexNumberObj1.toString() + "|"  + " = " + complexNumberObj1.abs());
       
        input.close();

       
    }
}