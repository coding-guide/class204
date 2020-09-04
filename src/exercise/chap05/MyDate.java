package exercise.chap05;

import java.util.Calendar;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid;
	
	public MyDate() {
		Calendar cal = Calendar.getInstance();
		year = cal.get(Calendar.YEAR);//년도 가져오기
		month = cal.get(Calendar.MONTH)+1;//월(0~11) 가져오기
		day = cal.get(Calendar.DATE);//일 가져오기
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
		return "MyDate [" + year + "년 " + month + "월 " + day + "일]";
	}
	
}
