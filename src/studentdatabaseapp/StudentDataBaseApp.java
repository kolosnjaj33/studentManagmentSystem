package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {

	public static void main(String[] args) {

		// How many new users we want to add
		System.out.println("How many studens do you want to add: ");
		Scanner in = new Scanner(System.in);

		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];

		// Create i number of new students
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println("------------------");
		}

		for (int i = 0; i < numOfStudents; i++) {
			System.out.println(students[i].toString());
			System.out.println("------------------");
		}

	}

}
