package com.rakesh.functionalinterface.task2;

import com.rakesh.functionalinterface.StringMatch;

public class CigaretteScammer {

	public static void main(String[] args) {

		CigaretteDAO daos=new CigaretteDAO();
		
		StringMatch match=new EqualsCigarette();
		daos.find(match, "Playerr");
		
		StringMatch match1=new EqualsIgnoreCaseCigarette();
		daos.find(match1, "LIGHTS");

		StringMatch match2=new FindStartsWithCigarette();
		daos.find(match2, "ma");

		StringMatch match3=new FindEndsWithCigarette();
		daos.find(match3, "s");

		
		
	}

}
