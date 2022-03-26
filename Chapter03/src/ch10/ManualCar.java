package ch10;

public class ManualCar extends Car {
	
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}
	
	public void stop() {
		System.out.println("장애물 앞에서 브레이크를 밝아서 정지합니다.");
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void washCar() {
		System.out.println("직접 세차를 합니다. ");
	}
	
	
	
}
