package chapter13.sec01.exam07;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (name.equals(student.name)) && (sno == student.sno);
		} else {
			return false;
		}
	}
	
	
}
