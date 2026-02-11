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

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}
	
}
