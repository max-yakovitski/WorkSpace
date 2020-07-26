package lesson2;
import java.util.Random;

//Вывод последовательности чисел Фибоначчи до веденной границы.

public class additionalTask2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int x = random.nextInt(100);
		System.out.println("Генерируемая граница для чисел - " + x);
		
		findFibonacciNumbers(x);
	}
	public static void findFibonacciNumbers(int x) {
		int fib1 = 0;
		int fib2 = 1;
		System.out.print(fib1 + ", ");
		
		while (fib2 < x) {
			int tmp = fib2;
			fib2 = fib1 + fib2;
			fib1 = tmp;
			System.out.print(fib1 + ", ");
		}
	}

}
