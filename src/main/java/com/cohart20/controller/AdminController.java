package com.cohart20.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.qa.cohart20.product.Product;
import com.qa.cohart20.productrepo.ProductRepository;
import com.qa.cohart20.user.User;
import com.qa.cohart20.user.repository.UserRepository;


@Controller
@ResponseBody
public class AdminController {  //this class contains all the API request handling from client side handled by admin
	
	@RequestMapping("productsPage")     //function to accept display products on user side request
	public String showProductPage() {
		System.out.println("Inside products page");
		return "productsPage";
	}
	
	@RequestMapping("productsPage2")     //function to accept display products on admin side request
	public String showProductPage2() {
		System.out.println("Inside products page2");
		return "productsPage2";
	}
	
	@RequestMapping("/addproduct")     //function to accept add product by admin request
		public ModelAndView putProduct(String name,String price, String stock,int id) throws Exception {
			Product product=new Product(name,"£ "+ price,stock,id);
			ModelAndView mvprod=new ModelAndView("adminPage"); 
			ProductRepository prodrepo=new ProductRepository(); 
			prodrepo.saveProduct(product);
			mvprod.addObject("prodData",product);
			return mvprod;    
		}      
	 
	@GetMapping("/productsPage")   //function to accept fetch product data and display on users side only when product button clicked request
	public ModelAndView getProduct() throws Exception {  
		List<Product> prods=new ArrayList<Product>();
		ProductRepository prodrepository=new ProductRepository(); 
		prods=prodrepository.getProducts();
		
		//prods.add((Product) (prodrepository.getProducts()));
		ModelAndView modelviewprod=new ModelAndView("productsPage"); 
		modelviewprod.addObject("dbProductData",prods);
		return modelviewprod;
	}
	
	@GetMapping("/productsPage2")   //function to accept fetch product data and displaying products on admin side only when product button clicked request
	public ModelAndView getProduct2() throws Exception {  
		List<Product> prods2=new ArrayList<Product>(); 
		ProductRepository prodrepository=new ProductRepository(); 
		prods2=prodrepository.getProducts();
		
		//prods.add((Product) (prodrepository.getProducts()));
		ModelAndView modelviewprod=new ModelAndView("productsPage2");  
		modelviewprod.addObject("dbProductData2",prods2);
		return modelviewprod;
	}
	
	
	@RequestMapping("/admindeletinguser")     //function to accept delete user by admin request
	public ModelAndView AdminDeletingUserAccount(String Username) throws Exception {
		UserRepository usrepo=new UserRepository();
		usrepo.deleteUserbyAdmin(Username);
		ModelAndView AMv=new ModelAndView("adminhasdeletedUser");
		return AMv;
		}
		 
	@GetMapping("/usersPage")     //function to accept get users and display on users page request
	public ModelAndView getUsers() throws Exception {
		List<User> users=new ArrayList<User>();
		UserRepository userrepo=new UserRepository();
		users=userrepo.getDbUsers(); 
		System.out.println("product size is"+users.size());
		//prods.add((Product) (prodrepository.getProducts()));
		ModelAndView modelviewprod=new ModelAndView("usersPage");
		modelviewprod.addObject("dbUserData",users);
		return modelviewprod;
	}
		 
	@RequestMapping("/admindeletingproduct")    //function to delete product by admin
	public ModelAndView AdminDeletingProduct(int id) throws Exception {
		ProductRepository prodrepo=new ProductRepository();
		prodrepo.adminDeleteProduct(id);
		ModelAndView AMv=new ModelAndView("productsPage"); 
		return AMv;
		}
		  
	@RequestMapping("/adminPage")    //when tthe admin clickes home button, they get redirected to adminPage
	public String getAdminPage() {
		System.out.println("inside admin page");
		
		return "adminPage";
	}
		
	}
	

