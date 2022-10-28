package com.eclipse.cohart20.logindata;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import dbutils.DButils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginDataEclipse {
	private String lUsername;
	private String lPassword;
	 
public LoginDataEclipse() {}; 
	 
public String getlUsername() {
		return lUsername;
	}

public String getlPassword() {
		return lPassword;
	}
	
public void loggedIn() throws SQLException, Exception {
	
	final Logger Log=LogManager.getLogger();
	Scanner lsc=new Scanner(System.in);
	System.out.println("Enter your username");
	this.lUsername=lsc.next();
	System.out.println("Now enter your password");
	this.lPassword=lsc.next();
	int loginAttempt=0;
	boolean loginComplete=true;
	while(loginComplete) {
		LoginDataEclipse ld=new LoginDataEclipse();
		PreparedStatement lpstmt=null;
		lpstmt=DButils.getConnection().prepareStatement("select* from user where username=? and password=?");
	    lpstmt.setString(1,ld.getlUsername() );
	    lpstmt.setString(2, ld.getlPassword());
	    ResultSet lrs=null;
	    lrs=lpstmt.executeQuery();
	    for(;loginAttempt<3;loginAttempt++) {
	    	if((lrs.next() &&ld.getlUsername().equals(lrs.getString(1)) &&ld.getlPassword().equals(lrs.getString(2))
	    			&& lrs.getString(5).equals("Admin")&& loginAttempt!=3)) {
		    	    loginComplete=false;
		    	    Log.info("Logged in Successfully!");
		    	    loginComplete=false; 
		    	    break;
		    	    
	    	}
	    	else if(lrs.next()&&ld.getlUsername()!=lrs.getString(1)&&ld.getlPassword()!=lrs.getString(2)&&loginAttempt!=3) {
	    		Log.debug("Login attempeted by"+" "+lrs.getString(1));
	    		loginComplete=false;
	    		break;
	    	}
	    	
	    	else if(lrs.next() &&ld.getlUsername().equals(lrs.getString(1)) &&ld.getlPassword().equals(lrs.getString(2))
	    			&& lrs.getString(5).equals("Admin")&&loginAttempt==3) {
	    		System.out.println("Do you wish to create new password?      Y for Yes or N for No");
		        	String passReset=lsc.next();
		        	char passConvert=passReset.charAt(0);
		        	if(Character.isUpperCase(passConvert)||Character.isLowerCase(passConvert)) {
		        		System.out.println("Enter your username again please");
		        		String updUsername=lsc.next();
		        		System.out.println("Now enter new password");
		        		String upPassword=lsc.next();
		        		PreparedStatement upstmt=DButils.getConnection().prepareStatement("update from user set password=? where username=?");
		        		upstmt.setString(1, updUsername);
		        		upstmt.setString(2,upPassword);
		        		ResultSet urs=upstmt.executeQuery();
		        		if(urs.next()) {
		        			upstmt.execute();
		        			Log.info("Password updated succesfully!");
		        			loginComplete=false;
		        			
		        			continue;
		        	}
		        	}
	    	}
		        	}
		}
		 
	}
}

