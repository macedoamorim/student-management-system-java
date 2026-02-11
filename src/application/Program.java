package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Enrollment;
import entities.Student;
import entities.Subject;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> listStudent = new ArrayList<>();
		List<Subject> listSubject = new ArrayList<>();
		List<Enrollment> listEnrollment = new ArrayList<>();
		int option = -1;
		
		while (option != 0) {
		
			System.out.println("--- Student Management System ---");
			System.out.println();
			System.out.println("1 - Register student");
			System.out.println("2 - Register subject");
			System.out.println("3 - Enroll student");
			System.out.println("4 - Assing grade");
			System.out.println("5 - List students and averages");
			System.out.println("0 - Exit");
			System.out.println();
			System.out.print("Choose an option: ");
			option = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (option) {
				case 1:
					System.out.print("Enter student ID: ");	
					int idStudent = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter student name: ");
					String name = sc.nextLine();
					
					listStudent.add(new Student(idStudent, name));
					
					System.out.println("Student registered successfully!");
					System.out.println();
					break;
					
				case 2:
					System.out.print("Enter subject ID: ");
					int idSubject = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter subject name: ");
					String nameSubject = sc.nextLine();
					
					listSubject.add(new Subject(idSubject, nameSubject));
					
					System.out.println("Subject registered successfully!");
					System.out.println();
					break;
				
				case 3: 
					if (listStudent.isEmpty()) {
						System.out.println("No students registered yet.");
						System.out.println();
						break;
					}

					if (listSubject.isEmpty()) {
						System.out.println("No subjects registered yet.");
						System.out.println();
						break;
					}

					System.out.println("Students IDs:");
					System.out.println();
					
					for (Student std : listStudent) {
						System.out.println(std);
					}

					System.out.print("Enter student ID: ");
					int selectedStudentId = sc.nextInt();
					sc.nextLine();

					Student selectedStudent = listStudent.stream()
							.filter(x -> x.getId() == selectedStudentId)
							.findFirst()
							.orElse(null);

					if (selectedStudent == null) {
						System.out.println("Student not found.");
						System.out.println();
						break;
					}

					System.out.println();
					System.out.println("Subjects IDs:");
					for (Subject sbj : listSubject) {
						System.out.printf("%d - %s%n", sbj.getId(), sbj.getName());
					}

					System.out.print("Enter subject ID: ");
					int selectedSubjectId = sc.nextInt();
					sc.nextLine();

					Subject selectedSubject = listSubject.stream()
							.filter(x -> x.getId() == selectedSubjectId)
							.findFirst()
							.orElse(null);

					if (selectedSubject == null) {
						System.out.println("Subject not found.");
						System.out.println();
						break;
					}

					listEnrollment.add(new Enrollment(selectedStudent, selectedSubject));

					System.out.println();
					System.out.println("Enrollment completed successfully!");
					System.out.println();
					break;
				
				case 4:
					if (listStudent.isEmpty()) {
						System.out.println("No students registered yet.");
						System.out.println();
						break;
					}

					if (listSubject.isEmpty()) {
						System.out.println("No subjects registered yet.");
						System.out.println();
						break;
					}
					
					System.out.print("Enter student ID: ");
					int selectedStudentIdGrade = sc.nextInt();
					sc.nextLine();

					Student selectedStudentGrade = listStudent.stream()
							.filter(x -> x.getId() == selectedStudentIdGrade)
							.findFirst()
							.orElse(null);

					if (selectedStudentGrade == null) {
						System.out.println("Student not found.");
						System.out.println();
						break;
					}
					
					System.out.print("Enter subject ID: ");
					int selectedSubjectIdGrade = sc.nextInt();
					sc.nextLine();

					Subject selectedSubjectGrade = listSubject.stream()
							.filter(x -> x.getId() == selectedSubjectIdGrade)
							.findFirst()
							.orElse(null);

					if (selectedSubjectGrade == null) {
						System.out.println("Subject not found.");
						System.out.println();
						break;
					}
					
					System.out.print("Enter grade: ");
					double grade = sc.nextDouble();
					System.out.println();
					
					listEnrollment.add(new Enrollment(selectedStudentGrade, selectedSubjectGrade, null));
					
					System.out.println("Grade assigned successfully!");
			}
		}
			sc.close();
}
}


















