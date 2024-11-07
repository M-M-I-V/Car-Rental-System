package carrentalsystem;

public class Car {
	private String make;
	private String model;
	private int year;
	private float dailyRate;
	
	public Car(String make, String model, int year, float dailyRate) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.dailyRate = dailyRate;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void dailyRate(float dailyRate) {
		this.dailyRate = dailyRate;
	}
	
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public float getDailyRate() {
		return dailyRate;
	} 
	
	@Override
	public String toString() {
		return "Make: " + make + ", Model: " + model + ", Year: " + year + ", Daily Rate: " + dailyRate;
	}
	
}