package com.rakesh;

import com.rakesh.overridemethods.Bag;

public class BagScammer {

	public static void main(String[] args) {

		Bag ref = new Bag();
		ref.setPrice(1000f);
		ref.setSections(5);

		Bag ref1 = new Bag();
		ref1.setPrice(2000f);
		ref1.setSections(4);

		System.out.println(ref.equals(ref1));

	}

}