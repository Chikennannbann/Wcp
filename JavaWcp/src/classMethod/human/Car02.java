package classMethod.human;

public class Car02 {
	private double fuelCost;
	private double fuelAmount;
	
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	public void move(int km) {
		System.out.println(km + "km走ります");
		this.fuelAmount -= (km / fuelCost);
	}
	
	public double getFuelAmount() {
		return this.fuelAmount;
	}

}
