package exercise.chap07.exployee;

import java.util.ArrayList;

public class EmployeesTest02 {

	public static void main(String[] args) {
		ArrayList<Employees> list = new ArrayList<Employees>();
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
		
//		for(int i = 0; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		// ���� for�� : Java <->Javascript
		System.out.println("------ IT�ֽ�ȸ�� �������------");
		for (Employees employees : list) {
			System.out.println(employees);
		}
		// ������ ����� ��縦 ��. �޼��� ã�Ƽ� ����������.
		list.remove(0);
		
		System.out.println("------ IT�ֽ�ȸ�� �������------");
		for (Employees employees : list) {
			System.out.println(employees);
		}
	}

}
