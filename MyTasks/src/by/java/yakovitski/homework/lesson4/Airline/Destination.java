package by.java.yakovitski.homework.lesson4.Airline;

public enum Destination {
	NEWYORK,
	MOSCOW,
	PARIS, 
	LONDON, 
	FRANKFURT, 
	TOKIO;
	
	public void findFlightForDestination(FlightNumber [] flightNumbers) {
		for (int i = 0; i < flightNumbers.length; i++) {
			if (Destination.this == flightNumbers[i].getDestination()) {
			System.out.println(flightNumbers[i]);	
			}
			
		}
	}
}