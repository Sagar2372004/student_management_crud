package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class studentDao {
	private  final String url="jdbc:mysql://localhost:3306/college";
	private  final String user= "root";
    private  final  String pass="root";
    
    private Connection getConnection()throws Exception{
    	return DriverManager.getConnection(url,user,pass);
    	
    }
    
   public void addStudent( Scanner sc) throws Exception{
	   Connection c = getConnection();
	   System.out.println("enter the id :");
	   int id=sc.nextInt();
	   System.out.println("enter the name : ");
	   String name=sc.next();
	   System.out.println("enter the age :");
	   int age =sc.nextInt();
	   System.out.println("enter the address : ");
	   String address=sc.next();
	   
  PreparedStatement stmt=c.prepareStatement("insert into student(id,name,age,address)values(?,?,?,?)");
         stmt.setInt(1, id);
         stmt.setString(2,name);
         stmt.setInt(3, age);
         stmt.setString(4, address);
	    int i=stmt.executeUpdate();
	    if(i>0) {
	    	System.out.println("student are added");
	    }else {
	    	System.out.println("student are not added");
	    }
	    
		}
	public void viewStudents( Scanner sc)throws Exception {
		Connection c = getConnection();

	PreparedStatement smp=c.prepareStatement("SELECT * FROM student ORDER BY id ASC");
	 System.out.println("ID\tName\tAge\tAddress");
	    System.out.println("-------------------------------------");

ResultSet s=smp.executeQuery();
while (s.next()) {
	System.out.println(s.getInt(1)+"\t"+s.getString(2)+"\t"+s.getInt(3)+"\t"+ s.getString(4));
}
  
   
	}
	
	public void delelestudent( Scanner sc)throws Exception {
		Connection c = getConnection();
	  System.out.println("enter the student delete id : ");
		String id=sc.next();

	PreparedStatement smt=c.prepareStatement("delete from student where id=?");
	smt.setString(1,id);
	int r =smt.executeUpdate();
	if (r>0) {
		System.out.println("this student deleted");
	}else {
		System.out.println("this student not deleted");
	}
		
	}
	public void updatestudent( Scanner sc)throws Exception{
		Connection c = getConnection();
	     System.out.println("enter the student update id :");
		String id=sc.next();
		System.out.println("enter the new name : ");
		String name=sc.next();
		
	   PreparedStatement hre=c.prepareStatement("update student set name=? where id=?");
	       hre.setString(1,name);
	       hre.setString(2,id);
	int j=   hre.executeUpdate();
	   if (j>0) {
		System.out.println("this student update");
	} else {
        System.out.println("this student not update ");
	}
		
	}
	
	}

