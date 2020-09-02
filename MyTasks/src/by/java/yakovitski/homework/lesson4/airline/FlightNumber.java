package by.java.yakovitski.homework.lesson4.airline;

public class FlightNumber {
	
	private String flightNumber;
	private Destination destination;
	private AircraftType aircraftType;
	private DepartureTime departureTime;
	private WeekDays weekDays;
	
	public FlightNumber(String flightNumber, Destination destination, AircraftType aircraftType, DepartureTime departureTime, WeekDays weekDays) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.weekDays = weekDays;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	
	public DepartureTime getDepartureTime() {
		return departureTime;
	}
	
	public void setDepartureTime(DepartureTime departureTime) {
		this.departureTime = departureTime;
	}

	public WeekDays getWeekDays() {
		return weekDays;
	}
	
	public String toString() {
		return "flight - " + flightNumber + ", destination - " + destination.getRuDestination() + ", aircraft - "
				+ aircraftType.getRuType() + ", departureTime - " + departureTime  + ", day - " + weekDays.getRuWeek();
	}
}
