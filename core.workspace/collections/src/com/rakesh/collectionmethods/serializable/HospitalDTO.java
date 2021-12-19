package com.rakesh.collectionmethods.serializable;

import java.io.Serializable;

public class HospitalDTO implements Serializable{
	
	private String name,location;

	
	public HospitalDTO(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public int hashCode() {
		return 27;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj != null) {
			
			if (obj instanceof HospitalDTO) {
				HospitalDTO ref = (HospitalDTO) obj;
				
			 String tempname=ref.getName();
			 String templocation=ref.getLocation();
				if (name.equals(tempname)&&location.equals(templocation)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "HospitalDTO [name=" + name + ", location=" + location + "]";
	}
	
	
	
	
	
	
	

}
