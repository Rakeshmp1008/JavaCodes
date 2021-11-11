package com.rakesh.dp;

import com.rakesh.dp.dao.MetroStationDAO;
import com.rakesh.dp.dto.MetroStationDTO;

public class MetroStationStarter {

	public static void main(String[] args) {

		MetroStationDTO dtoref = new MetroStationDTO();

		dtoref.setName("JP NAGAR METRO STATION");
		dtoref.setRoute("JP NAGAR TO MEJESTIC");
		dtoref.setElevator(true);
		dtoref.setOpenTime(5.00f);
		dtoref.setCloseTime(11.30f);

		MetroStationDTO dtoref1 = new MetroStationDTO("BANSHANKARI", "JAYNAGAR TO BANSHANKARI", true, 5.00f, 11.30f);
		MetroStationDTO dtoref2 = new MetroStationDTO("KENGERI", "KENGRI TO BANSHANKARI", true, 5.00f, 11.30f);

		MetroStationDAO daoref = new MetroStationDAO();
		daoref.add(dtoref);
		daoref.add(dtoref1);

		daoref.delete(1);
		daoref.update(1, dtoref2);

		MetroStationDTO[] refdto = daoref.getDto();

		for (int call = 0; call < refdto.length; call++) {

			MetroStationDTO ref = refdto[call];
			System.out.println("...........................................................................");
			if (ref != null) {
				System.out.println(ref.getName());
				System.out.println(ref.getRoute());
				System.out.println(ref.getOpenTime());
				System.out.println(ref.getCloseTime());
				System.out.println(ref.isElevator());
			} else {
				System.out.println("EMPTY INDEX");
			}
		}

	}

}