package com.app.org.ProductObject;

public class DriverClass {
	public static void main(String[] args) {
		 DriverClass dc=new DriverClass();
		 ProductClass pc=new ProductClass();
		 
		 pc.productId=101;
		 pc.productPrice=50000.50;
		 pc.ProductName="Dell Laptop";
		 dc.print(pc);
		 
		 
	}
	void print(ProductClass p) {
		System.out.println("id of the product "+p.productId);
		System.out.println("price of the product "+p.productPrice);
		System.out.println("name of the product "+p.ProductName);
	}
}
