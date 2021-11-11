package com.rakesh.dp.dao;

import com.rakesh.dp.dto.CircusDTO;

public class CircusDAO {

	private CircusDTO[] dtos = new CircusDTO[10];
	private int tic = 0;

	public void create(CircusDTO dto) {
		if (tic < this.dtos.length && dto!=null) {
			this.dtos[this.tic++] = dto;
		} else {
			System.out.println("CRAETE METHOD IS INVALID");
		}
	}

	public void create(CircusDTO dto, int cap) {
		if (cap >= 0 && cap < this.dtos.length && dtos != null) {
			this.dtos[cap] = dto;
		} else {
			System.out.println("CREATE OVER LOADING METHOD IS INVALID");
		}
	}

	public void indexOccupied() {
		System.out.println("No of Indexes Occupied are : ".concat(String.valueOf(tic)));
	}

	public CircusDTO[] getDtos() {
		return this.dtos;
	}

	public boolean matchByOwner(String owner) {
		System.out.println("Owner name Passed : ".concat(owner));

		for (int black = 0; black < dtos.length; black++) {
			CircusDTO ref = this.dtos[black];
			if (ref != null) {
				String tempowner = ref.getOwner();
				System.out.println("Matching ".concat(tempowner));
				if (owner.equals(tempowner)) {
					System.out.println("OWNER IS FOUND");
					return true;
				} else {
					System.out.println("OWNER IS NOT FOUND");
				}
			}
		}
		return false;

	}
}