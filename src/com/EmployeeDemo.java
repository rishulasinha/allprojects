package com;

import java.util.ArrayList;

public class EmployeeDemo {

	public static void main(String[] args) {
		//Found ed=new Found();
		//ed.EmployeeDetails(new EmployeeDetails(1,"fgh",34500));
		ArrayList<EmployeeDetails> e=new ArrayList<EmployeeDetails>();
		//EmployeeDetails t;
		EmployeeDetails ed=new EmployeeDetails(1,"ghj",34500);
		EmployeeDetails ed1=new EmployeeDetails(2,"fgh",45000);
		e.add(ed);
		e.add(ed1);
		for(EmployeeDetails t:e)
		{
			 System.out.println(t.getId()+t.getName()+t.getSalary());
		}
		EmployeeDetails.EmployeeId(e,3);
		//Found f=new Found();
	//	EmployeeDetails.EmployeeId(e, 1);
	
		
		
				
		
	}

}
