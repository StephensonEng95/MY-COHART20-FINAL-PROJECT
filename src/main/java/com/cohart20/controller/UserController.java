package com.cohart20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.qa.cohart20.user.repository.UserRepository;




@Controller
public class UserController { //this class contains all API requests by client side for user control


	@RequestMapping("/userwelcomePage")  // function to accept welcome page request
	public String getWelcome() {
		System.out.println("inside getwelcome");
		
		return "userwelcomePage";
	}
	
	@RequestMapping("/useraccountdeletePage")   //function to accept deletion of account by user request
	public String insideDeleteUser() { 
		System.out.println("inside delete user"); 
		return "useraccountdeletePage"; 
	}
	@RequestMapping("/deleteuseraccount")   //function to display account deleted on succcesful credentials by user
	public ModelAndView deletingUserAccount(String Username,String Password) throws Exception {
		UserRepository usrepo=new UserRepository();
		System.out.println("username and password is"+Username+Password);
		usrepo.deleteUser(Username,Password);
		ModelAndView dMv=new ModelAndView("userdeletedPage");
		return dMv;  
	}
	
	  
}
