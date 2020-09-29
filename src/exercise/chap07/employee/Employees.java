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
		return "사원 [사원번호=" + employeeId + ", 이름=" + employeeName + ", 전화번호="
				+ employeePhoneNumber + "]";
	}
	

}
