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
		return "키가 "+Height+" 이고 몸무게가 "+weight+" 킬로인 남성이 있습니다. 이름은 "+name+"이고 나이는 "+age+" 세 입니다.";
	}
}
