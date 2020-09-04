package exercise.chap05;

import java.util.Calendar;

public class MyDate_jaehyun {
	private int day;
	private int month;
	private int year;
	private boolean isValid;
	
	public MyDate_jaehyun() {
		Calendar cal = Calendar.getInstance();
		year = cal.get(Calendar.YEAR);//�⵵ ��������
		month = cal.get(Calendar.MONTH)+1;//��(0~11) ��������
		day = cal.get(Calendar.DATE);//�� ��������
		isValid = true;
	}//MyDate()
	
	public MyDate_jaehyun(int day, int month, int year) {
		isValid = true;
//		this.day = day;
		setDay(day);
//		this.month = month;
		setMonth(month);
//		this.year = year;
		setYear(year);
	}//MyDate(int day, int month, int year)
		
	public int getDay() {
		return day;
	}//getDay()
	
	public void setDay(int day) {
		this.day = day;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day >=1 && day <= 31) {
//				isValid = true;
			}else {
				isValid = false;
			}
			break;
		case 2:
			if(day >=1 && day <= 28) {
//				isValid = true;
			}else {
				isValid = false;
			}
			break;
		default:
			if(day >=1 && day <= 30) {
//				isValid = true;
			}else {
				isValid = false;
			}
			break;
			
		}
		
		
	}//setDay()
	
	public int getMonth() {
		return month;
	}//getMonth()
	
	public void setMonth(int month) {
		this.month = month;
//		if(month >=1 && month <=12) {
//			isValid = true;
//		}else {
//			isValid = false;
//		}
		if(month < 1 || month > 12) {
			isValid = false;
		}
	}//setMonth()
	
	public int getYear() {
		return year;
	}//getYear()
	
	public void setYear(int year) {
		this.year = year;
		if(year >=1900 && year <=9999) {
//			isValid=true;
		}else {
			isValid=false;
		}
	}//setYear()

	@Override
	public String toString() {
		if(isValid) {
			return "MyDate [" + year + "�� " + month + "�� " + day + "��]";
		}else {
			return "MyDate [" + year + "�� " + month + "�� " + day + "��]�� ��ȿ���� ���� ��¥�Դϴ�.";
			
		}
	}

}
