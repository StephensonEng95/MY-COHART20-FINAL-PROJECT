package com.qa.cohart20.productrepo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.qa.cohart20.product.Product;


import dbutils.DButils;

public class ProductRepository {     //this class contains methods to save product data and get all products in database
	public void saveProduct(Product prod) throws Exception {
		System.out.println("inside save product");   //used to test if control reaches this function when it is called in the product Controller
	    PreparedStatement pdpstmt=DButils.getConnection().prepareStatement("insert into product values(?,?,?,?)");
	    pdpstmt.setString(1, prod.getProductName());
	    pdpstmt.setString(2, prod.getProductPrice()); 
	    pdpstmt.setString(3, prod.getProductStock());
	    pdpstmt.setInt(4, prod.getProductId());
	    System.out.println("preparestamenet"+pdpstmt);
	    pdpstmt.execute();
}
public List<Product> getProducts() throws Exception {   //function to get users details on database
	
	List<Product> prod = new ArrayList<Product>();
		 
	PreparedStatement pstmt =  DButils.getConnection().prepareStatement("select * from product");
	
	ResultSet rs = pstmt.executeQuery(); 
 
	
	while(rs.next()) {      // fetching data from product table and storing into the variables
		                    //in variables below and printing them if record is found in product table
		String dbProdName = rs.getString(1);
		String dbProdPrice = rs.getString(2);
		String dbProdStock =rs.getString(3);
		int dbProdId=rs.getInt(4);
		prod.add(new Product(dbProdName,dbProdPrice,dbProdStock,dbProdId));
	}
	
	return prod; 
	
	
}
public void adminDeleteProduct(int id) throws Exception {  //function for admin to delete product by id 
	PreparedStatement dpstmt=DButils.getConnection().prepareStatement("delete from product where id=?");
	dpstmt.setInt(4, id);
    dpstmt.executeUpdate();    
	
	
}
}