package com.FactoryDesignPattern;

public class LeaveBalance implements Leave 
{

	@Override
	public void leaveType() 
	{
		
	}

	@Override
	public void conditionToApply() 
	{
		System.out.println("There is no leave Balance");
	}

}
