package exercise.chap08.customer;

public class Customer {
	private static int serialID=20401;
	protected int customerID;//����ȣ 0
	protected String customerName;//���̸� ""
	protected String customerGrade;//����� ""
	protected int pricePaid;//���ұݾ� 0
	protected int accumulatePrice; //������ ��ǰ������ ���� 0
	protected int bonusPoint; //���ʽ�����Ʈ 0
	protected double bonusRation; //���ʽ� �������� 0.0
	
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
		return "[����ȣ=" + customerID + ", ����=" + customerName + ", �����="
				+ customerGrade + ", �����ұݾ�=" + pricePaid + ", �������űݾ�=" + accumulatePrice + ", ���ʽ�����Ʈ="
				+ bonusPoint + ", ���ʽ�������=" + bonusRation + "]";
	}
	
	

}
