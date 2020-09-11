package exercise.chap06.card;

public class CardCompany {
	//
	private static int serialNumber=100001;
	
	// ������ �ν��Ͻ��� �ٷ� �����ؼ� ����
	private static CardCompany instance = new CardCompany();
	
	// �ٸ� Ŭ�������� ������ �� ������ private�� ����
	private CardCompany() {
	}//CardCompany constructor
	
	public static CardCompany getInstance() {
		if(instance==null) { //����ڵ�
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
