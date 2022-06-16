package com.FactoryDesignPattern;

public class CasualLeave implements Leave 
{
	String Leave;
	CasualLeave(String leave)
	{
		Leave = leave;
	}

	@Override
	public void leaveType() 
	{
		System.out.println("Type of leave apllied is "+Leave);
	}

	@Override
	public void conditionToApply() 
	{
		System.out.println("Should have minumum Leave Balance and approval from the manager");
	}

}
