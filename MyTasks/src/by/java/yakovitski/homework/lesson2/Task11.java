package lesson2;
public class Task11 {

	public static void main(String[] args) {
		int x = 101;
		checkNumber(x);
		
	}
	public static void checkNumber(int x) {
		if (x == 0 || x == 1) {
			System.out.println("Число: " + x + " - не является ни простым, ни составным");
		}
		else {
			int counter = 0;
			for (int i = 2; i <= Math.sqrt(x) ; i++) {
				if (x % i == 0) {
					counter++;
					break;
				}

			}
			if (counter > 0) {
				System.out.println("Число " + x + " составное");
			}
			else {
				System.out.println("Число " + x + " простое");
			}
		}
		
	}

}
