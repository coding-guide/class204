package exercise.chap06.itcompany;

public class ITCompany {
	// �̱��� �������� ����� �ּ���.
	private static ITCompany instance = new ITCompany();
	
	private ITCompany() {
		// TODO Auto-generated constructor stub
	}
	
	public static ITCompany getInstance() {
		if(instance==null) {
			instance = new ITCompany();
		}
		return instance;
	}
}
