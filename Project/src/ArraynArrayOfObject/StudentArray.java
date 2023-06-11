package ArraynArrayOfObject;

public class StudentArray {

	private String name;
	private int roll;
	private String gender;
	private int marks;
	private int studentNo;
	
	
	StudentArray(String name, int roll, String gender, int marks, int studentNo) {
		super();
		this.name = name;
		this.roll = roll;
		this.gender = gender;
		this.marks = marks;
		this.studentNo = studentNo;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public int getRoll() {
		return roll;
	}


	public String getGender() {
		return gender;
	}


	public int getStudentNo() {
		return studentNo;
	}
	
	
	
	
	
}
