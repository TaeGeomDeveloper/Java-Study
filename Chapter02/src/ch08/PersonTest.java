package ch08;

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		Person Lee = new Person();
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("성별을 입력해주세요 : ");String gender = scan.nextLine();
		Lee.setGender(gender);
		System.out.print("이름을 입력해주세요 : ");String name = scan.nextLine();
		Lee.setName(name);
		System.out.print("나이를 입력해주세요 : ");int age = scan.nextInt();
		Lee.setAge(age);
		System.out.print("키를 입력해주세요 : ");int height = scan.nextInt();
		Lee.setHeight(height);
		System.out.print("몸무게를 입력해주세요 : ");int weight = scan.nextInt();
		Lee.setWeight(weight);
		
		System.out.println(Lee.showinfo());
		
		scan.close();
	}
}
