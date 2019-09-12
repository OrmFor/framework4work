package com.jlkj.web.exception;

public class SmsSendException extends BussinessException{
	
	public SmsSendException(ErrorObject error ) {
		super(error);
	}

}
