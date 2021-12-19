package com.rakesh.functionalinterface.lambda.product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductDAO {

	List<ProductDTO> listref = new ArrayList<ProductDTO>();

	public ProductDAO() {

		this.listref.add(new ProductDTO("TeaPowder", "TajMahal", 800f));
		this.listref.add(new ProductDTO("Soap", "MediMix", 30f));
		this.listref.add(new ProductDTO("Pillow", "Kurlon", 350f));
		this.listref.add(new ProductDTO("Noodles", "Maggie", 10f));

	}

	public ProductDTO find(ProductFinder finder, ProductDTO value) {

		Iterator<ProductDTO> itrref = listref.iterator();

		while (itrref.hasNext()) {

			ProductDTO element = itrref.next();
			ProductDTO tempProduct = finder.search(element, value);
			
			if (tempProduct != null) {
				return element;
			}
			return null;
		}
		return null;
	}

}
