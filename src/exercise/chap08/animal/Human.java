package exercise.chap08.animal;

public class Human extends Animal{
	@Override //애노테이션
	protected void move() {
		// TODO Auto-generated method stub
		System.out.println("사람이 걸어갑니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
