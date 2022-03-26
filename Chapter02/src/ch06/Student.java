package ch06;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	
	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Student() {}
	
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
		
	}
	
	public String showStudentInfo() {
		
		return studentNumber + "학생의 학번은 "+ studentNumber+"이고 ,"+grade+" 학년 입니다.";
	}
}
