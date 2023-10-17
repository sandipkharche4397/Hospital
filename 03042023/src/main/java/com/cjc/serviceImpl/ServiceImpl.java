package com.cjc.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cjc.ServiceI.ServiceI;
import com.cjc.exception.EmployeeNotFoundException;
import com.cjc.model.Employee;
import com.cjc.repository.HomeRepository;

@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	HomeRepository rs;

	@Override
	public Employee savedata(Employee s) {
	
		return rs.save(s);
	}

	public List<Employee>  displayAlldata() {
		
		List<Employee>  i=rs.findAll();
		return i;
	}

	@Override
	public void deletedata(int e) {
	rs.deleteById(e);
		
	}

	@Override
	public Employee searchAddress(String addr) {
	
		Employee emp= rs.findAllByAddr(addr);
		if(emp!=null)
		{
			return emp;
			
		}
		else {
			 throw new EmployeeNotFoundException("Employee not available");
		}
	}

}
