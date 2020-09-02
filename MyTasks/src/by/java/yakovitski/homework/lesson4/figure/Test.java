package by.java.yakovitski.homework.lesson4.figure;

public class Test {

	public static void main(String[] args) {
		
		Triangle triangle1 = new Triangle(5, 5, 5); //равносторонний
		Triangle triangle2 = new Triangle(7, 7, 6); //равнобедренный
		Triangle triangle3 = new Triangle(5, 4, Math.sqrt(Math.pow(5, 2) + Math.pow(4, 2))); //прямоугольный
		Triangle triangle4 = new Triangle(4, 5, 6); //произвольный
		
		Triangle triangles [] = new Triangle [4];
		
		triangle1.addToTriangleArr(triangles, 0);
		triangle2.addToTriangleArr(triangles, 1);
		triangle3.addToTriangleArr(triangles, 2);
		triangle4.addToTriangleArr(triangles, 3);
		
		
		new Test().checkTriangleArr(triangles);
		new Test().findMaxPerimeter(triangles);
		new Test().findMinPerimeter(triangles);
		new Test().findMaxSquare(triangles);
		new Test().findMinSquare(triangles);
	}
	
	public void checkTriangleArr (Triangle triangle []) {
		int countRegular = 0;
		int countIsosceles = 0;
		int countRectangular = 0;
		int countFree = 0;
		
		for (int i = 0; i < triangle.length; i++) {
			if (triangle[i].checkRegularTriangle()) {
				countRegular++;
			}
			else if (triangle[i].checkIsoscelesTriangle()) {
				countIsosceles++;
			}
			else if (triangle[i].checkRectangularTriangle()) {
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
