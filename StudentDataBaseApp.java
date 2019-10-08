package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {

	public static void main(String[] args) {

		// Ask how many students we want to add
		System.out.print("Enter number of new students to enroll: ");

		Scanner input = new Scanner(System.in);
		int numOfStudents = input.nextInt();
		Student[] students = new Student[numOfStudents];

		Scanner in = new Scanner(System.in);
		for (int n = 0; n < numOfStudents; n++) {

			in = new Scanner(System.in);
			students[n] = new Student(in);
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].showInfo());

		}
		in.close();
		input.close();
	}
}
