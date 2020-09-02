package by.java.yakovitski.homework.lesson4.airline;

public enum Destination {
	NEWYORK("Нью Йорк"),
	MOSCOW ("Москва"),
	PARIS ("Париж"), 
	LONDON ("Лондон"), 
	FRANKFURT ("Франкфурт"), 
	TOKIO("Токио");
	
	private String ruWeek;

	private Destination(String ruWeek) {
		this.ruWeek = ruWeek;
	}

	public String getRuDestination() {
		return ruWeek;
	}
	
}