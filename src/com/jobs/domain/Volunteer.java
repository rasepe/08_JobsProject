package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	

	protected String description;


	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		if(description==null) throw new Exception();
		
		this.description=description;
	
	}

	
	@Override
	public void pay() {
		totalPaid=0;
		
	}
	

	public String getDescription() {
		return description;
	}

	
	@Override
	public String toString() {
		
		String cadena ="";

		cadena += "Id: " + getid() + "\n";
		cadena += "Name: " + getName() + "\n";
		cadena += "Address: " + getAddress() + "\n";
		cadena += "Phone: " + getPhone() + "\n";
		cadena += "Description: " +	getDescription() + "\n";

		return cadena;
		
	}
}
