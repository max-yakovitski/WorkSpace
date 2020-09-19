package by.java.yakovitski.homework.lesson4.airline;

public enum WeekDays {
	MONDAY("Понедельник"),
	TUESDAY("Вторник"),
	WEDNESDAY("Среда"),
	THURSDAY("Четверг"), 
	FRIDAY("Пятница"), 
	SATURDAY("Суббота"), 
	SUNDAY("Воскременье");
	
	private String ruWeek;

	private WeekDays(String ruWeek) {
		this.ruWeek = ruWeek;
	}

	public String getRuWeek() {
		return ruWeek;
	}
}
