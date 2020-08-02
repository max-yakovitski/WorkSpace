package by.java.Yakovitski.HomeWork.lesson3;

public class Time {

	private int seconds;
	private int minutes;
	private int hours;
	

	
	public Time(int seconds) {
		this.seconds = seconds;
	}


	public Time(int seconds, int minutes, int hours) {
		this.seconds = seconds;
		this.minutes = minutes;
		this.hours = hours;
	}
	

	public int getSeconds() {
		return seconds;
	}


	public int getMinutes() {
		return minutes;
	}


	public int getHours() {
		return hours;
	}

	public int getAllSeconds () {
		return this.getSeconds() + this.getMinutes() * 60 + this.getHours() * 3600;
	}
	
	public  void timeEquals(Time time) {
		if (this.getAllSeconds() == time.getAllSeconds()) {
			System.out.println("Объекты равны");
		}
		else {
			System.out.println("Объекты не равны");
		}

	}
	
	public void getInfo() {
		System.out.println(this.getSeconds() + this.getMinutes() * 60 + this.getHours() * 3600 + " секунд");
	}
	
	public static void main(String[] args) {
		Time timeOne = new Time(101, 10, 5);
		Time timeTwo = new Time(10, 10, 8);
		
		timeOne.getInfo();
		timeTwo.getInfo();
		timeOne.timeEquals(timeTwo);

	}
	
}
