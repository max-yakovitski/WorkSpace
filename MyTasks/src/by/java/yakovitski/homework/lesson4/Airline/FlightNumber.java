package by.java.yakovitski.homework.lesson4.Airline;

public class FlightNumber {
	int flightNumber;
	Destination destination;
	AircraftType aircraftType;
	DepartureTime departureTime;
	WeekDays weekDays;
	
	public FlightNumber(int flightNumber, Destination destination, AircraftType aircraftType, DepartureTime departureTime, WeekDays weekDays) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.weekDays = weekDays;
	}
	
	
	public Destination getDestination() {
		return destination;
	}
	
	
	
	public DepartureTime getDepartureTime() {
		return departureTime;
	}


	public WeekDays getWeekDays() {
		return weekDays;
	}


	public String toString() {
		return "flight - " + flightNumber + ", destination - " + destination + ", aircraft - "
				+ aircraftType + ", departureTime - " + departureTime  + ", day - " + weekDays;
	}




	
}
