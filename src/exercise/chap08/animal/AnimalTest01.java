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
		list.add(new Animal()); // ������
		list.add(new Human());
		list.add(new Tiger());
		list.add(new Eagle());
		
		for (Animal animal2 : list) {
			animal2.move();// ������. �����Ϸ��� �˾Ƽ� � Ŭ������ �ż������� �Ǵ��ؼ� ȣ��
			// animal2�� HumanŸ���� ��ü��???
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
