import java.util.Random;

// Вывод последовательности простых чисел до введенной границы. 

public class additionalTask1 {

	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(100);
		
		System.out.println("Генерируемая граница для чисел - " + x);
		
		findSimpleNumbersTill(x);// TODO Auto-generated method stub

	}
	
	public static void findSimpleNumbersTill (int x) {
		if (x == 0 || x == 1) {
			System.out.println("Число: " + x + " - не является ни простым, ни составным");
		}
		else {
			for (int i = 2; i <= x; i++) {
				int counter = 0;
				
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						counter++;
						break;
					}
					if (counter > 0) {
						break;
					}
				}
				if (counter == 0) {
					
					System.out.print(i + ", ");
				}
			}
		}
	}

}
