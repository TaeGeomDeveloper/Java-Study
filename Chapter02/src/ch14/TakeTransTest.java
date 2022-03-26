package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		boolean x = num1++ <= 10 || num2++ <= 20  || num3++ <= 30;
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);

		Bus bus100 = new Bus(100); 
		Bus bus500 = new Bus(500);
		
		studentJ.takeBus(bus100);
	
		Subway greenSubway = new Subway(2);
		studentT.takeSubway(greenSubway);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusinfo();
		greenSubway.showBusinfo();
		
		System.out.println(x + " , " + num1+" , "+num2+","+num3);
		
	}

}
