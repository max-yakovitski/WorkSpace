package by.java.yakovitski.homework.lesson5.methods;

import java.util.regex.Pattern;
import java.util.regex.Matcher;;

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
	
	public static String findPalindrome(String one, String two) {
		StringBuilder builder = new StringBuilder(two);
		builder.reverse();
		if (one.equalsIgnoreCase(builder.toString())) {
			return "слова являются полиндромами";
		}
		else {
			return "слова не вляются полиндромами";
		}
	}
	
	public static String censureText (String string, String badWord, String censure) {
        Pattern pattern = Pattern.compile(badWord);
        Matcher matcher = pattern.matcher(string);
        return matcher.replaceAll(censure);
    }
	
	public static int findMatches (String line, String find) {
		Pattern pattern = Pattern.compile(find);
        Matcher matcher = pattern.matcher(line);
        int count = 0;
        while (matcher.find()) {
			count++;
		}
        return count;
	}
	
	public static boolean isIp (String string) {
		if (string == null) {
			return false;
		}
		Pattern pattern = Pattern.compile("([0-9]{1,3}[\\.]){3}[0-9]{1,3}");
		Matcher matcher = pattern.matcher(string);
		return matcher.find();
	}
}
