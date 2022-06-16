package com.FactoryDesignPattern;

public class BCP implements Leave 
{
	String Leave;
	BCP(String Leave)
	{
		this.Leave = Leave;
	}
	
	@Override
	public void leaveType() 
	{
		System.out.println("Type of leave apllied is "+Leave);	

	}
	@Override
	public void conditionToApply()
	{
		System.out.println("Employee should be work from home during the Quarantine");
	}

}
