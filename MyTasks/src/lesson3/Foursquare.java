package lesson3;

public class Foursquare implements Figure { // наследование и полиморфизм

	private int length;
	private int width;
	
	
	
	public Foursquare(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public static void main(String[] args) {
		Foursquare foursquare = new Foursquare(5, 5);
		foursquare.getSquare();
		
		Figure figure = new Foursquare(10, 10);
		figure.getSquare();
		
		Figure figure2 = new Circle(10);
		figure2.getSquare();

	}

	@Override
	public void getSquare() {
		System.out.println("Площадь квадрата = " + length * width + " м2");// TODO Auto-generated method stub
		
	}

}
