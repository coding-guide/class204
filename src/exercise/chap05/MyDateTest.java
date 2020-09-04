package exercise.chap05;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate();//디폴트 생성자
		System.out.println(date1);
		MyDate date2 = new MyDate(25, 8, 2020);
		System.out.println(date2);
		MyDate date3 = new MyDate(52, 8, 20202);
		System.out.println(date3);
	}

}
