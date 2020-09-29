package exercise.chap08.customer;

public class Customer {
	private static int serialID=20401;
	protected int customerID;//고객번호 0
	protected String customerName;//고객이름 ""
	protected String customerGrade;//고객등급 ""
	protected int pricePaid;//지불금액 0
	protected int accumulatePrice; //구입한 상품가격의 누계 0
	protected int bonusPoint; //보너스포인트 0
	protected double bonusRation; //보너스 적립비율 0.0
	
	public Customer(String customerName) {
		this.customerID = serialID++;
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusRation =0.01;  // 1% ==> 0.01
	}
	
	public void payThePrice(int price) { 
//		this.accumulatePrice = this.accumulatePrice + price;
		this.accumulatePrice += price;
		//this.bonusPoint =(int)(this.bonusPoint + this.bonusPoint * this.bonusRation);
		this.bonusPoint += this.bonusPoint*this.bonusRation;
		this.pricePaid = price;
	}

	@Override
	public String toString() {
		return "[고객번호=" + customerID + ", 고객명=" + customerName + ", 고객등급="
				+ customerGrade + ", 실지불금액=" + pricePaid + ", 누적구매금액=" + accumulatePrice + ", 보너스포인트="
				+ bonusPoint + ", 보너스적립율=" + bonusRation + "]";
	}
	
	

}
