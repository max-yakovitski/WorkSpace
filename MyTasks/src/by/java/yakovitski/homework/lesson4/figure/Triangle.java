package by.java.yakovitski.homework.lesson4.figure;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	
	
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
	
	public boolean getExistence() {
		if (getSideA() < getSideB() + getSideC() && getSideB() < getSideA() + getSideC() && getSideC() < getSideA() + getSideB()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void addToTriangleArr(Triangle triangles [], int x) {
		if (x < triangles.length && x >= 0) {
			if (this.getExistence()) {
				triangles[x] = this;
			}
			else {
				System.out.println("Треугольник не может быть добавлен в массив, так не прошёл проверку на существование. Добавьте другой треугольник");
			}
		}
		else {
			System.out.println("Вы ввели номер элемента за пределами массива");
		}
	}
	
	public double getPerimeter() {
		return getSideA() + getSideB() + getSideC();
	}
	
	public double getSquare() {
		double p = getPerimeter() / 2;
		return Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
	}
	
	public boolean checkRegularTriangle() {
		if (getSideA() == getSideB() && getSideB() == getSideC()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean checkIsoscelesTriangle() {
		if (getSideA() == getSideB() || getSideA() == getSideC() || getSideC() == getSideB()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean checkRectangularTriangle() {
		if (Math.pow(getSideA(), 2) == Math.pow(getSideB(), 2) + Math.pow(getSideC(), 2) || Math.pow(getSideB(), 2) == Math.pow(getSideA(), 2) + Math.pow(getSideC(), 2) || Math.pow(getSideC(), 2) == Math.pow(getSideA(), 2) + Math.pow(getSideB(), 2)) {
			return true;
		}
		else {
			return false;
		}
	}
}
