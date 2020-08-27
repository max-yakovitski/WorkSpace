package by.java.yakovitski.homework.lesson4.figure;

public class Triangle {
	double sideA;
	double sideB;
	double sideC;
	
	
	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}


	public double getSideA() {
		return sideA;
	}


	public void setSideA(double sideA) {
		this.sideA = sideA;
	}


	public double getSideB() {
		return sideB;
	}


	public void setSideB(double sideB) {
		this.sideB = sideB;
	}


	public double getSideC() {
		return sideC;
	}


	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	public double getPerimeter() {
		return getSideA() + getSideB() + getSideC();
	}
	
	public double getSquare() {
		double p = getPerimeter() / 2;
		return Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
	}
	
	public boolean checkRectangularTriangle() {
		if (Math.pow(sideA, 2) == Math.pow(sideB, 2) + Math.pow(sideC, 2) || Math.pow(sideB, 2) == Math.pow(sideA, 2) + Math.pow(sideC, 2) || Math.pow(sideC, 2) == Math.pow(sideA, 2) + Math.pow(sideB, 2)) {
			return true;
		}
		else {
			return false;
		}
	}
}
