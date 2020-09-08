package exercise.chap06;

public class Person {
	public String personName;
	public int age;
	public int money;
	
	public Person(String personName, int age, int money) {
		this.personName = personName;
		this.age = age;
		this.money = money;
	}//Person constructor
	
	public void takeBus(Bus bus) {
		// 돈을 냅니다.
		if(this.age >= 19) {
			if(this.money >= 1300) {
				this.money = this.money - 1300; // this.money -= 1300;
				bus.pickUpPerson(1300);
			}else {
				System.out.println("요금이 부족하여 버스에 탈 수 없습니다.");
			}
			
		}else {
			if(this.money >= 1000) {
				this.money -= 1000; // this.money = this.money - 1000;
				bus.pickUpPerson(1000);
			}else {
				System.out.println("요금이 부족하여 버스에 탈 수 없습니다.");
			}
		}
	}
	
	public void takeSubway(Subway subway) {
//		돈을 냅니다.
		if(this.age >= 19) {
			
		}else {
			
		}
		
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", age=" + age + ", money=" + money + "]";
	}
	
	

}//class
