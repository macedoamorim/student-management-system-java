package entities;

public class Enrollment {

	private Student student;
	private Subject subject;
	private Double grade;
	
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
