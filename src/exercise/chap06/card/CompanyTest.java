package exercise.chap06.card;

public class CompanyTest {

	public static void main(String[] args) {
		//getInstance()메서드는 static으로 선언된 메서임
		CardCompany ins = CardCompany.getInstance();
		OneCard card1 = ins.createOneCard("권용준");
		OneCard card2 = ins.createOneCard("김재현");
		OneCard card3 = ins.createOneCard("김준성");
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
	}

}
