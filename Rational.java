public class Rational{
	private int num;  //Instance Variables because they are linked
	private int den; //to the instance of the class. There is only one copy.
	//The private variables are variables that can only be accessed from within the class
	//itself. They cannot be accessed from other classes. It is therefore useful to use
	//setters and getters to be able to interact with these variables. It is important to 
	//make your instance variables private in your homework and exams. 
	// setters, getters, plus, plus2, gcd, reduce, reduce2, equals, toString, compareTo
	
	public Rational (){
		num = 0;
		den = 1;
	}
	public Rational (int numerator, int denominator){
		num = numerator;
		den = denominator;

		int g = gcd(numerator, denominator);
        num = numerator   / g;
        den = denominator / g;

        // only needed for negative numbers
        if (den < 0) { den = -den; num = -num; }
	}
	public int getNumerator(){
		return numerator;
	}
	public int getDenominator(){
		return denominator;
	}
	public setNumerator(int numerator){
		num = numerator;
	}
	public setDenominator(int denominator){
		den = denominator;
	}
	// return (this + b)
    public Rational plus(Rational b) {
        int numerator   = (this.num * b.den) + (this.den * b.num);
        int denominator = this.den * b.den;
        return new Rational(numerator, denominator);
    }
    public Rational plus2(Rational b, Rational c){
    	int numerator = (this.num *)
    }
	private int gcd (int numerator, int denominator){
		int n;
		while (denominator !=0){
			n = numerator % denominator;
			numerator = denominator;
			denominator = n;
		}
		return numerator;
	}
	public String toString(){
		return num + "/" + den;
	}
	public boolean equals (Rational o){
		Rational a = this;
		
		if ()
	}
	public int compareTo(Rational b) {
        Rational a = this;
        int lhs = a.num * b.den;
        int rhs = a.den * b.num;
        if (lhs < rhs) return -1;
        if (lhs > rhs) return +1;
        return 0;
    }
}