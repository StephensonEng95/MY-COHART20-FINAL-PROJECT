
Localhost:8082 port 8082 is the port used to access the Application.
Java version JDK 11, must be installed in yoour Eclipse IDE to run the code.

. Either use Postman or Swagger which is configured in the Application and it will show all the available APIs to test.
Aim of the project
This project represents my journey throughout the QA Software Development botcamp, the purpose of the project was to develop an Ecommerce API which had to showcase our knowledge acquired during the 10 weeks training. We had to create a working Spring Boot API, using this to test our understanding of the following concepts shown below:S
.Agile & Project Management using (Git)

.Databases & Cloud Fundamentals (MYSQL)
.Programming fundamentals (Java)
.API Development (Spring Boot)
.API testing using Postman
#Project requirement .The code has to be fully integrated into Version Control System
. A relational databse, either locally or on cloud, which is used to persist data for the project
.A functional application 'back-end', which is written in a framework of the language mentioned above and covered during the the training (Java/Spring Boot)
.A buil (.jar) of the application, including any dependencies that it might need, produced using an Maven (integrated build tool)
A series of API calls designed with postman, use of CRUD functionalituy (Create, Read, Update, Delete)
#Tech Stack .Git Version Control System .Source Code Management: Github .Database Management System: MySQL .Core language used: Java .Api Develeopment platform: Spring .Buil tool: Maven
#Challenges and expectations How i expected the challenge to go.
What went well?/What didn't go as planned?
Possible improvements for future revisions of the project. The possible future improvement for this Shopping API will be to include testing and achieve 95% above 

coverage. I would like to include more user functionality like orders for when the user purchase a product , account balance top up when the initial account balance account granted upon sign up of the app finishes. And creation of entity relationship to accounts that share common details with the user.
#Database The database for my Spring Boot application consists of user,admin and product tables.
#API methods availability To create an account, the user has to enter their username, password, first name, last name, email address and specifiy whether they are users or admins. users have different services offered to to them like purchase product, delete their account, update their account, view products. A bonus of 100£ is given to users upon first time registration, which they can use to purchase products.
#User API .Welcome user followed by their first name, last name and role (user)
.Buy products after viewing available products displayed to them
.Delete Account details on confirmation of their username and password.
.Logout: When the user clicks the button showed in the navigation bar, they can logout of the application. #Admin API .Welcome admin followed by the credentials of the admin
.Add products: this functionality is available to Admins only who can add products to the database.
.Delete products: The admin can delete the products if manufacturer confirm total out of stock status.
.Delete user: If the admin think the user has been using the account not in the correct way, the admin can delete this user by their username.
.Logout: When the admin clicks the button showed in the navigation bar, they can logout of the application.
#Create User/Admin Sign up, this creates the user if the username doesn't exist in database - Post method #Read View users data when user has logged in, visible only to Admin -Get method
cohart20-finalproject1
#Update User updating their details #Delete Admin deleting user details User 
