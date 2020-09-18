package exercise.chap07.exployee;

import java.util.ArrayList;

public class EmployeesTest02 {

	public static void main(String[] args) {
		ArrayList<Employees> list = new ArrayList<Employees>();
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
		
//		for(int i = 0; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		// 향상된 for문 : Java <->Javascript
		System.out.println("------ IT주식회사 사원정보------");
		for (Employees employees : list) {
			System.out.println(employees);
		}
		// 용준이 사원이 퇴사를 함. 메서드 찾아서 지워보세요.
		list.remove(0);
		
		System.out.println("------ IT주식회사 사원정보------");
		for (Employees employees : list) {
			System.out.println(employees);
		}
	}

}
