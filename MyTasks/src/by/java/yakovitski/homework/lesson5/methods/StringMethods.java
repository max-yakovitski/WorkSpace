package by.java.yakovitski.homework.lesson5.methods;

public class StringMethods {

	public static void main(String[] args) {

		String [] array = new String [5];
		
		array[0] = "Max";
		array[1] = "xam";
		array[2] = "Mikhail";
		array[3] = "Mom";
		array[4] = "Marty";
		
		System.out.println(StringService.findBigString(array));
		System.out.println(StringService.findPalindrome(array[0],array[1]));
		
		String testString = "Баранкин, ты бяка и ещё раз бяка!";
		System.out.println(StringService.censureText(testString, "бяка", "душка"));
		
		String string1 = "мяч";
		String string2 = "Мама купила мне мяч на день рожденья мяч на НГ";
		System.out.println(StringService.findMatches(string2, string1));
		
		String ipString = "37.214.255.231";
		System.out.println(StringService.isIp(ipString));
		
	}
}
