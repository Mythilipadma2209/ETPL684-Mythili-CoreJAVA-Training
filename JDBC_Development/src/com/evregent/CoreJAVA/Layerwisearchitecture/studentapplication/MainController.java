package com.evregent.CoreJAVA.Layerwisearchitecture.studentapplication;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		int studentId;
		String studentName;
		int marks;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student ID : ");
		studentId=sc.nextInt();
		System.out.println(("Enter Student Name : "));
		studentName = sc.next();
		System.out.println("Enter Student Marks : ");
		marks = sc.nextInt();
		
		StudentService studentService = new StudentService();
		
		int updeateCount=studentService.addStudentService(studentId,studentName,marks);
		
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record ram Success");								
	}

}
