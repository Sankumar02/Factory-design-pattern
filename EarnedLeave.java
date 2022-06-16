package com.FactoryDesignPattern;

public class EarnedLeave implements Leave 
{
	String Leave;
	EarnedLeave(String Leave)
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
		System.out.println("If there is 12 leave in a calendar 8 keaves can ve carry forwarded and 4 leaves will be encashed");	
	}

}
