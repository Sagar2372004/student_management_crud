package com.controllar;

import java.util.Scanner;

import com.service.StudentService;

public class StudentController {

	public static void  main(String[] args)throws Exception {
	Scanner sc =new Scanner(System.in);
	  StudentService p=new StudentService();
	   while (true) {
	    System.out.println("\nSelect an operation:");
	    System.out.println("1. Add Student");
	    System.out.println("2. View Students");
	    System.out.println("3. Update Student");
	    System.out.println("4. Delete Student");
	    System.out.println("5. Exit");
	    System.out.print("Enter your choice: ");

  int choice=sc.nextInt();
	switch (choice) {
	case 1:
		p.addStudent(sc);
	break;
	case 2:
		p.viewStudents(sc);
	break;
	case 3:
		p.updateStudent(sc); 
	break;
	case 4:
		p.deleteStudent(sc);
	break;
	case 5:
         System.out.println("Thank you. Exiting...");
         System.exit(0);
         break;
	default:System.out.println("invalid choice");
	break;
	} 
  }
 }
}

