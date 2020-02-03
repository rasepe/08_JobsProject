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
	
	@Override
	public String getDescription() {
		return description;
	}

}
