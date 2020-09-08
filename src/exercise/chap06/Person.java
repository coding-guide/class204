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
		
	}
	
	public void takeSubway(Subway subway) {
		
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", age=" + age + ", money=" + money + "]";
	}
	
	

}//class
