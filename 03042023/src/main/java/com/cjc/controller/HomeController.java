package com.cjc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.ServiceI.ServiceI;
import com.cjc.model.Employee;

@CrossOrigin("*")
@RestController

public class HomeController {

	@Autowired
	ServiceI si;
	
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public ResponseEntity<Employee> saveStudent(@RequestBody Employee s) {
		
		return new ResponseEntity<Employee>(si.savedata(s), HttpStatus.CREATED); 

	}
	
	
	
	
	@RequestMapping(value = "/get",method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getdata()
	{
		List<Employee>  i=si.displayAlldata();
		return new ResponseEntity<List<Employee>>(i, HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
	public  ResponseEntity Delete(@PathVariable int id) {
		System.err.println("DELETE RECORD CALL");
		System.out.println(id);
		si.deletedata(id);
		
		return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);	
	}
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<Employee> updateStudent(@PathVariable int id,@RequestBody Employee e)
	{
		si.savedata(e);
		return new ResponseEntity<Employee>(si.savedata(e), HttpStatus.OK);
	}
	
	
	
	
	@RequestMapping(value = "/get/{addr}",method = RequestMethod.GET)
	public ResponseEntity<Employee> searchAddress(@PathVariable String addr)
	{
		Employee  emp=si.searchAddress(addr);
		
//		if(emp!=null)
//		{
			return new ResponseEntity<Employee>(emp, HttpStatus.OK);
			
//		}
//		else {
//			 throw new EmployeeNotFoundException("Employee not available");
//		}
		
		
	}
	
//	@ExceptionHandler(EmployeeNotFoundException.class)
//	public String EmployeeNotFoundExceptionExceptionHander(EmployeeNotFoundException e)
//	{
//		return e.getMessage();
//	}
	
	
	
	
	
	
	
	
	
	
}
