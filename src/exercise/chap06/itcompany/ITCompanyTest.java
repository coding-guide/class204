package exercise.chap06.itcompany;

public class ITCompanyTest {

	public static void main(String[] args) {
		ITCompany instance = ITCompany.getInstance();
		System.out.println(instance);
		ITCompany instance2 = ITCompany.getInstance();
		System.out.println(instance2);
		
		
	}

}
