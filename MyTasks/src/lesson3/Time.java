package lesson3;

public class Time {

	private int seconds;
	private int minutes;
	private int hours;
	
	
	
	public Time(int seconds) {
		this.hours = seconds / 3600;
		this.minutes = seconds % 3600 / 60;
		this.seconds = seconds % 3600 % 60;
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


	public void getInfo () {
		System.out.println("Секунды - " + getSeconds() + " Минуты - " + getMinutes() + " Часы - " + getHours());
	}
	
	public void timeDifference(Time time) {
		System.out.println(time.getSeconds() - this.getSeconds());
	}
	
	public static void main(String[] args) {
		Time timeOne = new Time(10000);
		Time timeTwo = new Time(200, 10, 1);
		
		timeOne.getInfo();
		timeTwo.getInfo();
		
		System.out.println(timeOne.getSeconds());
		System.out.println(timeTwo.getSeconds());
		
		timeOne.timeDifference(timeTwo);
		//тест

	}
	
}
