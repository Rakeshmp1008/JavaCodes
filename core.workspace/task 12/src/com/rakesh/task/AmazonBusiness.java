package com.rakesh.task;

public class AmazonBusiness {

	AmazonCartDAO dao;
	
	public  AmazonBusiness(AmazonCartDAO dao) {
		this.dao=dao;
	}
	
	public void saveCart(CartDTO cart) {
		if(cart!=null) {
			
			boolean found=dao.save(cart);
			if(found) {
				System.out.println("invoked save method in arrayAmazonDAO");
			}
			else {
				System.out.println("Not saved in cart");
			}
		}
		else {
			System.out.println("passing value is null");
		}
	}
	
	public void findByName(String name) {
		if(name!=null) {	           
			
			CartDTO cart1=dao.findByName(name);
			if(cart1!=null) {
				
				System.out.println(cart1.getName());
				System.out.println(cart1.getPrice());
				System.out.println(cart1.getItem());
				System.out.println(cart1.getQuantity());
			}
			else {
				System.out.println("Null value returning");
			}
		}
		else {
			System.out.println("PASSING VALUE IS NULL");
		}
		
	}
	
	public void displayCart() {
		
		if(dao!=null) {
			
			dao.displayAllCartDetails();
		}
	}
}