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
		// ���� ���ϴ�.
		if(this.age >= 19) {
			if(this.money >= 1300) {
				this.money = this.money - 1300; // this.money -= 1300;
				bus.pickUpPerson(1300);
			}else {
				System.out.println("����� �����Ͽ� ������ Ż �� �����ϴ�.");
			}
			
		}else {
			if(this.money >= 1000) {
				this.money -= 1000; // this.money = this.money - 1000;
				bus.pickUpPerson(1000);
			}else {
				System.out.println("����� �����Ͽ� ������ Ż �� �����ϴ�.");
			}
		}
	}
	
	public void takeSubway(Subway subway) {
//		���� ���ϴ�.
		if(this.age >= 19) {
			
		}else {
			
		}
		
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", age=" + age + ", money=" + money + "]";
	}
	
	

}//class
