package com.rakesh.functionalinterface.lambda.product;

public class ProductDTO {
	
	private String product;
	private String name;
	private Float  price;
	public ProductDTO(String product, String name, Float price) {
		super();
		this.product = product;
		this.name = name;
		this.price = price;
	}
	public String getProduct() {
		return product;
	}
	@Override
	public String toString() {
		return "ProductDTO [product=" + product + ", name=" + name + ", price=" + price + "]";
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	} 
	
	

}
