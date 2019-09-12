package com.jlkj.web.shopnew.exception;

import com.jlkj.web.shopnew.exception.BussinessException;
import com.jlkj.web.shopnew.exception.ErrorObject;

public class LLPayBussinessException extends BussinessException {

	public LLPayBussinessException(String code, String name, String message) {
		super(code, name, message);
	}

	public LLPayBussinessException(ErrorObject error) {
		super(error);
	}

}
