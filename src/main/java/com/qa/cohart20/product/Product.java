package com.qa.cohart20.product;

import com.qa.cohart20.productrepo.ProductRepository;

public class Product extends ProductRepository  {
	private String name;
	private String price;
	private String stock;
	private int id;
	   
	public Product() {};
	
	public Product(String prodName,String prodPrice,String prodStock,int id) {
		this.name=prodName; 
		this.price=prodPrice;
		this.stock=prodStock;
		this.id=id;
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

	public String getProductPrice() {
		return price;
	}

	public void setProductPrice(String price) {
		this.price = price;
	}

	public String getProductStock() {
		return stock;
	}

	public void setProductStock(String stock) {
		this.stock = stock;
	}
	
}
