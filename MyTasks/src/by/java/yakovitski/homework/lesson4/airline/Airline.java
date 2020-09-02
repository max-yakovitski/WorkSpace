package by.java.yakovitski.homework.lesson4.airline;

public class Airline  {
	
	public static void main(String[] args) {
		
		FlightNumber [] flightNumbers = new FlightNumber [10];
		
		flightNumbers[0] = new FlightNumber("B245", Destination.FRANKFURT, AircraftType.AIRBUS, new DepartureTime(19), WeekDays.FRIDAY);
		flightNumbers[1] = new FlightNumber("FC346", Destination.FRANKFURT, AircraftType.BOEING,new DepartureTime(21),WeekDays.SATURDAY);
		flightNumbers[2] = new FlightNumber("B456", Destination.MOSCOW, AircraftType.AIRBUS,new DepartureTime(12),WeekDays.TUESDAY);
		flightNumbers[3] = new FlightNumber("MN534", Destination.NEWYORK, AircraftType.BOEING,new DepartureTime(6),WeekDays.SUNDAY);
		flightNumbers[4] = new FlightNumber("K621", Destination.MOSCOW, AircraftType.AIRBUS,new DepartureTime(10),WeekDays.MONDAY);
		flightNumbers[5] = new FlightNumber("TR661", Destination.PARIS, AircraftType.AIRBUS,new DepartureTime(20),WeekDays.MONDAY);
		flightNumbers[6] = new FlightNumber("EN712", Destination.TOKIO, AircraftType.BOEING,new DepartureTime(21),WeekDays.TUESDAY);
		flightNumbers[7] = new FlightNumber("YU945", Destination.LONDON, AircraftType.BOEING,new DepartureTime(24),WeekDays.TUESDAY);
		flightNumbers[8] = new FlightNumber("N333", Destination.NEWYORK, AircraftType.BOEING,new DepartureTime(5),WeekDays.WEDNESDAY);
		flightNumbers[9] = new FlightNumber("SU338", Destination.NEWYORK, AircraftType.AIRBUS,new DepartureTime(2),WeekDays.THURSDAY);
		
		System.out.println(FlightService.findFlightForDestination(Destination.FRANKFURT, flightNumbers));
		System.out.println(FlightService.findFlightForDay(WeekDays.MONDAY, flightNumbers));
		System.out.println(FlightService.findFlightForDay(WeekDays.TUESDAY, flightNumbers, 20));
	}
	
}