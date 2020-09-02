package by.java.yakovitski.homework.lesson4.airline;

public class DepartureTime {
	private int hours;

	public DepartureTime(int hours) {
		if (hours > 24 || hours < 0) {
			System.out.println("Введено неверное время отправления для рейса");
		}
		else {
			this.hours = hours;	
		}
	}
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String toString() {
		return hours + " час(ов)" ;
	}
}
