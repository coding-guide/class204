package exercise.chap07.exployee;

public class Employees {
	private static int serialNumber=10001;
	public int employeeId;
	public String employeeName;
	public String employeePhoneNumber;
	
	public Employees(String name, String phoneNumber) {
		employeeId = serialNumber++;
		employeeName = name;
		employeePhoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "��� [�����ȣ=" + employeeId + ", �̸�=" + employeeName + ", ��ȭ��ȣ="
				+ employeePhoneNumber + "]";
	}
	

}
