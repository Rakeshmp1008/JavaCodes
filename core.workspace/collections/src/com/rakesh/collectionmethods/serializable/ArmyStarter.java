package com.rakesh.collectionmethods.serializable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArmyStarter {

	public static void main(String[] args) {

		ArmyDTO dtos1=new ArmyDTO("INDIA", 1300000);
		ArmyDTO dtos2=new ArmyDTO("", 1300000);
		ArmyDTO dtos3=new ArmyDTO("INDIA", 1300000);
		ArmyDTO dtos4=new ArmyDTO("INDIA", 1300000);
		ArmyDTO dtos5=new ArmyDTO("INDIA", 1300000);

		Set<ArmyDTO> setref=new HashSet();
		setref.add(dtos1);
		setref.add(dtos1);
		setref.add(dtos2);
		setref.add(dtos3);
		setref.add(dtos4);
		setref.add(dtos5);
		
		System.out.println(setref.size());
		Iterator<ArmyDTO> itrref=setref.iterator();
		
		while (itrref.hasNext()) {
			ArmyDTO element = itrref.next();
			System.out.println(element);
			
		}
		
		

	}

}
