package by.java.yakovitski.homework.lesson3;

public class Time {
	private int seconds;
	private int minutes;
	private int hours;
	

	
	public Time(int seconds) {
		this.seconds = seconds % 60;
		this.minutes = seconds % 3600 / 60;
		this.hours = seconds / 3600;
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
	
	public  boolean equals(Time time) {
		if (this.getAllSeconds() == time.getAllSeconds()) {
			return true;
		}
		return false;

	}
	
	public void printInfo() {
		System.out.println(this.getSeconds() + this.getMinutes() * 60 + this.getHours() * 3600 + " секунд");
	}
	
	public static void main(String[] args) {
		Time timeOne = new Time(10101);
		Time timeTwo = new Time(10, 10, 8);
		
		timeOne.printInfo();
		timeTwo.printInfo();
		System.out.println(timeOne.equals(timeTwo));

	}
}
