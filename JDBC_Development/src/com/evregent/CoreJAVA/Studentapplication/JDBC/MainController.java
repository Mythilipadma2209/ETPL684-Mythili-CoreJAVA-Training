package com.evregent.CoreJAVA.Studentapplication.JDBC;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		int studentId = 0;
		String studentName = "";
		float studentMarks = 0;

		Scanner sin = new Scanner(System.in);

		System.out.println("Enter Student ID :");
		studentId = sin.nextInt();
		System.out.println("Enter Student Name :");
		studentName = sin.next();
		System.out.println("Enter Student Marks : ");
		studentMarks = sin.nextFloat();

		StudentService studentService = new StudentService();
		int updateCount = studentService.addStudentService(studentId, studentName, studentMarks);

		System.out.println("Inserted : " + updateCount + " record successfully");
	}
}
