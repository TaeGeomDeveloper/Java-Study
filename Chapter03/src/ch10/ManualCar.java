package ch10;

public class ManualCar extends Car {
	
	public void drive() {
		System.out.println("����� �����մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�.");
	}
	
	public void stop() {
		System.out.println("��ֹ� �տ��� �극��ũ�� ��Ƽ� �����մϴ�.");
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void washCar() {
		System.out.println("���� ������ �մϴ�. ");
	}
	
	
	
}
