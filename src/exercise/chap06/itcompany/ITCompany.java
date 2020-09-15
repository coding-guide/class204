package exercise.chap06.itcompany;

public class ITCompany {
	// 싱글톤 패턴으로 만들어 주세요.
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
