package exercise.chap07.employee;

public class EmployeesTest01 {

	public static void main(String[] args) {
		Employees[] employeeList = new Employees[20];
		employeeList[0] = new Employees("권용준", "010-3312-3312");
		employeeList[1] = new Employees("김재현", "010-9914-9914");
		employeeList[2] = new Employees("김준성", "010-5801-5801");
		employeeList[3] = new Employees("박건호", "010-9557-9557");
		employeeList[4] = new Employees("박성윤", "010-7193-7193");
		employeeList[5] = new Employees("강동현", "010-9533-9533");
		employeeList[6] = new Employees("강응찬", "010-2921-2921");
		employeeList[7] = new Employees("김석현", "010-2338-2338");
		employeeList[8] = new Employees("김우혁", "010-5318-5318");
		employeeList[9] = new Employees("김윤호", "010-3086-3086");
		
		System.out.println("-------IT주식회사 사원정보-------");
		
		for(int i=0; employeeList[i]!=null ;i++)
		{
			System.out.println(employeeList[i]);
		}

	}

}
