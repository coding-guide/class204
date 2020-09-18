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
		return "사원 [사원번호=" + employeeId + ", 이름=" + employeeName + ", 전화번호="
				+ employeePhoneNumber + "]";
	}
	

}
