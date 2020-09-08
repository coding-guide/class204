package exercise.chap06;

public class Bus {
	public int busNumber;
	public int passegerCount;
	public int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void pickUpPerson(int money) {
		this.money = this.money + money;
		passegerCount++;
	}

	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", passegerCount=" + passegerCount + ", money=" + money + "]";
	}
	
	
	

}
