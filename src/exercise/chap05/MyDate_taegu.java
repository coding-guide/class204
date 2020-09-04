package exercise.chap05;

import java.util.Calendar;

public class MyDate_taegu {
	   private int day;
	   private int month;
	   private int year;
	   private boolean isValid = true;
	   
	   public MyDate_taegu () {
	      Calendar cal = Calendar.getInstance();
	      year = cal.get(Calendar.YEAR);//년도 가져오기
	      month = cal.get(Calendar.MONTH)+1;//월(0~11) 가져오기
	      day = cal.get(Calendar.DATE);//일 가져오기
	      //isValid = true;
	   }//MyDate()
	   
	   public MyDate_taegu (int day, int month, int year) {
//	      this.day = day;
	      setDay(day);
//	      this.month = month;
	      setMonth(month);
//	      this.year = year;
	      setYear(year);
	   }//MyDate(int day, int month, int year)
	      
	   public int getDay() {
	      return day;
	   }//getDay()
	   
	   public void setDay(int day) {
	      this.day = day;
	      
	      boolean isValid_temp;
	      
	      switch(month) {
	      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	         if(day >=1 && day <= 31) {
	            isValid_temp = true;
	         }else {
	            isValid_temp = false;
	         }
	         break;
	      case 2:
	         if(day >=1 && day <= 28) {
	            isValid_temp = true;
	         }else {
	            isValid_temp = false;
	         }
	         break;
	      default:
	         if(day >=1 && day <= 30) {
	            isValid_temp = true;
	         }else {
	            isValid_temp = false;
	         }
	         break;
	         
	      }
	      
	      isTrue(isValid_temp);
	   }//setDay()
	   
	   public int getMonth() {
	      return month;
	   }//getMonth()
	   
	   public void setMonth(int month) {
	      this.month = month;
	      
	      boolean isValid_temp;
	      if(month >=1 && month <=12) {
	         isValid_temp = true;
	      }else {
	         isValid_temp = false;
	      }
	      
	      isTrue(isValid_temp);
	   }//setMonth()
	   
	   public int getYear() {
	      return year;
	   }//getYear()
	   
	   public void setYear(int year) {
	      this.year = year;
	      
	      boolean isValid_temp;
	      if(year >=1900 && year <=9999) {
	         isValid_temp=true;
	      }else {
	         isValid_temp=false;
	      }
	      
	      isTrue(isValid_temp);
	   }//setYear()

	   public void isTrue(boolean temp) {
	         if(isValid == temp && temp == true) {
	            isValid = true;
	         } else {
	            isValid = false;
	         }
	   }
	   
	   @Override
	   public String toString() {
	      if(isValid) {
	         return "MyDate [" + year + "년 " + month + "월 " + day + "일]";
	      }else {
	         return "MyDate [" + year + "년 " + month + "월 " + day + "일]로 유효하지 않은 날짜입니다.";
	         
	      }
	   }


}
