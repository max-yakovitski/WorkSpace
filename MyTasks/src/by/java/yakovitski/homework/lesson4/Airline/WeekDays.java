package by.java.yakovitski.homework.lesson4.Airline;

public enum WeekDays {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY, 
	FRIDAY, 
	SATURDAY, 
	SUNDAY;
	
	public void findFlightForDay(FlightNumber [] flightNumbers) {
		for (int i = 0; i < flightNumbers.length; i++) {
			if (WeekDays.this == flightNumbers[i].getWeekDays()) {
			System.out.println(flightNumbers[i]);	
			}
		}
	}
	
	public void findFlightForDay(FlightNumber [] flightNumbers, int time) {
		for (int i = 0; i < flightNumbers.length; i++) {
			if (WeekDays.this == flightNumbers[i].getWeekDays() && time < flightNumbers[i].getDepartureTime().getTime()) {
			System.out.println(flightNumbers[i]);	
			}
		}
	}
}
