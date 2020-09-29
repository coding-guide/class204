package exercise.chap07.employee;

import java.util.ArrayList;

// �������Ʈ�� �����ϴ� Ŭ����
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
		list.add(new Employees("�ǿ���", "010-3312-3312"));
		list.add(new Employees("������", "010-9914-9914"));
		list.add(new Employees("���ؼ�", "010-5801-5801"));
		list.add(new Employees("�ڰ�ȣ", "010-9557-9557"));
		list.add(new Employees("�ڼ���", "010-7193-7193"));
		list.add(new Employees("������", "010-9533-9533"));
		list.add(new Employees("������", "010-2921-2921"));
		list.add(new Employees("�輮��", "010-2338-2338"));
		list.add(new Employees("�����", "010-5318-5318"));
		list.add(new Employees("����ȣ", "010-3086-3086"));
	}//enrollEmployees()
	
	public void showEmployees() {
		System.out.println("---------------------�� �� �� ��---------------------");
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
			// ���Ǵ�� ��������ϴ� �ڵ带 �־��ְ�..
			System.out.println(employees);
			if(employees.getEmployeeId()==employeeId) {
				//removeEmp = employees;
//				System.out.println(employees.getEmployeeId());
//				�����ð��� �ذ�
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
