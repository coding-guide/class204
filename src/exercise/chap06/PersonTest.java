package exercise.chap06;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person("����ȣ", 17, 10000);
		System.out.println(person);
		Bus bus = new Bus(39);
		System.out.println(bus);
		Subway subway = new Subway("�д缱");
		System.out.println(subway);
		person.takeBus(bus);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		person.takeSubway(subway);
		
		System.out.println(bus);
		System.out.println(subway);

	}

}
