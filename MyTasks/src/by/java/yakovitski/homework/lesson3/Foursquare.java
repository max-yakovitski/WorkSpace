package by.java.yakovitski.homework.lesson3;

public class Foursquare implements Figure { // наследование и полиморфизм

	private int length;
	private int width;
	
	public Foursquare(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public static void main(String[] args) {
		
		Figure foursquare = new Foursquare(10, 10);
		foursquare.printSquare();
		System.out.println(foursquare.getSquere());
		
	}

	public void printSquare() {
		System.out.println("Площадь квадрата = " + this.getSquere()+ " м2");
		
	}

	public double getSquere() {
		return length * width;
	}

}
