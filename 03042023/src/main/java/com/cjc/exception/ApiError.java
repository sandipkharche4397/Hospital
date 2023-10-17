package com.cjc.exception;



import java.util.Date;

import org.springframework.http.HttpStatus;

public class ApiError {
	
	private int statuscode;
	private String massage;
	private Date date;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	private HttpStatus statusmsg;
	private String urlpath;
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	
	public HttpStatus getStatusmsg() {
		return statusmsg;
	}
	public void setStatusmsg(HttpStatus statusmsg) {
		this.statusmsg = statusmsg;
	}
	public String getUrlpath() {
		return urlpath;
	}
	public void setUrlpath(String urlpath) {
		this.urlpath = urlpath;
	}
	public ApiError(int statuscode, String massage,  HttpStatus statusmsg, String urlpath,Date date) {
		super();
		this.statuscode = statuscode;
		this.massage = massage;
	
		this.statusmsg = statusmsg;
		this.urlpath = urlpath;
		this.date=date;
	}
public ApiError(){
	
}
}
