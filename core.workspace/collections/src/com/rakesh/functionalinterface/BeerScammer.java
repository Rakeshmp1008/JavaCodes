package com.rakesh.functionalinterface;

public class BeerScammer {

	public static void main(String[] args) {

		BeerBrands daos=new BeerBrands();
		
	StringMatch matching=new EqualsBeer();
		boolean answer=daos.find(matching, "KingFisher");
		System.out.println(answer);
		
		StringMatch matching1=new EqualsIgnoreCaseBeerSearch();
		boolean ans1=daos.find(matching1, "kingFISHER");
		System.out.println(ans1);

	
		StringMatch matching2=new FindStartsWith();
		boolean ans2=daos.find(matching2, "Ele");
		System.out.println(ans2);

		
		StringMatch matching3=new FindEndsWith();
		boolean ans3=daos.find(matching3, "er");
		System.out.println(ans3);

	
	}

}
