package com.testapp.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;


//@Result(name="success", location = "/success.jsp")
public class CalculateAction {

	@Action(value="/calculateEMI", results= {@Result(name="success", location = "/success.jsp")})
	public String calculateEMI()
	{
		System.out.println("calculateEMI called");
		return "success";
		
	}
	
	@Action(value="/calculateEMI", results= {@Result(name="success", location = "/error.jsp")})
	
	public String calculateInterestRate()
	{
		System.out.println("calculateInterestRate called");
		return "success";
		
	}
	
	@Action(value="/calculateNish", results= {@Result(name="success", location = "/random.jsp")})
	
	public String calculateIncomeTax()
	{
		System.out.println("calculateIncomeTax called");
		return "success";
		
	}

}
