class Complex extends Number implements Comparable<Complex>,Cloneable{
    private double a; // Real part
    private double b; // Imaginary part

    public Complex(double a,double b){ // Constructor #1 with real and imaginary values
        this.a = a;
        this.b = b;
    }

    public Complex(){ // Constructor #2 : default constructor with real and imaginary values are 0.
        a = 0;
        b = 0;
    }

    public Complex(double a){ // Constructor #3:  Only real value; no imaginary part.
        this.a = a;
        this.b = 0;
    }

    // getter methods for real and imaginary numbers
    public double getRealPart(){
        return a;
    }

    public double getImaginaryPart(){
        return b;
    }


    // toString overridden to display complex number.
    public String toString(){
        if (b==0){
            return a + "";
        }
        return a + " + " + b + "i";
    }


    // Add, subtract, mulltiply, divide current Complex object and other Complex object; based on Rational class
    public Complex add(Complex o){
        double addA = a + o.getRealPart();
        double addB = b + o.getImaginaryPart();
        return new Complex(addA,addB);
    }
    
    public Complex subtract(Complex o){
        double subtractA = a - o.getRealPart();
        double subtractB = b - o.getImaginaryPart();
        return new Complex(subtractA,subtractB);
    }

    public Complex multiply(Complex o){
        double multiplyA = (a * o.getRealPart()) - (b * o.getImaginaryPart());
        double multiplyB = (b * o.getRealPart()) + (a * o.getImaginaryPart());
        return new Complex(multiplyA,multiplyB);
    }

    public Complex divide(Complex o){
        
        
        double divideA = (a * o.getRealPart() + b * o.getImaginaryPart()) / (o.getRealPart() * o.getRealPart() + o.getImaginaryPart() * o.getImaginaryPart());
        double divideB = (b * o.getRealPart() - a * o.getImaginaryPart()) / (o.getRealPart() * o.getRealPart() + o.getImaginaryPart() * o.getImaginaryPart());
        return new Complex(divideA,divideB);
    }

    public double abs(){
        return Math.sqrt((a*a) + (b*b));
    }



    public double getComplexValue(){ // for comparable; to get real number, add the conjugate.
        return getRealPart() + getRealPart(); // imaginary values are cancelled and real values are added.
    }

@Override
    public int compareTo(Complex o){
    if (abs() > o.abs()){
        return 1;
    }
    else if (abs() < o.abs()){
        return -1;
    }
    else{
        return 0;
    }
}

@Override
    public Complex clone(){
    try {
        return super.clone();
    }
    catch (CloneNotSupportedException ex){
        System.out.println(ex.getStackTrace());
    }
}
}