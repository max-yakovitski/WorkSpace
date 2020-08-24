package by.java.yakovitski.homework.lesson4.Fraction;

public class Test {
	

	public static void main(String[] args) {
		
		Fraction fraction [] = new Fraction [10];
		for (int i = 0; i < fraction.length; i++) { // заполняем массив рандомными дробями
			
			int random1 = (int) (1 + Math.random() * 5); // числитель от 1 до 5
			int random2 = (int) (1 + Math.random() * 10);// знаменатель от 1 до 10
			
			fraction[i] = new Fraction (random1, random2);
//			System.out.println(fraction[i].toString());
		}
		
		new Test().changeArr(fraction);
	}
	
	public void changeArr (Fraction fraction []) {
		for (int i = 0; i < fraction.length; i++) {
			if (i % 2 == 0) {
				fraction[i].add(fraction[i + 1]);
			}
		}
	}

}
