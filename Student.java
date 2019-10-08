package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	private Scanner in;
	private static int counter = 0;

	public Student(Scanner in) {

			this.in = in;
			System.out.print("Enter student first name: ");

			this.firstName = in.nextLine();

			System.out.print("Enter student last name: ");

			this.lastName = in.nextLine();

			System.out.print("1 Freshman \n2 Sophomore \n3 Junior \n4 Senior \nEnter student class level: ");

			this.gradeYear = in.nextInt();

			id++;

			setStudentID();
	}

	private void setStudentID() {
		this.studentID = gradeYear + "" + id;
	}

	// Enroll in courses
	public void enroll() {
		
			do {

				System.out.print("Enter course to enroll (Q to quit): ");
				in = new Scanner(System.in);
				String course = in.nextLine();

				if (!course.equals("Q")) {

					if (counter != 0) {
						courses += "\n ";
					}

					courses += course;

					counter++;
					tuitionBalance += costOfCourse;
				}

				else {
					break;
				}

			}

			while (1 != 0);
	}

	// View tuition balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}

	// Pay tuition
	public void payTuition() {
		System.out.print("Enter your payment: $");
		int payment = in.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}

	// Show status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade Level: " + gradeYear + 
				"\nStudent ID: " + studentID +  
				"\nCourses Enrolled:" + courses + 
				"\nBalance: $" + tuitionBalance;
	}
}
