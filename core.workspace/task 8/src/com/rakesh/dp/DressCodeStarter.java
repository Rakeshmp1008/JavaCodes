package com.rakesh.dp;

import com.rakesh.dp.dao.DressCodeDAO;
import com.rakesh.dp.dto.DressCodeDTO;

public class DressCodeStarter {

	public static void main(String[] args) {

		DressCodeDTO dtoref = new DressCodeDTO();

		dtoref.setMaterial("COTTON");
		dtoref.setColor("WHITE");
		dtoref.setPrice(1200f);
		dtoref.setGender("MALE");

		DressCodeDTO dtoref1 = new DressCodeDTO("POLYSTER", "BLUE", 1500f, "MALE");
		DressCodeDTO dtoref2 = new DressCodeDTO("JERCEY", "RED", 1800f, "FEMALE");
		DressCodeDTO dtoref3 = new DressCodeDTO("NYLON", "ORANGE", 2100f, "MALE");

		DressCodeDAO daoref = new DressCodeDAO();
		daoref.addDress(dtoref1);
		daoref.addDress(dtoref2);
		daoref.addDress(dtoref3);
		daoref.addDress(dtoref);

		daoref.deletedress(3);
		daoref.updatedress(3, dtoref1);

		DressCodeDTO[] refdao = daoref.getDto();

		for (int sin = 0; sin < refdao.length; sin++) {
			DressCodeDTO ref = refdao[sin];
			System.err.println("ooooooooooooooooooooooooooooooooooo");
			if (ref != null) {
				System.out.println(ref.getMaterial());
				System.out.println(ref.getColor());
				System.out.println(ref.getPrice());
				System.out.println(ref.getGender());
			} else {
				System.out.println("EMPTY INDEX");
			}

		}

	}

}