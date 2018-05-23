package com;

import java.util.ArrayList;

public class EmployeeDetails {
	int Id;
	String name;
	double salary;
	public EmployeeDetails(int id, String name, double salary) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static String EmployeeId(ArrayList<EmployeeDetails> data, EmployeeDetails i) {
		// TODO Auto-generated method stub
		if(data==null || i==null|| data.size()==0)
			return null;
			for(EmployeeDetails temp:data)
			{
				if(temp.getId()==i.getId())
					return i.getName();
			}
			
				return null;
			
			

		
	}
	
	

}
