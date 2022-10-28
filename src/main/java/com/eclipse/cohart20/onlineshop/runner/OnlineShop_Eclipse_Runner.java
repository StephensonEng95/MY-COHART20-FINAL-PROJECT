package com.eclipse.cohart20.onlineshop.runner;

import java.sql.PreparedStatement; 


import java.sql.SQLException;
import dbutils.DButils;

import java.sql.ResultSet;  
import java.util.Scanner;
 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.eclipse.userdata.UserData;  
 
public class OnlineShop_Eclipse_Runner {
	public static Logger LOGGER= LogManager.getLogger();
	public static void main(String[] args) throws SQLException, Exception {
		ResultSet vRs; 
		ResultSet lrs;
		int passCount;
		UserData usd=new UserData(); 
		Scanner sc=new Scanner(System.in); 
		boolean programOn=true; 
		while(programOn) { 
			System.out.println("               Welcome to Traviu Online shopping App            ");
			System.out.println();
			System.out.println("Select 1 to register    Select 2 to login    Select 0 to logout");  //main menu
			int menuInput=sc.nextInt();
			switch(menuInput) { 
			case 1:
				boolean registerComplete=true;
				while(registerComplete) {
					System.out.println("Select 3 to register as Admin         4 to register as User"); //registration as user or Admin selection
					int registerInput=sc.nextInt();
					switch(registerInput) {
					case 3:                             //getting credentials from admin  
						usd.Askuserfunc("Admin");
						registerComplete=false;
						programOn=false;
					break;                               
					
					case 4: 
						usd.Askuserfunc("User");   //getting credentials from user
						registerComplete=false;    //registration cycle ends if user or admin have registered 
						programOn=false;
						
					break;
					}  
				}
			break;
				
				
			 
			case 2: 
				boolean loginComplete=true;     //login loop, it will keep running until login has been successful
				do {
					System.out.println("Please enter your username");  
				    String newUsername=sc.next();
				    System.out.println("Now enter your password"); 
				    String newPassword=sc.next();
				    System.out.println("Now enter your first name please");
				    String newFirstName=sc.next();
				    PreparedStatement lpstmt=null;
				    lpstmt=DButils.getConnection().prepareStatement("select* from user where username=? and password=? and firstname=?");   //selecting from user table in database to store                                                                                                                 //in credentials
				    lpstmt.setString(1, newUsername);
				    lpstmt.setString(2,newPassword);
				    lpstmt.setString(3,newFirstName);
				    lrs=lpstmt.executeQuery();
				    if(lrs.next() && newUsername.equals(lrs.getString(1))&&newPassword.equals(lrs.getString(2))&&newFirstName.equals(lrs.getString(3))&&lrs.getString(6).equals("User")) {
				    	LOGGER.info("Login as User successfully!");
				        loginComplete=false;
				    	programOn=false; 
				    	
				    } 
				    else if (lrs.next()&& newUsername.equals(lrs.getString(1))&&newPassword.equals(lrs.getString(2))&&newFirstName.equals(lrs.getString(3))
				    		&& lrs.getString(6).equals("Admin")) { 
				    	LOGGER.info("Login as User succesfully!");
				        loginComplete=false;
				    	programOn=false;
				    	
				    }
				if(lrs.next()&&lrs.getString(6).equals("User")) {
					System.out.println("Welcome to uour account"+" "+lrs.getString(1)+lrs.getString(6));
				   	System.out.println("Do you wish to view the available products in stock?    Y for yes or N for no");
					String viewInput=sc.next();
				    if(viewInput.equalsIgnoreCase("Y")){
				    	PreparedStatement vpstmt=DButils.getConnection().prepareStatement("select * from product");
					    vRs=vpstmt.executeQuery();
					    while(vRs.next()) {
				         	System.out.println("These are the available products in stock"+vRs.getString(1)+vRs.getString(2)+vRs.getString(3)+vRs.getString(4));
			       	    	loginComplete=false;
				   	    	programOn=false;
				   	    	break;
						    }
				    } 
				    }
				 if(lrs.next()&&lrs.getString(6).equals("Admin")) {
					 System.out.println("please add product details to products, press a to add.Product id,name,price and stock to add!");
					 String addProdInput=sc.next();
					 PreparedStatement adpstmt=DButils.getConnection().prepareStatement("insert into product values(?,?,?,?)");
					 ResultSet addRs=adpstmt.executeQuery();
					 if(addProdInput.equalsIgnoreCase("a")) {
						 if(addRs.next()) {
							 adpstmt.execute();
							 loginComplete=false;
							 programOn=false;
							 break;
						   }
						 }
				    }
				            
				   for(passCount=0;passCount<3;++passCount) {         //counting attempts of password failure and locking account if
					   if(passCount!=3)                               //account holder has forgotten their password
						   continue;
					   if(!lrs.next() && passCount==3) {
				        	LOGGER.debug("Account locked");
				        	System.out.println("Do you wish to create new password?      Y for Yes");    //asking account holder if they wish to update their password
				        	String passReset=sc.next();
				        	if(passReset.equalsIgnoreCase("Y")) {
				        		System.out.println("Enter your username again please");
				        		String updUsername=sc.next();
				        		System.out.println("Enter your role");
				        		String updRole=sc.next();
				        		System.out.println("Now enter your new password");
				        		String updatePass=sc.next();
				        		PreparedStatement upstmt=DButils.getConnection().prepareStatement("update from user set password=? where username=? and role=?");//updating user table
				        		upstmt.setString(1, updUsername);                                                                                                //with new password
				        		upstmt.setString(2, updatePass);
				        		upstmt.setString(6,updRole);
				        		ResultSet urs=upstmt.executeQuery();
				        		if(urs.next()) {
				        			upstmt.execute();
				        			loginComplete=false;
				        			programOn=false;
				        		}
				        		
				        	}
				        }
				    }
				   
				   
				}while(loginComplete!=false);
			break;
			case 0:
				LOGGER.info("Logged out");
				programOn=false;
			break;
			default:
				System.out.println("Inavlid input");  //if input is invalid at main menu stage,account holder is asked if they wish to go back to main menu
				System.out.println("Do you wish to return t main menu?    Y for yes or N for no");
			    String returnInput=sc.next();
			    if(returnInput.equalsIgnoreCase("y")) {}    //if answer is yes then account holder is brought back to main menu 
			   break;
			    }
			    	
			    	
			    
			}
			    
		}
}
	

	
		


