package exercise.chap08.animal;

import java.util.ArrayList;

public class AnimalTest01 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Human human = new Human();
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		animal.move();
		human.move();
		tiger.move();
		eagle.move();
		System.out.println("--------------------------------");
		
		ArrayList<Animal> list = new ArrayList<>();
		list.add(new Animal()); // 다형성
		list.add(new Human());
		list.add(new Tiger());
		list.add(new Eagle());
		
		for (Animal animal2 : list) {
			animal2.move();// 다형성. 컴파일러가 알아서 어떤 클래스의 매서드인지 판단해서 호출
			// animal2는 Human타입의 객체니???
			if(animal2 instanceof Human) {
				Human h = (Human)animal2;
				h.readBook();
			}else if(animal2 instanceof Tiger) {
				Tiger t = (Tiger)animal2;
				t.hunting();
			}else if(animal2 instanceof Eagle) {
				Eagle e = (Eagle)animal2;
				e.flying();
			}
		}
	}

}
