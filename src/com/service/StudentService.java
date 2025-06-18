package com.service;


import java.util.Scanner;

import com.dao.studentDao;

public class StudentService {
	
	private studentDao dao = new studentDao();
	
    	    public void addStudent(Scanner sc) throws Exception {
    	        dao.addStudent(sc);
    	    }

    	    public void viewStudents(Scanner sc) throws Exception {
    	        dao.viewStudents(sc);
    	    }

    	    public void updateStudent(Scanner sc) throws Exception {
    	        dao.updatestudent(sc);
    	    }

    	    public void deleteStudent(Scanner sc) throws Exception {
    	        dao.delelestudent(sc);
    	    }

			

			
    	    
     }
