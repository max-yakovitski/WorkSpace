package by.java.yakovitski.homework.lesson3;

public class Circle implements Figure { // наследование и полиморфизм

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
		Figure circle = new Circle(10);
		circle.printSquare();
		System.out.println(circle.getSquere());
		
	}

	public void printSquare() {
		System.out.println("Площадь круга = " + this.getSquere() + " м2");
		
	}
	
	public double getSquere() {
		final double Pi = 3.1415926536;
		return Math.pow(radius, 2) * Pi;
	}

}
