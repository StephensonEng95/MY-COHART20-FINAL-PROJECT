package com.cohart20.controller;

import java.sql.PreparedStatement;






import java.sql.SQLException;


import org.springframework.stereotype.Controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qa.cohart20.admin.Admin; 
import com.qa.cohart20.user.User;
import com.qa.cohart20.user.service.UserService;

import dbutils.DButils;  
  
        
 
 
@Controller   
public class HomeController {   //this class contains API request from client side and handles them in the home controller
	@RequestMapping("/")                      
	public String getLogin() {                
		System.out.println("inside login");
	 
		return "home";   
	}
	
	 
	
	
	
	@RequestMapping("/registrationPage")  //function to accept display registation page request
	public String registration() throws Exception { 
		
	
		System.out.println("inside registration");
		return "registrationPage";
	} 
	
	@RequestMapping("/register")  //function to accept account creation by admin and user request
	public String register(String username,String password,String firstName,String lastName,String email,String role) throws SQLException, Exception {
	
		if(role.equals("Admin")) { 
		System.out.println(username+password+firstName+lastName+email+role);
		PreparedStatement rpstmt=DButils.getConnection().prepareStatement("insert into admin values(?,?,?,?,?,?)");
		rpstmt.setString(1, username);
		rpstmt.setString(2,password);
		rpstmt.setString(3,firstName); 
		rpstmt.setString(4,lastName);
		rpstmt.setString(5,email); 
		rpstmt.setString(6, role);
		rpstmt.execute();
		}
		else if(role.equals("User")){
			User us=new User(); 
			us.setAccountBalance("£ 100");
			System.out.println(username+password+firstName+lastName+email+role);
			PreparedStatement rpstmt=DButils.getConnection().prepareStatement("insert into user values(?,?,?,?,?,?,?)");
			rpstmt.setString(1, username);
			rpstmt.setString(2,password);
			rpstmt.setString(3,firstName);
			rpstmt.setString(4,lastName); 
			rpstmt.setString(5,email);
			rpstmt.setString(6, role);
			rpstmt.setString(7, us.getAccountBalance());
			rpstmt.execute();
		}
		return "home";  
	} 
	@RequestMapping("/login")  // function to accept account login request
	public ModelAndView grantUserAccess(String username,String password) throws Exception {
		User user=null;
		Admin admin=null;
		UserService userserv=new UserService(); 
		user=userserv.validateUser(username, password);
		admin=userserv.validateAdmin(username, password);
		if(user!=null) {
		System.out.println(user.getFirstName()+user.getPassword()+user.getUsername()+user.getLastName());
		ModelAndView mv=new ModelAndView("userwelcomePage");
		mv.addObject("userData", user);  
		return mv;   
		} 
		if(admin!=null) {
			System.out.println(admin.getFirstName()+admin.getPassword()+admin.getUsername()+admin.getLastName());
			ModelAndView mv1=new ModelAndView("adminPage");
			mv1.addObject("adminData", admin);  
			return mv1; 
		}   
		else {   
			ModelAndView mv2=new ModelAndView(); 
		    mv2.setViewName("home"); 
		    return mv2;
	} 
	
}
	@RequestMapping("/contactusPage")  //function to accept contact us page display request
	 public String contactPage() throws Exception{
		 System.out.println("inside contact us page");
		 return "contactusPage";
	 }
	
}

