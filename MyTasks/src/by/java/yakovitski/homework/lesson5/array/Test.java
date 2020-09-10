package by.java.yakovitski.homework.lesson5;

public class Test {

	public static void main(String[] args) {

		Array array = new Array(new String [] {"Max", "Denis", "Alisa", "Maria"});
		System.out.println(array.getLength());
		System.out.println(array.getElement(3));
//		array.removeAllElements();
		System.out.println(array.getLength());
		System.out.println(array);
		array.addElement("Asya");
		System.out.println(array);
	}

}
