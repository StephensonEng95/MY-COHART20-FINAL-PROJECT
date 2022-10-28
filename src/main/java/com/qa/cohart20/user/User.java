package com.qa.cohart20.user;

import com.qa.cohart20.admin.Admin;

public class User extends Admin{
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private String role;
	private String accountBalance;
	
	public User() {}
	
	public User(String user) {
		this.username=user;
	}
	public User(String username,String password,String firstname,String lastname,String email,String role,String accountBalance) {
		super();
		this.username=username;
		this.password=password;
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		this.role=role;
		this.accountBalance=accountBalance;
	}
	public User(String username, String firstname, String lastname, String email, String role,
			String accountBalance) {
		this.username=username;
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		this.role=role;
		this.accountBalance=accountBalance; 
	}


	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User(String lusername, String lpassword) {
		this.username=lusername;
		this.password=lpassword;
	}

	public User(String dbUsername, String dbFirstname, String dbLastname, String dbRole) {
		this.username=dbUsername;
		this.firstname=dbFirstname;
		this.lastname=dbLastname;
		this.role=dbRole;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}
	

}
