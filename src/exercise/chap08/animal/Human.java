package exercise.chap08.animal;

public class Human extends Animal{
	@Override //�ֳ����̼�
	protected void move() {
		// TODO Auto-generated method stub
		System.out.println("����� �ɾ�ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}
