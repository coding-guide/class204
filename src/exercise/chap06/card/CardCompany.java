package exercise.chap06.card;

public class CardCompany {
	//
	private static int serialNumber=100001;
	
	// 본인의 인스턴스를 바로 생성해서 대입
	private static CardCompany instance = new CardCompany();
	
	// 다른 클래스에서 생성할 수 없도록 private로 선언
	private CardCompany() {
	}//CardCompany constructor
	
	public static CardCompany getInstance() {
		if(instance==null) { //방어코드
			instance = new CardCompany();
		}
		return instance;
	}
	
	public OneCard createOneCard(String userName) {
		OneCard card = new OneCard(serialNumber++, userName);
		return card;
	}
	
	public TwoCard createTwoCard(String userName) {
		TwoCard card = new TwoCard(serialNumber++,userName);
		return card;
	}

}
