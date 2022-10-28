package com.eclipse.cohart20.productdata;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dbutils.DButils;

public class ProductData {
	private int id;
	private String name;
	private int price;
	private int stock;
	
	public static Logger pLog=LogManager.getLogger();
	public ProductData() {};
	
	public ProductData(int prodId,String prodName,int prodPrice,int prodStock) {
		this.id=prodId;
		this.name=prodName; 
		this.price=prodPrice;
		this.stock=prodStock;
	}  
	public void addProducts() throws SQLException, Exception {
		Scanner psc=new Scanner(System.in);
		System.out.println("Enter product id");
		this.id=psc.nextInt();
		System.out.println("Enter product name");
		this.name=psc.next();
		System.out.println("Enter product price");
		this.price=psc.nextInt();
		System.out.println("Enter product units");
		this.stock=psc.nextInt();
		PreparedStatement pdpstmt=DButils.getConnection().prepareStatement("insert into product values(?,?,?,?)");
		pdpstmt.setInt(1, id );
		pdpstmt.setString(2, name);
		pdpstmt.setInt(3, price);
		pdpstmt.setInt(4, stock);
		pdpstmt.execute();
		pLog.info("Products have been added succesfully!");
		
	}

	public int getProductId() {
		return id;
	}

	public void setProductId(int id) {
		this.id = id;
	}
 
	public String getProductName() {
		return name;
	}

	public void setProductName(String name) {
		this.name = name;
	}

	public int getProductPrice() {
		return price;
	}

	public void setProductPrice(int price) {
		this.price = price;
	}

	public int getProductStock() {
		return stock;
	}

	public void setProductStock(int stock) {
		this.stock = stock;
	}
	
	
}
