package com.jlkj.web.exception;

public class LLPayBussinessException extends BussinessException {

	public LLPayBussinessException(String code, String name, String message) {
		super(code, name, message);
	}

	public LLPayBussinessException(ErrorObject error) {
		super(error);
	}

}
