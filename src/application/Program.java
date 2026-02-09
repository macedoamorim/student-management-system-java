package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<>();
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
					int id = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter student name: ");
					String name = sc.nextLine();
					System.out.println();
					
					list.add(new Student(id, name));
					
					System.out.println("Student registered successfully!");
					break;		
			}
		}
			sc.close();
}
}
