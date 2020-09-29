package exercise.chap08.animal;

public class Tiger extends Animal {
	@Override
	protected void move() {
		System.out.println("호랑이가 네발로 뛰어갑니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
