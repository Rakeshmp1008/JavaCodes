package com.rakesh;

import com.rakesh.overridemethods.Shoe;

public class ShoeScammer {

	public static void main(String[] args) {

		Shoe ref = new Shoe();
		ref.setBrand("NIKE");
		ref.setGender("MALE");

		Shoe ref1 = new Shoe();
		ref1.setBrand("NIKE");
		ref1.setGender("MALE");

		System.out.println(ref.equals(ref1));
	}

}