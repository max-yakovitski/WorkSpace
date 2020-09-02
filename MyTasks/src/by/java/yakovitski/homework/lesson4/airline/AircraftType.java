package by.java.yakovitski.homework.lesson4.airline;

public enum AircraftType {
	AIRBUS("Аэробус"),
	BOEING("Боинг");
	
	private String ruTypeString;

	private AircraftType(String ruTypeString) {
		this.ruTypeString = ruTypeString;
	}

	public String getRuType() {
		return ruTypeString;
	}
}
