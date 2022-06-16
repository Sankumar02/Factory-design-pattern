package com.FactoryDesignPattern;

public class HrBerryMain 
{

	public static void main(String[] args) 
	{
//		Leave obj = new CasualLeave("Casual Leave");
//		obj.leaveType();
//		obj.conditionToApply();
	
		LeaveApllied apply = new LeaveApllied();
		
		Leave oLeave = apply.getLeaveType("sdd");
		
		oLeave.leaveType();
		
		oLeave.conditionToApply();


	}

}
