package lesson3;

public class Circle implements Figure { // наследование и полиморфизм

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		circle.getSquare();
	}

	@Override
	public void getSquare() {
		final double Pi = 3.1415926536;
		System.out.println("Площадь круга = " + Math.pow(radius, 2) * Pi + " м2");// TODO Auto-generated method stub
		
	}

}
