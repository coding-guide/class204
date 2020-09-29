package exercise.chap08.animal;

public class Eagle extends Animal {

	@Override
	protected void move() {
		System.out.println("날개를 펴고 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수가 쏜살같이 날라갑니다.");
	}
}
