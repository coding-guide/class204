package exercise.chap07.employee;

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

	
	public int getEmployeeId() {
		return employeeId;
	}


	@Override
	public String toString() {
		return "��� [�����ȣ=" + employeeId + ", �̸�=" + employeeName + ", ��ȭ��ȣ="
				+ employeePhoneNumber + "]";
	}
	

}
