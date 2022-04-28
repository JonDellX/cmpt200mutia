import java.util.Scanner;


public class Problem3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input for rational numbers 1 and 2.
        System.out.print("Enter first rational number: ");
        String userR1 = input.nextLine();
        System.out.print("Enter second rational number: ");
        String userR2 = input.nextLine();

        // parseRationalNumber returns new object from string -- > numerators and denominators.
        Rational r1 = Rational.parseRationalNumber(userR1);
        Rational r2 = Rational.parseRationalNumber(userR2);

        // print results based on to string and add methods from Rational.
        System.out.print(r1.toString() + " + " + r2.toString() + " = " + r2.add(r1) + "\n");
  
        input.close();

    }

  
    


static class Rational extends Number implements Comparable<Rational>,Cloneable{
    // Data fields for numerator and denominator
    private  long numerator = 0;
    private  long denominator = 1;
  
    /** Construct a rational with default properties */
    public Rational() {
      this(0, 1);
    }
  
    /** Construct a rational with specified numerator and denominator */
    public Rational(long numerator, long denominator) {
      long gcd = gcd(numerator, denominator);
      this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
      this.denominator = Math.abs(denominator) / gcd;
    }
  
    /** Find GCD of two numbers */
    private static long gcd(long n, long d) {
      long n1 = Math.abs(n);
      long n2 = Math.abs(d);
      int gcd = 1;
      
      for (int k = 1; k <= n1 && k <= n2; k++) {
        if (n1 % k == 0 && n2 % k == 0) 
          gcd = k;
      }
  
      return gcd;
    }
  
    /** Return numerator */
    public long getNumerator() {
      return numerator;
    }
  
    /** Return denominator */
    public long getDenominator() {
      return denominator;
    }
  
    /** Add a rational number to this rational */
    public Rational add(Rational secondRational) {
      long n = numerator * secondRational.getDenominator() +
        denominator * secondRational.getNumerator();
      long d = denominator * secondRational.getDenominator();
      return new Rational(n, d);
    }
  
    /** Subtract a rational number from this rational */
    public Rational subtract(Rational secondRational) {
      long n = numerator * secondRational.getDenominator()
        - denominator * secondRational.getNumerator();
      long d = denominator * secondRational.getDenominator();
      return new Rational(n, d);
    }
  
    /** Multiply a rational number to this rational */
    public Rational multiply(Rational secondRational) {
      long n = numerator * secondRational.getNumerator();
      long d = denominator * secondRational.getDenominator();
      return new Rational(n, d);
    }
  
    /** Divide a rational number from this rational */
    public Rational divide(Rational secondRational) {
      long n = numerator * secondRational.getDenominator();
      long d = denominator * secondRational.numerator;
      return new Rational(n, d);
    }
  
    @Override // Override toString()
    public String toString() {
      if (denominator == 1)
        return numerator + "";
      else
        return numerator + "/" + denominator;
    }
  
    @Override // Override the equals method in the Object class 
    public boolean equals(Object other) {
      if ((this.subtract((Rational)(other))).getNumerator() == 0)
        return true;
      else
        return false;
    }
  
    @Override // Implement the abstract intValue method in Number 
    public int intValue() {
      return (int)doubleValue();
    }
  
    @Override // Implement the abstract floatValue method in Number 
    public float floatValue() {
      return (float)doubleValue();
    }
  
    @Override // Implement the doubleValue method in Number 
    public double doubleValue() {
      return numerator * 1.0 / denominator;
    }
  
    @Override // Implement the abstract longValue method in Number
    public long longValue() {
      return (long)doubleValue();
    }
  
    @Override // Implement the compareTo method in Comparable
    public int compareTo(Rational o) {
      if (this.subtract(o).getNumerator() > 0)
        return 1;
      else if (this.subtract(o).getNumerator() < 0)
        return -1;
      else
        return 0;
    }

    public static Rational parseRationalNumber(String s){
        
        String numerator;
        String denominator;
        
        if (s.contains("/")){ // if the number is fractional
            numerator = (s.substring(0,s.indexOf('/'))).trim(); // represents the first number as string, before '/'.
            denominator = (s.substring(s.indexOf('/')+1,s.length())).trim(); // represents the second number of string, after '/'.
            

             // use Wrapper pharse string method.

        }
        else{
            denominator = "1"; // denominator is always 1
            numerator = s.trim(); // numerator represents full number.
        }
        return new Rational(Long.parseLong(numerator),Long.parseLong(denominator));

        
    }

    
  }
}
  