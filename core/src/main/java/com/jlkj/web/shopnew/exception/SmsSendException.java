package com.jlkj.web.shopnew.exception;

import com.jlkj.web.shopnew.exception.BussinessException;
import com.jlkj.web.shopnew.exception.ErrorObject;

public class SmsSendException extends BussinessException {
	
	public SmsSendException(ErrorObject error ) {
		super(error);
	}

}
