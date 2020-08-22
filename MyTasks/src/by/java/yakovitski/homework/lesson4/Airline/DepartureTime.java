package by.java.yakovitski.homework.lesson4.Airline;

public class DepartureTime {
	int time;

	public DepartureTime(int time) {
		if (time > 24 && time < 0) {
			System.out.print("Введено неверное время отправления");
		}
		else {
			this.time = time;	
		}
	}
	
	

	public int getTime() {
		return time;
	}

	public String toString() {
		return time + " o'clock" ;
	}
	
	
}
