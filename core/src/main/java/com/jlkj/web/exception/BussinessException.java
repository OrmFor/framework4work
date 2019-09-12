package com.jlkj.web.exception;

import com.jlkj.web.core.StatusCode;

public class BussinessException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code ;
	
	
	private String message ;
	
	
	private String name ;


	public BussinessException(String code, String name, String message) {
		super(message);
		this.code = code;
		this.name = name;
		this.message = message;
	}
	
	public BussinessException(ErrorObject error) {
		super(error.getMessage());
		this.code = error.getCode();
		this.name = error.getName();
		this.message = error.getMessage();
	}

	public BussinessException(StatusCode error) {
		super(error.getMsg());
		this.code = error.getCode();
		this.message = error.getMsg();
	}
	
	public BussinessException(ErrorObject error, String message) {
		super(message);
		this.code = error.getCode();
		this.name = error.getName();
		this.message = message;
	}
	
	public String getCode(){
		return this.code ;
	}
	
	public String getName(){
		return this.name ;
	}

	public String getMessage(){
		return this.message ;
	}
}
