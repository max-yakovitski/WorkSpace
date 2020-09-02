package lesson2;
public class Task12 {
	public static void main (String[] args)  {
		 int x = 5;
		 findSumOf3(x);
	}
	public static void findSumOf3 (int x) {
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum += i * 3; 
		}
		System.out.println(sum);
	}
}
