package com.cjc.exception;



import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHander {
	
	
//	@ExceptionHandler(EmployeeNotFoundException.class)
//	public String EmployeeNotFoundExceptionExceptionHander(EmployeeNotFoundException e)
//	{
//		return e.getMessage();
//	}
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ApiError ConstraintViolationExceptionExceptionHander(ConstraintViolationException e,HttpServletRequest request)
	{
	ApiError error=new ApiError(HttpStatus.NOT_FOUND.value(),e.getMessage(),HttpStatus.NOT_FOUND,request.getRequestURI(),new Date());
	return error;
	}
	
}
