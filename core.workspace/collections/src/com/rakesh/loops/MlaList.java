package com.rakesh.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MlaList {

	public static void main(String[] args) {

		List<String> listref = new ArrayList<String>();

		listref.add("Mane Shrinivas");
		listref.add("Sanjeeva Matandoor");
		listref.add("D S Suresh");
		listref.add("Siddu Sawadi");
		listref.add("Siddu Nymagouda");
		listref.add("Anand Nyamgouda");

		System.err.println("========"+ "FOR EACH LOOP"+ "=========");
		for (String element : listref) {
			System.out.println(element);
		}
		
		System.err.println("========"+ "FOR EACH METHOD"+ "=========");
		listref.forEach((e) -> {
			System.out.println(e);
		});
		
		System.err.println("========"+ "FOR LOOP"+ "=========");
		for (int i = 0; i < listref.size(); i++) {
			String element=listref.get(i);
			System.out.println(element);
		}
		
		System.err.println("========"+ "REVERSE ORDER"+ "=========");
		ListIterator<String> itrref=listref.listIterator(listref.size());
		while(itrref.hasPrevious()) {
			String element=itrref.previous();
			System.out.println(element);
		}
	}

}
