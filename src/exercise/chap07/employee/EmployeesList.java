package exercise.chap07.employee;

import java.util.ArrayList;

// 사원리스트를 관리하는 클래스
public class EmployeesList {
	private static EmployeesList instance = new EmployeesList();
	public ArrayList<Employees> list = new ArrayList<>();
	
	private EmployeesList() {
		
	}
	
	public static EmployeesList getInstance() {
		if(instance==null) {
			instance = new EmployeesList();
		}
		return instance;
	}//getInstance()
	
	public void enrollEmployees() {
		list.add(new Employees("권용준", "010-3312-3312"));
		list.add(new Employees("김재현", "010-9914-9914"));
		list.add(new Employees("김준성", "010-5801-5801"));
		list.add(new Employees("박건호", "010-9557-9557"));
		list.add(new Employees("박성윤", "010-7193-7193"));
		list.add(new Employees("강동현", "010-9533-9533"));
		list.add(new Employees("강응찬", "010-2921-2921"));
		list.add(new Employees("김석현", "010-2338-2338"));
		list.add(new Employees("김우혁", "010-5318-5318"));
		list.add(new Employees("김윤호", "010-3086-3086"));
	}//enrollEmployees()
	
	public void showEmployees() {
		System.out.println("---------------------사 원 정 보---------------------");
		for (Employees employees : list) {
			System.out.println(employees);
		}
	}//showEmployees()

	public void addEmployees(Employees employees) {
		list.add(employees);
	}//addEmployees()
	
	public boolean removeEmployees(int employeeId) {
		boolean removed = false;
		//Employees removeEmp=null;
		for (Employees employees : list) {
			// 조건대로 사원삭제하는 코드를 넣어주고..
			System.out.println(employees);
			if(employees.getEmployeeId()==employeeId) {
				//removeEmp = employees;
//				System.out.println(employees.getEmployeeId());
//				다음시간에 해결
//				list.remove(list.indexOf(employees));
				list.remove(employees);
				removed = true;
				break;
			}
		}
		return removed;
//		if(removeEmp == null) return false;
//		else return list.remove(removeEmp);	
		
	}//removeEmployees()
	
	
}
