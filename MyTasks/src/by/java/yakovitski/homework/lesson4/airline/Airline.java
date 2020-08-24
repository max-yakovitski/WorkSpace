package by.java.yakovitski.homework.lesson4.Airline;

public class Airline  {
	
	public static void main(String[] args) {
		
		FlightNumber [] flightNumbers = new FlightNumber [10];
		
		flightNumbers[0] = new FlightNumber(245, Destination.FRANKFURT, AircraftType.AIRBUS, new DepartureTime(19), WeekDays.FRIDAY);
		flightNumbers[1] = new FlightNumber(346, Destination.FRANKFURT, AircraftType.BOEING,new DepartureTime(21),WeekDays.SATURDAY);
		flightNumbers[2] = new FlightNumber(456, Destination.MOSCOW, AircraftType.AIRBUS,new DepartureTime(12),WeekDays.TUESDAY);
		flightNumbers[3] = new FlightNumber(534, Destination.NEWYORK, AircraftType.BOEING,new DepartureTime(6),WeekDays.SUNDAY);
		flightNumbers[4] = new FlightNumber(621, Destination.MOSCOW, AircraftType.AIRBUS,new DepartureTime(10),WeekDays.MONDAY);
		flightNumbers[5] = new FlightNumber(661, Destination.PARIS, AircraftType.AIRBUS,new DepartureTime(20),WeekDays.MONDAY);
		flightNumbers[6] = new FlightNumber(712, Destination.TOKIO, AircraftType.BOEING,new DepartureTime(21),WeekDays.TUESDAY);
		flightNumbers[7] = new FlightNumber(945, Destination.LONDON, AircraftType.BOEING,new DepartureTime(22),WeekDays.TUESDAY);
		flightNumbers[8] = new FlightNumber(333, Destination.NEWYORK, AircraftType.BOEING,new DepartureTime(5),WeekDays.WEDNESDAY);
		flightNumbers[9] = new FlightNumber(333, Destination.NEWYORK, AircraftType.AIRBUS,new DepartureTime(2),WeekDays.THURSDAY);
		
//		Destination.FRANKFURT.findFlightForDestination(flightNumbers);
//		WeekDays.MONDAY.findFlightForDay(flightNumbers);
		WeekDays.TUESDAY.findFlightForDay(flightNumbers, 20);
	}
	
}