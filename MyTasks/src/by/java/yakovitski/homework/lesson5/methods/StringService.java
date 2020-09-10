package by.java.yakovitski.homework.lesson5.methods;

public class StringService {
	
	public static String findBigString(String[] strings) {
		int stringLength = 0;
		int index = 0;
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].length() > stringLength) {
				stringLength = strings[i].length();
				index = i;
			}
		}
		return strings[index];
	}
	
	public static String findPalindrome(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			int middle = 0;
			char[] wordArr = strings[i].toLowerCase().toCharArray();
			for (int j = 0; j < wordArr.length - j - 1; j++) {
				if (wordArr[j] == wordArr[wordArr.length - j - 1]) {
					middle++;
				}
			}
			if (middle >= strings[i].length() / 2) {
				return strings[i] + " - полиндром";	
			}
		}
		return "Полиндромов не найдено";
	}
	
	public static String censureText (String strings) {
		String[] badWords = new String[] {"бука", "бяка"};
		String[] newStrings = strings.split("[\\s]");
		for (int i = 0; i < newStrings.length; i++) {
			if (newStrings[i].equalsIgnoreCase(badWords[0]) || newStrings[i].equalsIgnoreCase(badWords[1])) {
				newStrings[i] = "[вырезано цензурой]";
			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < newStrings.length; i++) {
			stringBuilder.append(newStrings[i] + " ");
		}
		return stringBuilder.toString();
	}
	
	public static int findMatches (String input, String line) {
		int index = line.split(input).length - 1;
		return index;
	}
	
	public static boolean isIp (String string) {
		if (string == null) {
			return false;
		}
		String [] strings = string.split("\\.");
		
		if (strings.length != 4) {
			return false;
		}
		for (String str: strings) {
			try {
				int value = Integer.parseInt(str);
				if (value < 0 || value > 255) {
				return false;
				}
			}
			catch (Exception e) {
				System.out.println("Ошибка! Строка не является числом");
			}
		}
		return true;
	}
}
