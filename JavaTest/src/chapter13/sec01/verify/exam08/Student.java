package chapter13.sec01.verify.exam08;

public class Student {
	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// 코드 작성
		
		
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// 코드 작성
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(student.studentNum == this.studentNum) {
				return student.studentNum == studentNum && student.name.equals(name);
			} else {
				return false;
			}
		}
		return super.equals(obj);
	}
	
	
	
}
