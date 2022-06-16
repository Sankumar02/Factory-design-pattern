package com.FactoryDesignPattern;

public class LeaveApllied 
{

	public Leave getLeaveType(String leaveType) 
	{
		if(leaveType.equals("Emergency"))
			return new CasualLeave("Casual Leave");
		
		else if(leaveType.equals("Encashment"))
			return new EarnedLeave("Earned Leave");
		
		else if(leaveType.equals("Quarantine"))
			return new BCP("Business Continuous Plan");
		
		else
			return new LeaveBalance();
	}

}
