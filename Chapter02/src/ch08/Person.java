package ch08;

public class Person {

	int Height;
	int weight;
	int age;
	String gender;
	String name;
	
	public Person() {}
	
	public Person(int Height, int weight, int age, String gender, String name) {
		this.Height = Height;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
	}
	
	
	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String showinfo(){
		return "Ű�� "+Height+" �̰� �����԰� "+weight+" ų���� ������ �ֽ��ϴ�. �̸��� "+name+"�̰� ���̴� "+age+" �� �Դϴ�.";
	}
}
