package by.java.Yakovitski.HomeWork.lesson3;

public class Foursquare implements Figure { // наследование и полиморфизм

	private int length;
	private int width;
	
	
	
	public Foursquare(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public static void main(String[] args) {
		
		Figure foursquare = new Foursquare(10, 10);
		foursquare.getSquare();
		
	}

	@Override
	public void getSquare() {
		System.out.println("Площадь квадрата = " + length * width + " м2");// TODO Auto-generated method stub
		
	}

}
