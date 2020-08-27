package by.java.yakovitski.homework.lesson4.figure;

public class Test {

	public static void main(String[] args) {
		Triangle triangle [] = new Triangle [4];
		
		triangle[0] = new Triangle(5, 5, 5); //равносторонний
		triangle[1] = new Triangle(7, 7, 6); //равнобедренный
		triangle[2] = new Triangle(5, 4, Math.sqrt(Math.pow(5, 2) + Math.pow(4, 2))); //прямоугольный
		triangle[3] = new Triangle(4, 5, 6); //произвольный
		
		new Test().checkTriangleArr(triangle);
		new Test().findMaxPerimeter(triangle);
		new Test().findMinPerimeter(triangle);
		new Test().findMaxSquare(triangle);
		new Test().findMinSquare(triangle);
	}
	
	public void checkTriangleArr (Triangle triangle []) {
		int countRegular = 0;
		int countIsosceles = 0;
		int countRectangular = 0;
		int countFree = 0;
		
		for (int i = 0; i < triangle.length; i++) {
			if (triangle[i].getSideA() == triangle[i].getSideB() && triangle[i].getSideB() == triangle[i].getSideC()) {
				countRegular++;
			}
			else if (triangle[i].getSideA() == triangle[i].getSideB() || triangle[i].getSideA() == triangle[i].getSideC() || triangle[i].getSideC() == triangle[i].getSideB()) {
				countIsosceles++;
			}
			else if (triangle[i].checkRectangularTriangle() == true) {
				countRectangular++;
			}
			else {
				countFree++;
			}
		}
		
		System.out.println("Равносторонних = " + countRegular + ", равнобедренных = " + countIsosceles + ", прямоугольных = " + countRectangular + ", остальных = " + countFree);
	}
	
	public void findMaxPerimeter(Triangle triangle []) {
		int index = 0;
		for (int i = 0; i < triangle.length; i++) {
			if (triangle[i].getPerimeter() > triangle[0].getPerimeter()) {
				triangle[0] = triangle[i];
				index = i;

			}
		}
		System.out.println("Самый большой периметр в массиве  у треугольника c индексом = " + index);
	}
	
	public void findMinPerimeter(Triangle triangle []) {
		int index = 0;
		for (int i = 0; i < triangle.length; i++) {
			if (triangle[i].getPerimeter() < triangle[0].getPerimeter()) {
				triangle[0] = triangle[i];
				index = i;

			}
		}
		System.out.println("Самый маленький периметр в массиве у треугольника c индексом = " + index);
	}
	
	public void findMaxSquare(Triangle triangle []) { //периметр привязан к площади - можно не использовать, ведь чем больше периметр тем больше площадь
		int index = 0;
		for (int i = 0; i < triangle.length; i++) {
			if (triangle[i].getSquare() > triangle[0].getSquare()) {
				triangle[0] = triangle[i];
				index = i;

			}
		}
		System.out.println("Самая большая площадь в массиве  у треугольника c индексом = " + index);
	}
	
	public void findMinSquare(Triangle triangle []) { //периметр привязан к площади - можно не использовать, ведь чем больше периметр тем больше площадь
		int index = 0;
		for (int i = 0; i < triangle.length; i++) {
			if (triangle[i].getSquare() < triangle[0].getSquare()) {
				triangle[0] = triangle[i];
				index = i;

			}
		}
		System.out.println("Самая маленькая площадь в массиве  у треугольника c индексом = " + index);
	}
}
