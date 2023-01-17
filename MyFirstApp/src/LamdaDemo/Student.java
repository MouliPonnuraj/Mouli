package LamdaDemo;

public class Student {
	String studentName;
	int marks;
	public Student(String studentName,int marks)
	{
	this.studentName = studentName;
	this.marks = marks;
	}
	public String toString(){
		return "Student Name :"+studentName+",marks"+marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
