package ch06;

public class VIPCustomer extends Customer {

	double salesRatio;
	String agentID;

	/*
	 * public VIPCustomer() { // super(); ���� Ŭ���� ȣ��
	 * 
	 * super(0, "no-name"); bonusdRatio = 0.05; salesRatio = 0.1; customerGrade =
	 * "VIP";
	 * 
	 * System.out.println("VIPCustomer() call"); }
	 */

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		salesRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";

	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusdRatio;
		price -= (int)(price * salesRatio);
		return price;
	}
	
	public String getAgentID() {
		return agentID;
	}

}
