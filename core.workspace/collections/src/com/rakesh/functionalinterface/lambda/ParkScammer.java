package com.rakesh.functionalinterface.lambda;

public class ParkScammer {

	public static void main(String[] args) {

		AmusementParkDAO dao=new AmusementParkDAO();
		
		AmusementParkDTO dtocompare=new AmusementParkDTO("WONDERLA","2000","neijd");
		
		
		AmusementParkDTO found=dao.find((d1,d2)->{
			if(d1.getName().equals(d2.getName()) && d1.getTicketPrice().equals(d2.getTicketPrice()))
			{
			return d1;
			}
			return null;
		},dtocompare);
		
		
		System.out.println(found);	
	}
}

