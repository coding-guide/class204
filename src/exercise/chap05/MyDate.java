package exercise.chap05;

import java.util.Calendar;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid;
	
	public MyDate() {
		Calendar cal = Calendar.getInstance();
		year = cal.get(Calendar.YEAR);//�⵵ ��������
		month = cal.get(Calendar.MONTH)+1;//��(0~11) ��������
		day = cal.get(Calendar.DATE);//�� ��������
		isValid = true;
	}//MyDate()
		
	public int getDay() {
		return day;
	}//getDay()
	
	public void setDay(int day) {
		this.day = day;
	}//setDay()
	
	public int getMonth() {
		return month;
	}//getMonth()
	
	public void setMonth(int month) {
		this.month = month;
	}//setMonth()
	
	public int getYear() {
		return year;
	}//getYear()
	
	public void setYear(int year) {
		this.year = year;
	}//setYear()

	@Override
	public String toString() {
		return "MyDate [" + year + "�� " + month + "�� " + day + "��]";
	}
	
}
