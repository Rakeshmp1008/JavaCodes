package com.rakesh.collectionmethods.serializable;

import java.io.Serializable;

public class ChocoDTO implements Serializable{
	
	 private String brand;
	 private  float price;
	 
	 public ChocoDTO() {
		// TODO Auto-generated constructor stub
	}

	public ChocoDTO(String brand, float price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 27;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			
			if (obj instanceof ChocoDTO) {
				ChocoDTO ref = (ChocoDTO) obj;
				
				String tempbrand=ref.getBrand();
				
				if(brand.equals(tempbrand)) {
					return true;
				}
			}
			
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "ChocoDTO [brand=" + brand + ", price=" + price + "]";
	}
	
	
	
	 

}
