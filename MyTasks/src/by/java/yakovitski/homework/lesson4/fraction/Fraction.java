package by.java.yakovitski.homework.lesson4.fraction;

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


	public double add(Fraction fraction) {
			double sumNumerator = this.getNumerator() * fraction.getDenominator() + fraction.getNumerator() * this.getDenominator();
			double sumDenominator = this.getDenominator() * fraction.getDenominator();
			double result = sumNumerator/sumDenominator;
			return result;
	}
	
	// вычитание дробей
	
	public double deduction (Fraction fraction) {
			double sumNumerator = this.getNumerator() * fraction.getDenominator() - fraction.getNumerator() * this.getDenominator();
			double sumDenominator = this.getDenominator() * fraction.getDenominator();
			double result = sumNumerator/sumDenominator;
			return result;
	}
	
	// перемножение дробей
	
	public double multiply(Fraction fraction) {
			double multNumerator = this.getNumerator() * fraction.getNumerator();
			double multDenominator = this.getDenominator() * fraction.getDenominator();
			double result = multNumerator / multDenominator;
			return result;
	}
	
	// деление дробей
	
	public double devide(Fraction fraction) {
		double multNumerator = this.getNumerator() / fraction.getNumerator();
		double multDenominator = this.getDenominator() / fraction.getDenominator();
		double result = multNumerator / multDenominator;
		return result;
	}
	
}
