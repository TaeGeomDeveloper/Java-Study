package ch04;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	int bonusPoint;
	double bonusdRatio;
	
	/*
	 * public Customer() { customerGrade = "SILVER"; bonusdRatio = 0.01;
	 * 
	 * System.out.println("Customer() call");
	 * 
	 * }
	 */
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusdRatio = 0.01;		
		
		System.out.println("VIPCustomer(int, String) call");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusdRatio;
		return price;
	}
	

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName + "���� ����� " +customerGrade + "�̸�, ���ʽ� ����Ʈ�� "+ bonusPoint + "�Դϴ�.";
	}
	
	
}
