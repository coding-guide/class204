package exercise.chap07.employee;

public class EmployeesArrayListTest {

	public static void main(String[] args) {
		
		EmployeesList empList = EmployeesList.getInstance();
		
		empList.enrollEmployees();
		
//		empList.showEmployees();
		
		empList.addEmployees(new Employees("юлеб╠т", "010-1234-1234"));
		
//		empList.showEmployees();
		empList.removeEmployees(10001);
		empList.showEmployees();

	}

}
