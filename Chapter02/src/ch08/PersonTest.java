package ch08;

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		Person Lee = new Person();
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("������ �Է����ּ��� : ");String gender = scan.nextLine();
		Lee.setGender(gender);
		System.out.print("�̸��� �Է����ּ��� : ");String name = scan.nextLine();
		Lee.setName(name);
		System.out.print("���̸� �Է����ּ��� : ");int age = scan.nextInt();
		Lee.setAge(age);
		System.out.print("Ű�� �Է����ּ��� : ");int height = scan.nextInt();
		Lee.setHeight(height);
		System.out.print("�����Ը� �Է����ּ��� : ");int weight = scan.nextInt();
		Lee.setWeight(weight);
		
		System.out.println(Lee.showinfo());
		
		scan.close();
	}
}
