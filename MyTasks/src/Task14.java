
public class Task14 {

	public static void main(String[] args) {
		int[] array = {2, 7, 4, 6, 3, 1, 9, 5, 10, 8};
		findMin(array);
		findMax(array);
	}
	public static void findMin (int[] array) {
		int min = array[0];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
				
				if (array[i] < min) {
					min = array[i];
					index = i;
				}
			}
		System.out.println("Минимальная оценка: " + min + " индекс в массиве: " + index);

		}
	
	
	public static void findMax (int[] array) {
		int max = array[0];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
				
				if (array[i] > max) {
					max = array[i];
					index = i;
				}

			}
		System.out.println("Максимальная оценка: " + max + " индекс в массиве: " + index);

		}

}
