package by.java.yakovitski.homework.lesson5.methods;

public class StringMethods {

	public static void main(String[] args) {

		String [] array = new String [5];
		
		array[0] = "Max";
		array[1] = "Sasha";
		array[2] = "Mikhail";
		array[3] = "Mom";
		array[4] = "Marty";
		
		System.out.println(StringService.findBigString(array));
		System.out.println(StringService.findPalindrome(array));
		
		String testString = "Баранкин, ты бяка !";
		System.out.println(StringService.censureText(testString));
		
		String string1 = "мяч";
		String string2 = "Мама купила мне мяч на день рожденья мяч на НГ";
		System.out.println(StringService.findMatches(string1, string2));
		
		String ipString = "37.214.255.231";
		System.out.println(StringService.isIp(ipString));
		
	}
}
