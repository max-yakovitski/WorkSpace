package by.java.yakovitski.homework.lesson4.airline;

public class FlightService {

	public static FlightNumber findFlightForDestination(Destination destination, FlightNumber [] flightNumbers) {
		for (int i = 0; i < flightNumbers.length; i++) {
			if (destination == flightNumbers[i].getDestination()) {
			return flightNumbers[i];	
			}
		}
		return null;
	}
	
	public static FlightNumber findFlightForDay(WeekDays weekDays, FlightNumber [] flightNumbers) {
		for (int i = 0; i < flightNumbers.length; i++) {
			if (weekDays == flightNumbers[i].getWeekDays()) {
			return flightNumbers[i];	
			}
		}
		return null;
	}
	
	public static FlightNumber findFlightForDay(WeekDays weekDays, FlightNumber [] flightNumbers, int hours) {
		for (int i = 0; i < flightNumbers.length; i++) {
			if (weekDays == flightNumbers[i].getWeekDays() && hours < flightNumbers[i].getDepartureTime().getHours()) {
			return flightNumbers[i];	
			}
		}
		return null;
	}
}
