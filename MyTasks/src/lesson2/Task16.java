package lesson2;
public class Task16 {

	public static void main(String[] args) {
		int[] array = {2, 7, 4, 6, 3, 1, 9, 5, 8, 10};
		findSum(array);

	}
	
	public static void findSum (int[] array) {
		int min = array[0];
		int counterMin = 0;
		for (int i = 0; i < array.length; i++) {
				
				if (array[i] < min) {
					min = array[i];
					counterMin = i;
				}

			}

		
		int max = array[0];
		int counterMax = 0;
		for (int j = 0; j < array.length; j++) {
					
				if (array[j] > max) {
						max = array[j];	
						counterMax = j;
			}

		}

		
		int counterStart = 0;
		int counterEnd = 0;
		
		if (counterMin < counterMax) {
			counterStart = counterMin;
			counterEnd = counterMax;
		}
		else {
			counterStart = counterMax;
			counterEnd = counterMin;
		}
		
		int sum = 0;
		for (int i =  counterStart + 1; i < counterEnd; i++) {
			sum += array[i];
		}
		System.out.println(sum);
		
	}
	
}