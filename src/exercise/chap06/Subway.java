package exercise.chap06;

public class Subway {
	public String lineNumber;
	public int passengerCount;
	public int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void pickUpPerson(int money) {
		this.money += money;
		passengerCount++;
	}

	@Override
	public String toString() {
		return "Subway [lineNumber=" + lineNumber + ", passengerCount=" + passengerCount + ", money=" + money + "]";
	}

	
	
	

}
