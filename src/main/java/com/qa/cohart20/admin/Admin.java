package com.qa.cohart20.admin;



public class Admin {
		
		private String username;
		private String password;
		private String firstName;
		private String lastName;
		private String email;
		private String role;
	
		
		public Admin(String username, String password) {	
			this.username=username;
			this.password=password;
		}
		public Admin() {}

		public Admin(String username, String password, String firstName, String lastName, String email,String role) {
			super();
			this.username = username;
			this.password = password; 
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.role=role;
		
		}

		public Admin(String username, String firstname, String lastname, String role) {
			this.username=username;
			this.firstName=firstname;
			this.lastName=lastname;
			this.role=role;
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

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
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

	}

