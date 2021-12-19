package com.rakesh.functionalinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BeerBrands {

	private Collection<String> brands =new ArrayList();
	
	public BeerBrands() {
		
		this.brands.add("KingFisher");
		this.brands.add("Carlsberg");
		this.brands.add("Tuborg");
		this.brands.add("Elephant strong");
		this.brands.add("Becks ice");
		this.brands.add("Beera");
		
	}
	
	public boolean find(StringMatch match,String value) {
		
		Iterator<String> itrref=brands.iterator();
		while(itrref.hasNext()) {
			
			String element=itrref.next();
			if(match.evaluate(element, value)) {
 			 return true;
			}
			
		}
		return false;
		
	}
	
	
	
}
