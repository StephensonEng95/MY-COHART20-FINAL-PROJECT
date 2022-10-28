package com.qa.cohart20.user.repository;
import dbutils.DButils;




import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import com.qa.cohart20.admin.Admin;
import com.qa.cohart20.user.User;



public class UserRepository {  //class to handle user fuctionalities, saving user
	                           //data,deleting
	public void saveAdmin(Admin admin) throws Exception {
		
		PreparedStatement pstmt = DButils.getConnection().prepareStatement("insert into admin values(?, ?, ?, ?, ?,?)");

		pstmt.setString(1, admin.getUsername());
		pstmt.setString(2, admin.getPassword());
		pstmt.setString(3, admin.getFirstName()); 
		pstmt.setString(4, admin.getLastName());
		pstmt.setString(5, admin.getEmail());
		pstmt.setString(6, admin.getRole());

		pstmt.execute();
	}
	
	public void saveUser(User user) throws Exception {

		PreparedStatement pstmt = DButils.getConnection().prepareStatement("insert into user values(?, ?, ?, ?, ?,?,?)");

		pstmt.setString(1, user.getUsername());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getFirstName()); 
		pstmt.setString(4, user.getLastName());
		pstmt.setString(5, user.getEmail());
		pstmt.setString(6, user.getRole());

		pstmt.execute();
	}
	
public User validateUserCredentials(String username,String password) throws Exception {          //function to validate the user details before granting access to welcome
	                                                                                    //page	
		User user=null;
		PreparedStatement pstmt =  DButils.getConnection().prepareStatement("select * from user where username = ? and password = ?");
		
		pstmt.setString(1, username);
		pstmt.setString(2, password); 
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			String username1= rs.getString(1);
			String firstname1=rs.getString(3); 
			String lastname1=rs.getString(4);
			String email=rs.getString(5); 
			String role=rs.getString(6); 
			String accountBalance=rs.getString(7);
			System.out.println("inside validateuser"+username1+firstname1+lastname1+email+role+accountBalance); 
			user=new User(username1,firstname1,lastname1,email,role,accountBalance);
		} 
		return user;
	}
public Admin validateAdminCredentials(String username,String password) throws Exception {   //function to validate the user details before granting access to welcome
                                                                                            //page	
   Admin adm = null;	
   PreparedStatement pstmt =  DButils.getConnection().prepareStatement("select * from admin where username = ? and password = ?");

  pstmt.setString(1, username);
  pstmt.setString(2, password);  

  ResultSet rs = pstmt.executeQuery(); 

 if(rs.next()) {
	 String username1= rs.getString(1); 
	 String firstname=rs.getString(3);
	 String lastname=rs.getString(4);
	 String role=rs.getString(6); 
	 System.out.println("in repository" +" "+firstname+lastname);
	 adm = new Admin(username1,firstname,lastname,role);
}
return adm;
} 

public List<User> getDbUsers() throws Exception {   //function to get users details on database
		
		List<User> users = new ArrayList<User>();
			
		PreparedStatement pstmt =  DButils.getConnection().prepareStatement("select * from user");
		
		ResultSet rs = pstmt.executeQuery(); 
	 
		
		while(rs.next()) {      //database details being stored in variables below if record is found in database
			String dbUsername= rs.getString(1);
			String dbFirstname = rs.getString(3);
			String dbLastname =rs.getString(4);
			String dbRole=rs.getString(6);
			users.add(new User(dbUsername,dbFirstname,dbLastname,dbRole));
		}
		
		return users;
		
	}
public void deleteUser(String username,String pass) throws Exception {//function to delete user by username (uid)
		System.out.println("in repository"+username+pass);
	    PreparedStatement dpstmt=DButils.getConnection().prepareStatement("delete from user where username=? and password=?");
		dpstmt.setString(1, username);
		dpstmt.setString(2, pass);
		System.out.println("dpstmt" +dpstmt);
        dpstmt.execute();
        
}
        
		
public void deleteUserbyAdmin(String usern) throws Exception {  //function for admin to delete user by username 
	PreparedStatement dpstmt=DButils.getConnection().prepareStatement("delete from user where username=?");
	dpstmt.setString(1, usern);
    dpstmt.executeUpdate();    
	
	
}

}
