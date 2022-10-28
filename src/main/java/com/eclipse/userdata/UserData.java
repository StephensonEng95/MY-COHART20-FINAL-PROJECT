package com.eclipse.userdata;
 
import dbutils.DButils;



import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; 
public class UserData {
	public static Logger uLog=LogManager.getLogger();
	private String username;
	private String password; 
	private String firstname;
	private String lastname;
	private String email;
	 
	public UserData() {};
	
	public UserData(String username,String password,String firstname,String lastname,String email) { 
		super();
		this.username=username; 
		this.password=password;
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
	}
	
public void Askuserfunc(String details) throws Exception{
	
	PreparedStatement pstmt=null; 
	Scanner sc=new Scanner(System.in);
	boolean userInput=true; 
	while(userInput) {
		
		boolean userOccupied=true;  
		while(userOccupied) {
			System.out.println("Create username");
			this.username=sc.next();
			pstmt=DButils.getConnection().prepareStatement("select* from user where username=?");
			pstmt.setString(1, username);
			ResultSet rs=null;
			rs=pstmt.executeQuery();
			if(!rs.next())
				userOccupied=false;
			else
				System.out.println("Username already taken,choose different one please!");
			} 
		System.out.println("Create password");
		this.password=sc.next();
		System.out.println("Enter your firstname");
		this.firstname=sc.next(); 
		System.out.println("Enter your lastname");
		this.lastname=sc.next();
		System.out.println("Enter your email");
		this.email=sc.next();
		pstmt=DButils.getConnection().prepareStatement("insert into user values(?,?,?,?,?,?)");
		pstmt.setString(1,username);
		pstmt.setString(2,password);
	    pstmt.setString(3, firstname);
		pstmt.setString(4, lastname);
		pstmt.setString(5, email);
		pstmt.setString(6, details);
		pstmt.execute();
		uLog.info("Registration as" +" "+details+" "+ "Succesfull!");
	    userInput=false;                      
	    continue;
	}
}
public void setUsername(String user) {
	this.username=user;
}
public String getUsername() { 
	return username;
	}
public void setPassword(String pass) {
	this.password=pass;
}
public String getPassword() { 
	return password;
	}
public void setFirstName(String name) {
	this.firstname=name;
}
public String getFirstName() {
	return firstname;
	}
public void setLastName(String surname) {
	this.lastname=surname;
}
public String getLastName() {
	return lastname;
}

public String getEmail() { 
	return email;
	}


}
  