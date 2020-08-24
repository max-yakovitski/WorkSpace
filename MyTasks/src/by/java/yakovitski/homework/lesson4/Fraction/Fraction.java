package by.java.yakovitski.homework.lesson4.Fraction;

public class Fraction {

	private int numerator;
	private int denominator;
	
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}


	public double getNumerator() {
		return numerator;
	}


	public void setNumerator(int numerator) {
		if (numerator == 0) {
			System.out.println("Вся дробь равна нулю");
		}
		else {
			this.numerator = numerator;
		}
	}


	public double getDenominator() {
		return denominator;
	}


	public void setDenominator(int denominator) {
		if (denominator == 0) {
			System.out.println("Знаменатель не может быть равен нулю");
		}
		else {
			this.denominator = denominator;
		}
	}
	
	// сложение дробей
	
	public String toString() {
		return "Fraction = " + numerator + "/" + denominator;
	}


	public void add(Fraction fraction) {
		if (this.getDenominator() == fraction.getDenominator()) {
			double sumNumerator = this.getNumerator() + fraction.getNumerator();
			double result = sumNumerator/fraction.getDenominator();
			System.out.println(result);
		}
		else {
			double sumNumerator = this.getNumerator() * fraction.getDenominator() + fraction.getNumerator() * this.getDenominator();
			double sumDenominator = this.getDenominator() * fraction.getDenominator();
			double result = sumNumerator/sumDenominator;
			System.out.println(result);
		}
		
	}
	
	// вычитание дробей
	
	public void deduction (Fraction fraction) {
		if (this.getDenominator() == fraction.getDenominator()) {
			double sumNumerator = this.getNumerator() - fraction.getNumerator();
			double result = sumNumerator/fraction.getDenominator();
			System.out.println(result);
		}
		else {
			double sumNumerator = this.getNumerator() * fraction.getDenominator() - fraction.getNumerator() * this.getDenominator();
			double sumDenominator = this.getDenominator() * fraction.getDenominator();
			double result = sumNumerator/sumDenominator;
			System.out.println(result);
		}
		
	}
	
	// перемножение дробей
	
	public void multiply(Fraction fraction) {
			double multNumerator = this.getNumerator() * fraction.getNumerator();
			double multDenominator = this.getDenominator() * fraction.getDenominator();
			double result = multNumerator / multDenominator;
			System.out.println(result);
	}
	
	// деление дробей
	
	public void devide(Fraction fraction) {
		double multNumerator = this.getNumerator() / fraction.getNumerator();
		double multDenominator = this.getDenominator() / fraction.getDenominator();
		double result = multNumerator / multDenominator;
		System.out.println(result);
	}
	
}
