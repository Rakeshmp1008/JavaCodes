package com.rakesh.collectionmethods.serializable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HospitalStarter {

	public static void main(String[] args) {

		HospitalDTO dtos1 = new HospitalDTO("Sparsh", "Chandapur");
		HospitalDTO dtos2 = new HospitalDTO("Narayana", "EC");
		HospitalDTO dtos3 = new HospitalDTO("Portis", "Silk Board");
		HospitalDTO dtos4 = new HospitalDTO("Portis", "Silk Board");
		HospitalDTO dtos5 = new HospitalDTO("Portis", "Silk Board");

		
		Set<HospitalDTO> setref = new HashSet<HospitalDTO>();
		setref.add(dtos1);
		setref.add(dtos2);
		setref.add(dtos3);
		setref.add(dtos4);
		setref.add(dtos5);

		System.out.println(setref.size());

		Iterator<HospitalDTO> itrref = setref.iterator();
		while (itrref.hasNext()) {
			HospitalDTO element = itrref.next();
			System.out.println(element);
		}

	}

}
