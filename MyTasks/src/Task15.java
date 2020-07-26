import java.util.Arrays;
import java.util.Random;

public class Task15 {
	public  static void main (String[] args) {
		int[] array = new int[10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}
		System.out.println(Arrays.toString(array));
		mirrorSort(array);
	}
	
	public static void mirrorSort (int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int tmp = array[i];	
			array[i] = array[array.length - 1 -  i];
			array[array.length -1 - i] = tmp;
		
			}

		System.out.println(Arrays.toString(array));
	}
	
}
