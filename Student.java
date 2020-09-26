package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
     System.out.println("Student Name : Ranjana");

	}
	
	public void studentDept() {
		
		System.out.println("Dept is : CSE");

	}
	
	public void studentID() {
		
		System.out.println("23");

	}
	
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.studentDept();
		stu.studentName();
		stu.studentID();

	}

}
