package ch03;

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
		
		System.out.println("VIPCustomer(int, String) call");
	}

	public String getAgentID() {
		return agentID;
	}

}
