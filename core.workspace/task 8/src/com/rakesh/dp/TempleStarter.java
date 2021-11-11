package com.rakesh.dp;

import com.rakesh.dp.dao.TempleDAO;
import com.rakesh.dp.dto.TempleDTO;

public class TempleStarter {

	public static void main(String[] args) {

		TempleDTO dtoref=new TempleDTO();
		
		dtoref.setName("VENKATESHWAR LAXMI NARASHIMAHA SWAMI TEMPLE");
		dtoref.setLocation("BTM");
		dtoref.setMainGod("VENKATESHWAR");
		dtoref.setPrasada(true);
		dtoref.setYestGante(2);
		
		TempleDTO dtoref1=new TempleDTO("SIDDI VINAYAKA TEMPLE","JP NAGAR","GANESHA",false,2);
		TempleDTO dtoref2=new TempleDTO("CHENNAKESHAVA TEMPLE","BELURU","VISHNU",false,1);
		TempleDTO dtoref3=new TempleDTO("MALLIKARJUN TEMPLE","SRISAILAM","SHIVA",true,5);
		TempleDTO dtoref4=new TempleDTO("SRI RANGANATHA TEMPLE","SRIRANGAPATTANA","VISHNU",true,3);
		
		TempleDAO daoref=new TempleDAO();
		daoref.addTemple(dtoref);
		daoref.addTemple(dtoref4);
		daoref.addTemple(dtoref2);
		daoref.addTemple(dtoref3);
		
		daoref.deleteTemple(2);
		daoref.updateTemple(2, dtoref1);
		
		TempleDTO[] refdao=daoref.getDto();
		
		for (int betta = 0; betta < refdao.length; betta++) {
			TempleDTO ref=refdao[betta];
			System.out.println("------------------------------------------------------");
			if(ref!=null) {
				System.out.println(ref.getName());
				System.out.println(ref.getLocation());
				System.out.println(ref.getMainGod());
				System.out.println(ref.isPrasada());
				System.out.println(ref.getYestGante());
				
			}
			else {
				System.out.println("EMPTY INDEX");
			}
			
		}
		
	}

}