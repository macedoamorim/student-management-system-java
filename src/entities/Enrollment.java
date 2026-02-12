package entities;

public class Enrollment {

	private Student student;
	private Subject subject;
	private Double grade;
	
	public Enrollment(Student student, Subject subject, Double grade) {
		this.student = student;
		this.subject = subject;
		this.grade = grade;
	}

	public Enrollment(Student student, Subject subject) {
		this.student = student;
		this.subject = subject;
	}

	public Enrollment(Double grade) {
		this.grade = grade;
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

	public String toString() {
		return "Student: \n" + student.getName() +  
				"Subject: \n" + subject.getName() +
				"Grade: \n" + getGrade();
	}
	
}
