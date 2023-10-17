package com.cjc.ServiceI;

import java.util.List;

import com.cjc.model.Employee;

public interface ServiceI {

	public Employee savedata(Employee s);

	public List<Employee>  displayAlldata();

	public void deletedata(int e);

	public Employee searchAddress(String addr);
}
