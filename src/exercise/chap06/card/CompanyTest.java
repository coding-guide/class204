package exercise.chap06.card;

public class CompanyTest {

	public static void main(String[] args) {
		//getInstance()�޼���� static���� ����� �޼���
		CardCompany ins = CardCompany.getInstance();
		OneCard card1 = ins.createOneCard("�ǿ���");
		OneCard card2 = ins.createOneCard("������");
		OneCard card3 = ins.createOneCard("���ؼ�");
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
	}

}