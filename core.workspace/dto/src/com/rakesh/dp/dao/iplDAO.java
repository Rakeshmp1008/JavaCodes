package com.rakesh.dp.dao;

import com.rakesh.dp.dto.iplDTO;

public class iplDAO {

	private iplDTO[] dtos = new iplDTO[100];
	private int count = 0;

	public void create(iplDTO dto) {
		if (count < this.dtos.length && dtos != null) {

			this.dtos[this.count++] = dto;
			System.out.println("CREATE TEAM NO : ".concat(String.valueOf(count)));
		} else {
			System.out.println("CREATE METHOD IS INVALID");
		}
	}

	public iplDTO[] getDtos() {
		return dtos;
	}

	public void create(iplDTO dto, int nataka) {
		if (nataka >= 0 && nataka < this.dtos.length) {
			this.dtos[nataka] = dto;
		} else {
			System.out.println("CREATE METHOD OVERLOADIN IS INVALID");
		}
	}

	public void occupied() {
		System.out.println("OCCUPIED INDE :".concat(String.valueOf(count)));
	}

	public boolean matchByName(String name) {
		System.out.println("team Name Passed".concat(name));

		for (int deathNote = 0; deathNote < this.dtos.length; deathNote++) {
			iplDTO ref = this.dtos[deathNote];
			if (ref != null) {
				System.out.println("ref in index is  ".concat(String.valueOf(deathNote)));
				String tempName = ref.getName();
				System.out.println("Matching ".concat(tempName));
				if (name.equals(tempName)) {
					System.out.println("Team name found");
					return true;
				} else {
					System.out.println("TEAM NOT FOUND");
				}
			}
		}

		return false;

	}

}